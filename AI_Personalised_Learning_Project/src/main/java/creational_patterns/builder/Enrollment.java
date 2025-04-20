package creational_patterns.builder;

import java.util.Date;

public class Enrollment {
    private final String enrollmentId;
    private final String userId;
    private final String courseId;
    private final String status;
    private final Date enrolledDate;

    private Enrollment(Builder builder) {
        this.enrollmentId = builder.enrollmentId;
        this.userId = builder.userId;
        this.courseId = builder.courseId;
        this.status = builder.status;
        this.enrolledDate = builder.enrolledDate;
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
            return new Enrollment(this);
        }
    }
}
