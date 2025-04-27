package repository.database;

import repository.CourseRepository;
import creational_patterns.factorymethod.Course;

import java.util.*;

public class DatabaseCourseRepository implements CourseRepository {

    @Override
    public Course save(Course entity) {
        throw new UnsupportedOperationException("Database storage not implemented yet.");
    }

    @Override
    public Course findById(String id) {
        throw new UnsupportedOperationException("Database storage not implemented yet.");
    }

    @Override
    public List<Course> findAll() {
        throw new UnsupportedOperationException("Database storage not implemented yet.");
    }

    @Override
    public void deleteById(String id) {
        throw new UnsupportedOperationException("Database storage not implemented yet.");
    }
}
