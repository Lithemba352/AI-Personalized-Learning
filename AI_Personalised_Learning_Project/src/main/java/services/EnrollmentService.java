package services;

import creational_patterns.builder.Enrollment;
import repository.EnrollmentRepository;
import repository.UserRepository;

import java.util.Date;
import java.util.UUID;
import java.util.Optional;

public class EnrollmentService {
    private final EnrollmentRepository enrollmentRepository;
    private final UserRepository userRepository;

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
        Optional<Enrollment> optionalEnrollment = Optional.ofNullable(enrollmentRepository.findById(enrollmentId));
        if (!optionalEnrollment.isPresent()) {
            throw new RuntimeException("Enrollment not found");
        }

        Enrollment existing = optionalEnrollment.get();

        Enrollment updated = new Enrollment.Builder()
                .enrollmentId(existing.getEnrollmentId())
                .userId(existing.getUserId())
                .courseId(existing.getCourseId())
                .status("Cancelled")
                .enrolledDate(existing.getEnrolledDate())
                .build();

        enrollmentRepository.save(updated);
    }
}
