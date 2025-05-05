package aipersonalisedlearning.repository;

import aipersonalisedlearning.creational_patterns.builder.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, String> {
}
