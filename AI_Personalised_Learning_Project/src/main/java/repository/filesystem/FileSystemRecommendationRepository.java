package repository.filesystem;

import creational_patterns.prototype.Recommendation;
import repository.RecommendationRepository;
import java.util.*;

public class FileSystemRecommendationRepository implements RecommendationRepository {

    @Override
    public Recommendation save(Recommendation entity) {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }

    @Override
    public Recommendation findById(String id) {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }

    @Override
    public List<Recommendation> findAll() {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }

    @Override
    public void deleteById(String id) {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }
}
