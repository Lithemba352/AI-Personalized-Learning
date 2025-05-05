import aipersonalisedlearning.creational_patterns.factorymethod.Course;
import aipersonalisedlearning.creational_patterns.factorymethod.ConcreteCourseFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CourseFactoryTest {

    @Test
    public void testCourseCreation() {
        ConcreteCourseFactory factory = new ConcreteCourseFactory();
        Course course = factory.createCourse("C101", "Java Basics", "Intro course", "Draft", "Programming");

        System.out.println("Course Title: " + course.getTitle()); // 👈 Output
        System.out.println("Course Status: " + course.getStatus());

        assertNotNull(course);
        assertEquals("Java Basics", course.getTitle());
        assertEquals("Draft", course.getStatus());
    }
}
