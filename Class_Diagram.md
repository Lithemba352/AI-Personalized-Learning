# Class Diagram
## Key Design Decisions for the Class Diagram

- **Separation of Concerns**: Each class represents a specific entity within the AI-personalized learning system for example User, Course, Enrollment, making the system modular and easier to manage.

- **User-Centered Relationships**: The User class is central and connects to multiple entities like Enrollment, Report, and Recommendation, reflecting real-world interactions.

- **AI Personalization**: The `Recommendation` class was added to support AI-driven suggestions, linking users to learning content based on their progress and preferences.

- **Tracking Learning**: The `LearningProgress` class tracks module completion and progress percentage, enabling personalized learning paths and analytics.

- **Course Lifecycle**: The `Course` class includes states like published, updated, and archived to match real course management flows.

- **Flexible Enrollment Handling**: The `Enrollment` class manages course participation, including actions like enrollment and cancellation, to accommodate learning flexibility.

- **Automated Reporting**: The `Report` class allows the system to generate and manage performance reports, improving visibility into user progress.

These design choices ensure the system is extensible, user-friendly, and aligned with the needs of personalized education.

```mermaid
classDiagram
    %% Entity Classes
    class User {
        +String userId
        +String name
        +String email
        +String password
        +String role
        +login()
        +logout()
        +updateProfile()
    }

    class Course {
        +String courseId
        +String title
        +String description
        +String status
        +String category
        +publishCourse()
        +updateCourse()
        +archiveCourse()
    }

    class Enrollment {
        +String enrollmentId
        +String userId
        +String courseId
        +String status
        +Date enrolledDate
        +enrollUser()
        +cancelEnrollment()
    }

    class LearningProgress {
        +String progressId
        +String enrollmentId
        +int completedModules
        +float progressPercentage
        +updateProgress()
        +markAsCompleted()
    }

    class Report {
        +String reportId
        +String userId
        +Date generatedDate
        +String status
        +generateReport()
        +downloadReport()
    }

    class Recommendation {
        +String recommendationId
        +String userId
        +String contentId
        +Date suggestedDate
        +generateSuggestions()
        +viewRecommendation()
    }

    %% Repository Interfaces
    class Repository~T, ID~ {
        +save(T entity)
        +findById(ID id)
        +findAll()
        +deleteById(ID id)
    }

    class UserRepository
    class CourseRepository
    class EnrollmentRepository
    class LearningProgressRepository
    class ReportRepository
    class RecommendationRepository

    %% Repository Implementations
    class InMemoryUserRepository
    class InMemoryCourseRepository
    class InMemoryEnrollmentRepository
    class InMemoryLearningProgressRepository
    class InMemoryReportRepository
    class InMemoryRecommendationRepository

    class FileSystemUserRepository
    class FileSystemCourseRepository
    class FileSystemEnrollmentRepository
    class FileSystemLearningProgressRepository
    class FileSystemReportRepository
    class FileSystemRecommendationRepository

    class DatabaseCourseRepository

    %% Relationships - Domain Models
    User "1" --> "many" Enrollment
    User "1" --> "many" Report
    User "1" --> "many" Recommendation

    Course "1" --> "many" Enrollment
    Course "1" --> "many" LearningProgress

    Enrollment "1" --> "1" LearningProgress

    %% Relationships - Repositories
    Repository <|-- UserRepository
    Repository <|-- CourseRepository
    Repository <|-- EnrollmentRepository
    Repository <|-- LearningProgressRepository
    Repository <|-- ReportRepository
    Repository <|-- RecommendationRepository

    UserRepository <|-- InMemoryUserRepository
    UserRepository <|-- FileSystemUserRepository

    CourseRepository <|-- InMemoryCourseRepository
    CourseRepository <|-- FileSystemCourseRepository
    CourseRepository <|-- DatabaseCourseRepository

    EnrollmentRepository <|-- InMemoryEnrollmentRepository
    EnrollmentRepository <|-- FileSystemEnrollmentRepository

    LearningProgressRepository <|-- InMemoryLearningProgressRepository
    LearningProgressRepository <|-- FileSystemLearningProgressRepository

    ReportRepository <|-- InMemoryReportRepository
    ReportRepository <|-- FileSystemReportRepository

    RecommendationRepository <|-- InMemoryRecommendationRepository
    RecommendationRepository <|-- FileSystemRecommendationRepository
