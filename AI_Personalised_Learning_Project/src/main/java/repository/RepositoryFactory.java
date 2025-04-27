package repository;

import repository.inmemory.*;

public class RepositoryFactory {

    private StorageType storageType;

    public RepositoryFactory(StorageType storageType) {
        this.storageType = storageType;
    }

    public UserRepository createUserRepository() {
        switch (storageType) {
            case MEMORY:
                return new InMemoryUserRepository();
            default:
                throw new UnsupportedOperationException("Storage type not supported yet.");
        }
    }

    public CourseRepository createCourseRepository() {
        switch (storageType) {
            case MEMORY:
                return new InMemoryCourseRepository();
            default:
                throw new UnsupportedOperationException("Storage type not supported yet.");
        }
    }

    public EnrollmentRepository createEnrollmentRepository() {
        switch (storageType) {
            case MEMORY:
                return new InMemoryEnrollmentRepository();
            default:
                throw new UnsupportedOperationException("Storage type not supported yet.");
        }
    }

    public RecommendationRepository createRecommendationRepository() {
        switch (storageType) {
            case MEMORY:
                return new InMemoryRecommendationRepository();
            default:
                throw new UnsupportedOperationException("Storage type not supported yet.");
        }
    }

    public ReportRepository createReportRepository() {
        switch (storageType) {
            case MEMORY:
                return new InMemoryReportRepository();
            default:
                throw new UnsupportedOperationException("Storage type not supported yet.");
        }
    }

    public LearningProgressRepository createLearningProgressRepository() {
        switch (storageType) {
            case MEMORY:
                return new InMemoryLearningProgressRepository();
            default:
                throw new UnsupportedOperationException("Storage type not supported yet.");
        }
    }
}
