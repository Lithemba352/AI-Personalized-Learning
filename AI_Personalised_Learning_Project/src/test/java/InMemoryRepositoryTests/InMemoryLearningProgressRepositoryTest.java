package InMemoryRepositoryTests;

import repository.inmemory.InMemoryLearningProgressRepository;
import creational_patterns.singleton.LearningProgress;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InMemoryLearningProgressRepositoryTest {

    @Test
    public void testFindSingletonInstance() {
        InMemoryLearningProgressRepository repo = new InMemoryLearningProgressRepository();
        LearningProgress instance1 = repo.findById("anyId");
        LearningProgress instance2 = repo.findById("anotherId");

        assertSame(instance1, instance2);
    }

    @Test
    public void testFindAllReturnsSingleton() {
        InMemoryLearningProgressRepository repo = new InMemoryLearningProgressRepository();
        assertEquals(1, repo.findAll().size());
        assertSame(repo.findAll().get(0), LearningProgress.getInstance());
    }
}
