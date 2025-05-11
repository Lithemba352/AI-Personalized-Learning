// package InMemoryRepositoryTests;

// import aipersonalisedlearning.repository.inmemory.InMemoryEnrollmentRepository;
// import aipersonalisedlearning.creational_patterns.builder.Enrollment;
// import org.junit.jupiter.api.Test;
// import java.util.Date;
// import static org.junit.jupiter.api.Assertions.*;

// public class InMemoryEnrollmentRepositoryTest {

//     @Test
//     public void testSaveAndFind() {
//         InMemoryEnrollmentRepository repo = new InMemoryEnrollmentRepository();
//         Enrollment enrollment = new Enrollment.Builder()
//                 .enrollmentId("E01")
//                 .userId("U01")
//                 .courseId("C01")
//                 .status("Active")
//                 .enrolledDate(new Date())
//                 .build();
//         repo.save(enrollment);
//         assertEquals(enrollment, repo.findById("E01"));
//     }
// }
