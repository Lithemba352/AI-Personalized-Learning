package aipersonalisedlearning.creational_patterns.factorymethod;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private String courseId;
    private String title;
    private String description;
    private String status;
    private String category;

    public Course(String courseId, String title, String description, String status, String category) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.status = status;
        this.category = category;
    }

    public void publishCourse() {
        this.status = "Published";
        System.out.println("Course '" + title + "' has been published.");
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getCategory() {
        return category;
    }
}
