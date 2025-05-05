package aipersonalisedlearning.repository;

import aipersonalisedlearning.creational_patterns.factorymethod.Course;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface CourseRepository extends JpaRepository<Course, String> {

}
