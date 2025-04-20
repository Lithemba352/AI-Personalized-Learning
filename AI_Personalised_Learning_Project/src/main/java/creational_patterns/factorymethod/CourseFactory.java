package creational_patterns.factorymethod;

public abstract class CourseFactory {
    public abstract Course createCourse(String courseId, String title, String description, String status, String category );
}
