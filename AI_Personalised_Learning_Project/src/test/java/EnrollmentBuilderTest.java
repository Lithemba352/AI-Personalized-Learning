import creational_patterns.builder.Enrollment;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class EnrollmentBuilderTest {

    @Test
    public void testValidEnrollmentBuild() {
        Enrollment enrollment = new Enrollment.Builder()
                .enrollmentId("E01")
                .userId("U01")
                .courseId("C01")
                .status("Active")
                .enrolledDate(new Date())
                .build();

        // Print out enrollment details for demonstration
        System.out.println("Enrollment created: " + enrollment);

        // Assert that the enrollment object is not null
        assertNotNull(enrollment);
    }

    @Test
    public void testMissingFields() {
        // Optional: If you add validation, then you could expect an exception.
        // For now, just checking that build() returns a non-null object even if fields are missing.
        Enrollment enrollment = new Enrollment.Builder().build();
        System.out.println("Enrollment created with missing fields: " + enrollment);
        assertNotNull(enrollment);
    }
}