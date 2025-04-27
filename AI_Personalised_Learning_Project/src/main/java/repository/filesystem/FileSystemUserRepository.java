package repository.filesystem;

import repository.UserRepository;
import creational_patterns.abstractfactory.User;
import java.util.*;

public class FileSystemUserRepository implements UserRepository {

    @Override
    public User save(User entity) {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }

    @Override
    public User findById(String id) {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }

    @Override
    public List<User> findAll() {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }

    @Override
    public void deleteById(String id) {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }
}
