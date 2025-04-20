package creational_patterns;

import creational_patterns.simplefactory.Report;
import creational_patterns.simplefactory.ReportFactory;
import creational_patterns.singleton.LearningProgress;
import creational_patterns.factorymethod.*;
import creational_patterns.abstractfactory.*;
import creational_patterns.builder.Enrollment;
import creational_patterns.prototype.Recommendation;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMO: Creational Design Patterns ===");

        // 1. Singleton
        System.out.println("\n-- Singleton --");
        LearningProgress tracker = LearningProgress.getInstance();
        tracker.trackProgress("User123");

        // 2. Factory Method
        System.out.println("\n-- Factory Method --");
        CourseFactory courseFactory = new ConcreteCourseFactory();
        Course course = courseFactory.createCourse("C101", "Java Basics", "Intro to Java", "Draft", "Programming");
        course.publishCourse();

        // 3. Abstract Factory
        System.out.println("\n-- Abstract Factory --");
        UserFactory userFactory = new ConcreteUserFactory();
        User user = userFactory.createUser("U101", "Alice", "alice@mail.com", "pass123", "Student");
        user.login();

        // 4. Builder
        System.out.println("\n-- Builder --");
        Enrollment enrollment = new Enrollment.Builder()
                .enrollmentId("E202")
                .userId("U101")
                .courseId("C101")
                .status("Active")
                .enrolledDate(new Date())
                .build();
        System.out.println("Enrollment created for user: " + enrollment);

        // 5. Prototype
        System.out.println("\n-- Prototype --");
        Recommendation original = new Recommendation("R301", "U101", "C101");
        Recommendation copy = original.clone();
        System.out.println("Recommendation cloned for content: " + copy);

        // 6. Direct Report usage
        System.out.println("\n-- Simple Factory --");
        Report simpleReport = ReportFactory.createReport("R999", "U555");
        simpleReport.generateReport();

        System.out.println("\n=== End of Demonstration ===");
    }
}
