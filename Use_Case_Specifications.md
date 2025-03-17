# Use Case 1: Enroll in Courses
- **Actor(s)**: Student
- **Precondition**: Student must be logged in.
- **Postcondition**: The course is added to the student’s profile.
-**Basic Flow**:
- 1.Student selects a course.
- 2.Student clicks on the 'Enroll' button.
- 3.The system confirms enrollment.
- **Alternative Flow**: If the student is not logged in, the system prompts for login.
# Use Case 2: Access Personalized Content
- **Actor(s)**: Student
- **Precondition**: Student must be enrolled in a course.
- **Postcondition**: Student gains access to personalized content.
- **Basic Flow**:
- 1.Student navigates to "My Courses".
_ 2.Selects a course.
- 3.AI recommends relevant learning materials.
- **Alternative Flow**: If AI fails to recommend content, the system displays default content.
# Use Case 3: Track Learning Progress
- **Actor(s)**: Student, Teacher, Parent
- **Precondition**: Student must be enrolled in at least one course.
- **Postcondition**: The user (Student/Teacher/Parent) can view the learning progress.
- **Basic Flow**:
  1. Student, Teacher, or Parent accesses the "Progress" section.
  2. The system displays progress data such as completed lessons, quizzes, and grades.
- **Alternative Flow**: If no progress is available, the system displays a message indicating "No progress available."

# Use Case 4: Assign & Review Assessments
- **Actor(s)**: Teacher
- **Precondition**: Teacher must be logged in.
- **Postcondition**: Assessment is successfully assigned and reviewed.
- **Basic Flow**:
  1. Teacher selects "Create New Assessment".
  2. Teacher assigns the assessment to students.
  3. The system confirms the assignment.
  4. Teacher reviews the submitted assessments.
- **Alternative Flow**: If no students are assigned to the course, the system prompts the teacher to add students.

# Use Case 5: Provide Learning Recommendations
- **Actor(s)**: AI
- **Precondition**: Student is enrolled in a course.
- **Postcondition**: The AI provides personalized learning recommendations.
- **Basic Flow**:
  1. AI analyzes the student’s progress and preferences.
  2. AI generates learning recommendations.
  3. The system sends recommendations to the student.
- **Alternative Flow**: If no preferences are available, the AI provides generic recommendations.

# Use Case 6: Generate Reports
- **Actor(s)**: Administrator
- **Precondition**: Administrator must be logged in.
- **Postcondition**: Reports are generated and available for download.
- **Basic Flow**:
  1. Administrator navigates to the "Reports" section.
  2. Administrator selects the type of report.
  3. The system generates the report.
  4. Administrator downloads the report.
- **Alternative Flow**: If the system fails to generate a report, an error message is displayed.

# Use Case 7: Manage User Roles
- **Actor(s)**: Administrator
- **Precondition**: Administrator must be logged in.
- **Postcondition**: User roles are updated.
- **Basic Flow**:
  1. Administrator accesses the "User Management" section.
  2. Administrator selects a user and changes their role.
  3. The system confirms the role change.
- **Alternative Flow**: If the role cannot be changed due to permissions, the system displays an error message.

# Use Case 8: Integrate with LMS
- **Actor(s)**: LMS (Learning Management System)
- **Precondition**: System must be connected to the LMS.
- **Postcondition**: The system successfully integrates with the LMS.
- **Basic Flow**:
  1. The system sends an integration request to the LMS.
  2. LMS processes the request and provides a response.
  3. The system updates the integration status.
- **Alternative Flow**: If the integration fails, an error message is displayed.
