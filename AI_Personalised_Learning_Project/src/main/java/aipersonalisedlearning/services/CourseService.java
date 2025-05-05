package aipersonalisedlearning.services;

import aipersonalisedlearning.creational_patterns.factorymethod.Course;
import aipersonalisedlearning.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course publishCourse(Course course) {
        course.setStatus("Published");
        return courseRepository.save(course);
    }

    public Course updateCourse(String id, Course updatedCourse) {
        Optional<Course> existing = courseRepository.findById(id);
        if (existing == null) {
            throw new RuntimeException("Course not found");
        }
        // apply updates if needed (e.g., title, description, etc.)
        return courseRepository.save(updatedCourse);
    }
}
