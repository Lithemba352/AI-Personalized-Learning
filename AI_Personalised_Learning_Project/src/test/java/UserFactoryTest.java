import aipersonalisedlearning.creational_patterns.abstractfactory.ConcreteUserFactory;
import aipersonalisedlearning.creational_patterns.abstractfactory.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserFactoryTest {

    @Test
    public void testUserCreation() {
        ConcreteUserFactory factory = new ConcreteUserFactory();
        User user = factory.createUser("U01", "Alice", "alice@mail.com", "12345", "Student");

        System.out.println("User created: " + user.getName() + " ," + user.getRole() + " ," + user.getEmail() + " ," + user.getPassword());

        assertNotNull(user);
        assertEquals("Alice", user.getName());
        assertEquals("Student", user.getRole());
    }
}
