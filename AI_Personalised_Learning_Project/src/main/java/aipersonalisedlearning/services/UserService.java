package aipersonalisedlearning.services;

import aipersonalisedlearning.creational_patterns.abstractfactory.User;
import aipersonalisedlearning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
@Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        if (user.getEmail() == null || user.getPassword() == null) {
            throw new IllegalArgumentException("Email and password must be provided.");
        }

        return userRepository.save(user);
    }

    public User login(String email, String password) {
        return userRepository.findAll().stream()
                .filter(u -> u.getEmail().equals(email) && u.getPassword().equals(password))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Invalid credentials"));
    }

    public void updateProfile(User updatedUser) {
        userRepository.save(updatedUser);
    }
}
