package services;

import aipersonalisedlearning.creational_patterns.abstractfactory.User;
import aipersonalisedlearning.services.UserService;
import repository.inmemory.InMemoryUserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import aipersonalisedlearning.repository.UserRepository;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private UserRepository userRepository;
    private UserService userService;

    @BeforeEach
    void setUp() {
        userRepository = new InMemoryUserRepository();
        userService = new UserService(userRepository);
    }

    @Test
    void testRegisterUser_SuccessfulRegistration() {
        User user = new User("1", "Lilz", "nkqayi@example.com", "password123", "student");

        User registeredUser = userService.registerUser(user);

        assertNotNull(registeredUser);
        assertEquals(user.getEmail(), registeredUser.getEmail());
        assertEquals(user.getPassword(), registeredUser.getPassword());
    }

    @Test
    void testRegisterUser_MissingEmail_ThrowsException() {
        User user = new User("1", "Lilz", null, "password123", "student");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            userService.registerUser(user);
        });

        assertEquals("Email and password must be provided.", exception.getMessage());
    }

    @Test
    void testRegisterUser_MissingPassword_ThrowsException() {
        User user = new User("1", "Lilz", "nkqayi@example.com", null, "student");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            userService.registerUser(user);
        });

        assertEquals("Email and password must be provided.", exception.getMessage());
    }

    @Test
    void testLogin_SuccessfulLogin() {
        User user = new User("1", "Lilz", "nkqayi@example.com", "password123", "student");
        userService.registerUser(user);

        User loggedInUser = userService.login("nkqayi@example.com", "password123");

        assertNotNull(loggedInUser);
        assertEquals(user.getEmail(), loggedInUser.getEmail());
    }

    @Test
    void testLogin_InvalidCredentials_ThrowsException() {
        User user = new User("1", "Lilz", "nkqayi@example.com", "password124", "student");
        userService.registerUser(user);

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            userService.login("nkqayi@example.com", "wrongpassword");
        });

        assertEquals("Invalid credentials", exception.getMessage());
    }

    @Test
    void testUpdateProfile_SuccessfulUpdate() {
        User user = new User("1", "Hokage ", "hokage@example.com", "password246", "student");
        userService.registerUser(user);

        User updatedUser = new User("1", "Hokage", "hokage@example.com", "newpassword456", "student");
        userService.updateProfile(updatedUser);

        User retrievedUser = userService.login("hokage@example.com", "newpassword456");
        assertNotNull(retrievedUser);
        assertEquals("newpassword456", retrievedUser.getPassword());
    }
}