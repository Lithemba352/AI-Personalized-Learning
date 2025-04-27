package InMemoryRepositoryTests;

import repository.inmemory.InMemoryCourseRepository;
import creational_patterns.factorymethod.Course;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InMemoryCourseRepositoryTest {

    @Test
    public void testSaveAndFind() {
        InMemoryCourseRepository repo = new InMemoryCourseRepository();
        Course course = new Course("C01", "Java Basics", "Intro Course", "Draft", "Programming");
        repo.save(course);
        assertEquals(course, repo.findById("C01"));
    }

    @Test
    public void testDelete() {
        InMemoryCourseRepository repo = new InMemoryCourseRepository();
        Course course = new Course("C01", "Java Basics", "Intro Course", "Draft", "Programming");
        repo.save(course);
        repo.deleteById("C01");
        assertNull(repo.findById("C01"));
    }
}
