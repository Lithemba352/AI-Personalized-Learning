//package aipersonalisedlearning.repository.inmemory;
//
//import aipersonalisedlearning.creational_patterns.factorymethod.Course;
//import aipersonalisedlearning.repository.CourseRepository;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class InMemoryCourseRepository implements CourseRepository {
//    private final Map<String, Course> storage = new HashMap<>();
//
//    @Override
//    public Course save(Course entity) {
//        storage.put(entity.getCourseId(), entity);
//        return entity;
//    }
//
//    @Override
//    public Course findById(String id) {
//        return storage.get(id);
//    }
//
//    @Override
//    public List<Course> findAll() {
//        return new ArrayList<>(storage.values());
//    }
//
//    @Override
//    public void deleteById(String id) {
//        storage.remove(id);
//    }
//}
//
