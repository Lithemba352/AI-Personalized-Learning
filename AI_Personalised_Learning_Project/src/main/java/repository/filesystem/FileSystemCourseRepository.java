package repository.filesystem;

import creational_patterns.factorymethod.Course;
import repository.CourseRepository;
import java.util.*;

public class FileSystemCourseRepository implements CourseRepository {

    @Override
    public Course save(Course entity) {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }

    @Override
    public Course findById(String id) {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }

    @Override
    public List<Course> findAll() {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }

    @Override
    public void deleteById(String id) {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }
}