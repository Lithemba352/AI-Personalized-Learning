package aipersonalisedlearning.api;


import aipersonalisedlearning.creational_patterns.builder.Enrollment;
import aipersonalisedlearning.services.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    private final EnrollmentService enrollmentService;

    @Autowired
    public EnrollmentController(EnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
    }

    @PostMapping
    public ResponseEntity<?> enrollUser(@RequestParam String userId,
                                        @RequestParam String courseId) {
        try {
            Enrollment enrollment = enrollmentService.enrollUser(userId, courseId);
            return ResponseEntity.ok(enrollment);
        } catch (RuntimeException e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }

    @DeleteMapping("/{enrollmentId}")
    public ResponseEntity<?> cancelEnrollment(@PathVariable String enrollmentId) {
        try {
            enrollmentService.cancelEnrollment(enrollmentId);
            return ResponseEntity.ok().build();
        } catch (RuntimeException e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }
}
