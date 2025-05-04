package services;

import creational_patterns.abstractfactory.User;
import creational_patterns.builder.Enrollment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.EnrollmentRepository;
import repository.UserRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EnrollmentServiceTest {

    private EnrollmentRepository enrollmentRepository;
    private UserRepository userRepository;
    private EnrollmentService enrollmentService;

    // Simple in-memory implementation of EnrollmentRepository for testing
    private abstract class InMemoryEnrollmentRepository implements EnrollmentRepository {
        private final List<Enrollment> enrollments = new ArrayList<>();

        @Override
        public List<Enrollment> findAll() {
            return new ArrayList<>(enrollments);
        }

        @Override
        public Enrollment findById(String id) {
            for (Enrollment e : enrollments) {
                if (e.getEnrollmentId().equals(id)) {
                    return e;
                }
            }
            return null;
        }

        @Override
        public Enrollment save(Enrollment enrollment) {
            // remove existing enrollment with same id
            enrollments.removeIf(e -> e.getEnrollmentId().equals(enrollment.getEnrollmentId()));
            enrollments.add(enrollment);
            return enrollment;
        }
    }

    // Dummy UserRepository implementation (not used in service methods)
    private abstract class DummyUserRepository implements UserRepository {
        // can be empty as userRepository is not used in tested methods
    }

    @BeforeEach
    void setUp() {
        enrollmentRepository = new InMemoryEnrollmentRepository() {
            @Override
            public void deleteById(String s) {

            }
        };
        userRepository = new DummyUserRepository() {
            @Override
            public User save(User entity) {
                return null;
            }

            @Override
            public User findById(String s) {
                return null;
            }

            @Override
            public List<User> findAll() {
                return List.of();
            }

            @Override
            public void deleteById(String id) {

            }
        };
        enrollmentService = new EnrollmentService(enrollmentRepository, userRepository);
    }

    @Test
    void testEnrollUser_SuccessfulEnrollment() {
        String userId = "user1";
        String courseId = "course1";

        Enrollment enrollment = enrollmentService.enrollUser(userId, courseId);

        assertNotNull(enrollment);
        assertEquals(userId, enrollment.getUserId());
        assertEquals(courseId, enrollment.getCourseId());
        assertEquals("Active", enrollment.getStatus());
        assertNotNull(enrollment.getEnrolledDate());

        // Enrollment is saved in repository
        Enrollment saved = enrollmentRepository.findById(enrollment.getEnrollmentId());
        assertEquals(enrollment, saved);
    }

    @Test
    void testEnrollUser_ThrowsExceptionWhenExceedsActiveLimit() {
        String userId = "user1";

        // Add 5 active enrollments for the same user
        for (int i = 0; i < 5; i++) {
            Enrollment e = new Enrollment.Builder()
                    .enrollmentId("enroll" + i)
                    .userId(userId)
                    .courseId("course" + i)
                    .status("Active")
                    .enrolledDate(new Date())
                    .build();
            enrollmentRepository.save(e);
        }

        // Attempt to add one more active enrollment - should fail
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            enrollmentService.enrollUser(userId, "courseX");
        });
        assertEquals("User cannot be enrolled in more than 5 courses.", exception.getMessage());
    }

    @Test
    void testCancelEnrollment_SuccessfulCancellation() {
        String enrollmentId = "enroll1";
        Enrollment e = new Enrollment.Builder()
                .enrollmentId(enrollmentId)
                .userId("user1")
                .courseId("course1")
                .status("Active")
                .enrolledDate(new Date())
                .build();

        enrollmentRepository.save(e);

        enrollmentService.cancelEnrollment(enrollmentId);

        Enrollment cancelled = enrollmentRepository.findById(enrollmentId);
        assertNotNull(cancelled);
        assertEquals("Cancelled", cancelled.getStatus());
        assertEquals(e.getUserId(), cancelled.getUserId());
        assertEquals(e.getCourseId(), cancelled.getCourseId());
        assertEquals(e.getEnrolledDate(), cancelled.getEnrolledDate());
    }

    @Test
    void testCancelEnrollment_ThrowsExceptionIfNotFound() {
        String enrollmentId = "nonexistent";

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            enrollmentService.cancelEnrollment(enrollmentId);
        });

        assertEquals("Enrollment not found", exception.getMessage());
    }
}