package repository.factories;

import repository.*;
import repository.inmemory.*;
import repository.filesystem.*;
import repository.database.*;

public class RepositoryFactory {

    private StorageType storageType;

    public RepositoryFactory(StorageType storageType) {
        this.storageType = storageType;
    }

    public UserRepository createUserRepository() {
        switch (storageType) {
            case MEMORY:
                return new InMemoryUserRepository();
            case FILESYSTEM:
                return new FileSystemUserRepository();
            // case DATABASE: return new DatabaseUserRepository(); (future work)
            default:
                throw new UnsupportedOperationException("Storage type not supported yet.");
        }
    }

    public CourseRepository createCourseRepository() {
        switch (storageType) {
            case MEMORY:
                return new InMemoryCourseRepository();
            case FILESYSTEM:
                return new FileSystemCourseRepository();
            case DATABASE:
                return new DatabaseCourseRepository();
            default:
                throw new UnsupportedOperationException("Storage type not supported yet.");
        }
    }

    public EnrollmentRepository createEnrollmentRepository() {
        switch (storageType) {
            case MEMORY:
                return new InMemoryEnrollmentRepository();
            case FILESYSTEM:
                return new FileSystemEnrollmentRepository();
            default:
                throw new UnsupportedOperationException("Storage type not supported yet.");
        }
    }

    public RecommendationRepository createRecommendationRepository() {
        switch (storageType) {
            case MEMORY:
                return new InMemoryRecommendationRepository();
            case FILESYSTEM:
                return new FileSystemRecommendationRepository();
            default:
                throw new UnsupportedOperationException("Storage type not supported yet.");
        }
    }

    public ReportRepository createReportRepository() {
        switch (storageType) {
            case MEMORY:
                return new InMemoryReportRepository();
            case FILESYSTEM:
                return new FileSystemReportRepository();
            default:
                throw new UnsupportedOperationException("Storage type not supported yet.");
        }
    }

    public LearningProgressRepository createLearningProgressRepository() {
        switch (storageType) {
            case MEMORY:
                return new InMemoryLearningProgressRepository();
            case FILESYSTEM:
                return new FileSystemLearningProgressRepository();
            default:
                throw new UnsupportedOperationException("Storage type not supported yet.");
        }
    }
}
