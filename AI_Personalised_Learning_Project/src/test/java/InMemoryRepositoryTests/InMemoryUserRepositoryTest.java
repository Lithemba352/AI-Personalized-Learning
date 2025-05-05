package InMemoryRepositoryTests;

import repository.inmemory.InMemoryUserRepository;
import aipersonalisedlearning.creational_patterns.abstractfactory.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InMemoryUserRepositoryTest {

    @Test
    public void testSaveAndFind() {
        InMemoryUserRepository repo = new InMemoryUserRepository();
        User user = new User("U01", "Alice", "alice@email.com", "pass", "Student");
        repo.save(user);
        assertEquals(user, repo.findById("U01"));
    }

    @Test
    public void testDelete() {
        InMemoryUserRepository repo = new InMemoryUserRepository();
        User user = new User("U01", "Alice", "alice@email.com", "pass", "Student");
        repo.save(user);
        repo.deleteById("U01");
        assertNull(repo.findById("U01"));
    }
}
