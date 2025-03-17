# Use Case Diagram
##  In marmaid.js 
![image](https://github.com/user-attachments/assets/c810efeb-ac2c-4f1c-9e5f-0099b2af80c1)

Screenshot of the use case diagram
![image](https://github.com/user-attachments/assets/1e7d6fa4-e9a4-4678-b4a8-e0c55d84a987)
# Actors and their Roles
- **Student**:Enroll in Courses, access personalized content and track learning progress
- **Teacher**: Track learning progress, assign review assessment
- **Parent**: Monitors student progress and Generate reports
- **Administrator**: Manages users and roles
- **System**: Provides learning recommendations

# Relationships between Actors and Use Cases
- The Student actor can initiate the Enroll in Courses use case, which depends on the Access Personalized Content use case.
- The Teacher actor can initiate the Assign & Review Assessments use case, which depends on the Generate Reports use case.
- The Parent actor can initiate the Track Learning Progress use case, which depends on the Generate Reports use case.
- The AI System automatically runs the Provide Learning Recommendations use case, which depends on both the Track Learning Progress and Access Personalized Content use cases.
- The Administrator actor can initiate the Manage User Roles use case, which is required for the Generate Reports use case.

