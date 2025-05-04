package services;

import creational_patterns.abstractfactory.User;
import repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        // Basic validation logic
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
