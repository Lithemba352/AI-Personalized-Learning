package aipersonalisedlearning.services;

import aipersonalisedlearning.creational_patterns.builder.Enrollment;
import aipersonalisedlearning.repository.EnrollmentRepository;
import aipersonalisedlearning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;
import java.util.Optional;
@Service
public class EnrollmentService {
    private final EnrollmentRepository enrollmentRepository;
    private final UserRepository userRepository;
@Autowired
    public EnrollmentService(EnrollmentRepository enrollmentRepo, UserRepository userRepo) {
        this.enrollmentRepository = enrollmentRepo;
        this.userRepository = userRepo;
    }

    public Enrollment enrollUser(String userId, String courseId) {
        long activeEnrollments = enrollmentRepository.findAll().stream()
                .filter(e -> e.getUserId().equals(userId) && e.getStatus().equals("Active"))
                .count();

        if (activeEnrollments >= 5) {
            throw new RuntimeException("User cannot be enrolled in more than 5 courses.");
        }

        Enrollment enrollment = new Enrollment.Builder()
                .enrollmentId(UUID.randomUUID().toString())
                .userId(userId)
                .courseId(courseId)
                .status("Active")
                .enrolledDate(new Date())
                .build();

        return enrollmentRepository.save(enrollment);
    }

    public void cancelEnrollment(String enrollmentId) {
        Optional<Optional<Enrollment>> optionalEnrollment = Optional.ofNullable(enrollmentRepository.findById(enrollmentId));
        if (!optionalEnrollment.isPresent()) {
            throw new RuntimeException("Enrollment not found");
        }

        Optional<Enrollment> existing = optionalEnrollment.get();

        Enrollment updated = new Enrollment.Builder()
                .enrollmentId(existing.get().getEnrollmentId())
                .userId(existing.get().getUserId())
                .courseId(existing.get().getCourseId())
                .status("Cancelled")
                .enrolledDate(existing.get().getEnrolledDate())
                .build();

        enrollmentRepository.save(updated);
    }
}
