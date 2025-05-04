package services;

import creational_patterns.factorymethod.Course;
import repository.CourseRepository;

public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course publishCourse(Course course) {
        course.setStatus("Published");
        return courseRepository.save(course);
    }

    public Course updateCourse(String id, Course updatedCourse) {
        Course existing = courseRepository.findById(id);
        if (existing == null) {
            throw new RuntimeException("Course not found");
        }
        // apply updates if needed (e.g., title, description, etc.)
        return courseRepository.save(updatedCourse);
    }
}
