package aipersonalisedlearning.creational_patterns.factorymethod;

public class ConcreteCourseFactory extends CourseFactory {
    @Override
    public Course createCourse(String id, String title, String desc, String status, String category) {
        return new Course(id, title, desc, status, category);
    }
}
