package repository.filesystem;

import creational_patterns.builder.Enrollment;
import repository.EnrollmentRepository;
import java.util.*;

public class FileSystemEnrollmentRepository implements EnrollmentRepository {

    @Override
    public Enrollment save(Enrollment entity) {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }

    @Override
    public Enrollment findById(String id) {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }

    @Override
    public List<Enrollment> findAll() {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }

    @Override
    public void deleteById(String id) {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }
}
