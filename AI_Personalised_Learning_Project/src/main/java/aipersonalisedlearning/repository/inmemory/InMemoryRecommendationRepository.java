package aipersonalisedlearning.repository.inmemory;

import aipersonalisedlearning.creational_patterns.prototype.Recommendation;
import aipersonalisedlearning.repository.RecommendationRepository;

import java.util.*;

public class InMemoryRecommendationRepository implements RecommendationRepository {

    private final Map<String, Recommendation> storage = new HashMap<>();

    @Override
    public Recommendation save(Recommendation entity) {
        storage.put(entity.getRecommendationId(), entity);
        return entity;
    }

    @Override
    public Recommendation findById(String id) {
        return storage.get(id);
    }

    @Override
    public List<Recommendation> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void deleteById(String id) {
        storage.remove(id);
    }
}
