//package aipersonalisedlearning.repository.inmemory;
//
//import aipersonalisedlearning.creational_patterns.builder.Enrollment;
//import aipersonalisedlearning.repository.EnrollmentRepository;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class InMemoryEnrollmentRepository implements EnrollmentRepository {
//    private final Map<String, Enrollment> storage = new HashMap<>();
//
//    @Override
//    public Enrollment save(Enrollment entity) {
//        storage.put(entity.getEnrollmentId(), entity); // Requires getEnrollmentId()
//        return entity;
//    }
//
//    @Override
//    public Enrollment findById(String id) {
//        return storage.get(id);
//    }
//
//    @Override
//    public List<Enrollment> findAll() {
//        return new ArrayList<>(storage.values());
//    }
//
//    @Override
//    public void deleteById(String id) {
//        storage.remove(id);
//    }
//}
