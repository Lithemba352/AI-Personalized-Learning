package api;

import creational_patterns.builder.Enrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.EnrollmentService;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @GetMapping
    public List<Enrollment> getAllEnrollments() {
        return enrollmentService.getAllEnrollments();
    }

    @PostMapping
    public Enrollment createEnrollment(@RequestBody Enrollment enrollment) {
        return enrollmentService.createEnrollment(enrollment);
    }

    @PutMapping("/{id}")
    public Enrollment updateEnrollment(@PathVariable String id, @RequestBody Enrollment updatedEnrollment) {
        return enrollmentService.updateEnrollment(id, updatedEnrollment);
    }

    @PostMapping("/{id}/confirm")
    public Enrollment confirmEnrollment(@PathVariable String id) {
        return enrollmentService.confirmEnrollment(id);
    }
}
