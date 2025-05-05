package aipersonalisedlearning.repository.filesystem;

import aipersonalisedlearning.creational_patterns.singleton.LearningProgress;
import aipersonalisedlearning.repository.LearningProgressRepository;
import java.util.*;

public class FileSystemLearningProgressRepository implements LearningProgressRepository {

    @Override
    public LearningProgress save(LearningProgress entity) {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }

    @Override
    public LearningProgress findById(String id) {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }

    @Override
    public List<LearningProgress> findAll() {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }

    @Override
    public void deleteById(String id) {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }
}
