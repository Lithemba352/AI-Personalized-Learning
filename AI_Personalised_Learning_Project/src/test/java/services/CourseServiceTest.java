// package services;

// import aipersonalisedlearning.creational_patterns.factorymethod.Course;
// import aipersonalisedlearning.services.CourseService;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import aipersonalisedlearning.repository.CourseRepository;

// import java.util.List;

// import static org.junit.jupiter.api.Assertions.*;

// class CourseServiceTest {

//     private CourseRepository courseRepository;
//     private CourseService courseService;

//     // Simple in-memory implementation of CourseRepository for testing
//     private abstract class InMemoryCourseRepository implements CourseRepository {
//         private Course storedCourse;

//         @Override
//         public Course save(Course course) {
//             storedCourse = course;
//             return storedCourse;
//         }

//         @Override
//         public Course findById(String id) {
//             if (storedCourse != null && storedCourse.getCourseId().equals(id)) {
//                 return storedCourse;
//             }
//             return null;
//         }
//     }

//     @BeforeEach
//     void setUp() {
//         courseRepository = new InMemoryCourseRepository() {
//             @Override
//             public List<Course> findAll() {
//                 return List.of();
//             }

//             @Override
//             public void deleteById(String s) {

//             }
//         };
//         courseService = new CourseService(courseRepository);
//     }

//     @Test
//     void testPublishCourse_SetsStatusAndSaves() {
//         Course course = new Course("1", "Course Title", "Course Description", "Draft", "Category1");

//         Course result = courseService.publishCourse(course);

//         assertEquals("Published", result.getStatus());
//         assertEquals(course, result); // Ensure the returned course is the same as the input
//     }

//     @Test
//     void testUpdateCourse_SuccessfulUpdate() {
//         String courseId = "123";
//         Course existingCourse = new Course(courseId, "Existing Course", "Description", "Draft", "Category1");

//         // Simulate saving the existing course
//         courseRepository.save(existingCourse);

//         Course updatedCourse = new Course(courseId, "Updated Course", "Updated Description", "Updated", "Category2");

//         Course result = courseService.updateCourse(courseId, updatedCourse);

//         assertEquals(updatedCourse, result); // Ensure the returned course is the updated one
//     }

//     @Test
//     void testUpdateCourse_CourseNotFound_ThrowsException() {
//         String courseId = "123";
//         Course updatedCourse = new Course(courseId, "Updated Course", "Updated Description", "Updated", "Category2");

//         RuntimeException exception = assertThrows(RuntimeException.class, () -> {
//             courseService.updateCourse(courseId, updatedCourse);
//         });

//         assertEquals("Course not found", exception.getMessage());
//     }
// }
