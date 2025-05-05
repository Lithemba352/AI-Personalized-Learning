package aipersonalisedlearning.creational_patterns.builder;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Enrollment {

    @Id
    private  String enrollmentId;
    private  String userId;
    private  String courseId;
    private  String status;
    private  Date enrolledDate;

    public Enrollment() {
    }

    private Enrollment(Builder builder) {
        this.enrollmentId = builder.enrollmentId;
        this.userId = builder.userId;
        this.courseId = builder.courseId;
        this.status = builder.status;
        this.enrolledDate = builder.enrolledDate;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getUserId() {
        return userId;
    }

    public Date getEnrolledDate() {
        return enrolledDate;
    }

    public String getStatus() {
        return status;
    }

    public static class Builder {
        private String enrollmentId;
        private String userId;
        private String courseId;
        private String status;
        private Date enrolledDate;

        public Builder enrollmentId(String id) {
            this.enrollmentId = id;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder courseId(String courseId) {
            this.courseId = courseId;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder enrolledDate(Date date) {
            this.enrolledDate = date;
            return this;
        }

        public Enrollment build() {
            if (userId == null || courseId == null || status == null) {
                throw new IllegalStateException("Missing required fields for Enrollment");
            }

            return new Enrollment(this);

        }
    }
}
