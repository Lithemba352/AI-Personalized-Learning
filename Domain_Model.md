| **Entity**           | **Attributes**                                                                 | **Methods**                                                 | **Relationships**                                           |
|----------------------|----------------------------------------------------------------------------------|--------------------------------------------------------------|-------------------------------------------------------------|
| **User**             | userId, name, email, password, role                                 | login(), logout(), updateProfile()                    | Enrolls in many Courses, has many Reports and Recommendations |
| **Course**           | courseId, title, description, status, category                       | publishCourse(), updateCourse(), archiveCourse()      | Has many Enrollments and many Modules                       |
| **Enrollment**       | enrollmentId, userId,  courseId, status, enrolledDate                 | enrollUser(), cancelEnrollment()                        | Connects User and Course, tracks LearningProgress            |
| **LearningProgress** | progressId, enrollmentId, completedModules, progressPercentage         | updateProgress(), markAsCompleted()                     | Belongs to one Enrollment                                   |
| **Report**           | reportId, userId, generatedDate, status                                | generateReport(), downloadReport()                      | Linked to User                                              |
| **Recommendation**   | recommendationId`, userId, contentId, suggestedDate                     | generateSuggestions(), viewRecommendation()             | Generated for User based on LearningProgress                |

# Business Rules: 
- A user can enroll in multiple courses
- A course must be publisehd beforwe enrollment is allowed.
- Progress is tracked for each enrollment instance.
- Report can only be generated once the user has learning activity.
- Recommendations are based on the user's learning progress and behavior.
 
