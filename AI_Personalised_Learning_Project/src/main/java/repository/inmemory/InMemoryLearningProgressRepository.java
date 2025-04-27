package repository.inmemory;

import creational_patterns.singleton.LearningProgress;
import repository.LearningProgressRepository;

import java.util.Collections;
import java.util.List;

public class InMemoryLearningProgressRepository implements LearningProgressRepository {
    @Override
    public LearningProgress save(LearningProgress entity) {
        // Do nothing; return singleton instance
        return LearningProgress.getInstance();
    }

    @Override
    public LearningProgress findById(String id) {
        return LearningProgress.getInstance(); // Always returns the same
    }

    @Override
    public List<LearningProgress> findAll() {
        return Collections.singletonList(LearningProgress.getInstance());
    }

    @Override
    public void deleteById(String id) {
        // Singleton cannot be deleted
    }
}
