# UML Activity Diagram
![mermaid-diagram-2025-04-06-220759](https://github.com/user-attachments/assets/823163b4-a15f-4a66-bbb2-1687a578050e)

# Markdown Explanation
1. **User Registration and Profile Setup** : 
This workflow guides users through the registration process, verifying their email and creating a new profile upon successful registration. If the email is invalid, an error message is shown. The system ensures data validation and provides immediate feedback, promoting a smooth user experience.

2. **Content Recommendation**: 
The content recommendation workflow collects user preferences and behavior data to generate personalized learning suggestions. If there is insufficient data, the system prompts the user to complete a quiz. This ensures personalized learning experiences based on user data, addressing the need for dynamic and tailored content delivery.

3. **Learning Progress Tracking**: 
The system tracks users’ progress as they complete sections of a course. If a section is completed, it is marked as complete and the user's progress is updated. If not, the system continues tracking until the section is completed. This ensures real-time updates and accurate tracking of user progress.

4. **Course Enrollment**: 
In this workflow, users browse and select courses. The system checks if the user is eligible for the course. If eligible, they proceed with enrollment. If not, the user is notified of the eligibility issue. This process ensures that only eligible users can enroll, addressing concerns of fairness and prerequisites.

5. **Assessments and Quiz Submission**: 
The assessment workflow allows users to take quizzes, answer questions, and submit their answers. The system grades the quiz and updates the user's performance record. This workflow ensures that assessments are graded quickly, and performance data is updated in real time, addressing the need for efficient feedback.

6. **AI-Based Performance Feedback**: 
After completing a course, the AI analyzes the user's performance. If improvements are needed, the AI suggests resources. If no improvements are necessary, the system confirms the user’s achievements. This workflow enhances the learning experience by providing actionable feedback, addressing the need for personalized, AI-driven learning insights.

7. **User Feedback and Course Rating**: 
Once a user completes a course, they are prompted to provide feedback. If the feedback is given, it is recorded and the course rating is updated. If no feedback is given, the system reminds the user. This workflow helps maintain up-to-date course ratings and allows for continuous improvement based on user feedback.

8. **Subscription Renewal**: 
The subscription renewal workflow notifies users of an impending subscription expiration and offers the option to renew. If the user renews, their access is updated. If not, they are informed of the cancellation and offered discounts. This ensures that users remain informed and have options to continue their learning experience without disruption.

# Activity Diagram code 
```
flowchart TD

  %% User Registration Workflow
  subgraph User Registration
    UR_Start([Start]) --> UR_EnterInfo[Enter User Information]
    UR_EnterInfo --> UR_ValidateEmail[Validate Email]
    UR_ValidateEmail -->|Email Valid| UR_StoreInfo[Store User Information]
    UR_ValidateEmail -->|Email Invalid| UR_EmailError[Display Error Message]
    UR_StoreInfo --> UR_VerifyEmail[Verify Email]
    UR_VerifyEmail -->|Verified| UR_Activate[Activate Account]
    UR_VerifyEmail -->|Not Verified| UR_SendVerification[Send Verification Email]
    UR_Activate --> UR_End([End])
    UR_SendVerification --> UR_End
    UR_EmailError --> UR_End
  end

  %% Content Recommendation
  subgraph Content Recommendation
    CR_Start([Start]) --> CR_UserLogin[User logs in]
    CR_UserLogin --> CR_CollectData[AI collects user preferences and behavior]
    CR_CollectData --> CR_CheckData{Is there enough data for recommendation?}
    CR_CheckData -->|Yes| CR_Generate[Generate recommendations]
    CR_CheckData -->|No| CR_AskUser[Ask user to complete sample quiz]
    CR_Generate --> CR_Display[Display recommendations]
    CR_AskUser --> CR_Display
    CR_Display --> CR_End([End])
  end

  %% Learning Progress Tracking
  subgraph Learning Progress
    LP_Start([Start]) --> LP_UserBegins[User begins a course]
    LP_UserBegins --> LP_TrackProgress[System tracks progress]
    LP_TrackProgress --> LP_CompleteSection{Is the course section completed?}
    LP_CompleteSection -->|Yes| LP_MarkComplete[Mark section as complete]
    LP_CompleteSection -->|No| LP_ContinueMonitoring[Continue monitoring]
    LP_MarkComplete --> LP_UpdateProgress[Update user progress]
    LP_ContinueMonitoring --> LP_UpdateProgress
    LP_UpdateProgress --> LP_End([End])
  end

  %% Course Enrollment
  subgraph Course Enrollment
    CE_Start([Start]) --> CE_BrowseCourses[User browses courses]
    CE_BrowseCourses --> CE_SelectCourse[User selects course to enroll]
    CE_SelectCourse --> CE_EligibilityCheck{Is the user eligible for the course?}
    CE_EligibilityCheck -->|Yes| CE_ConfirmEnrollment[Proceed to enrollment confirmation]
    CE_EligibilityCheck -->|No| CE_ShowError[Show eligibility error]
    CE_ConfirmEnrollment --> CE_GrantAccess[Confirm enrollment and grant access]
    CE_ShowError --> CE_NotifyUser[Notify user of eligibility issue]
    CE_GrantAccess --> CE_End([End])
    CE_NotifyUser --> CE_End
  end

  %% Assessments and Quiz Submission
  subgraph Assessments and Quiz Submission
    AQ_Start([Start]) --> AQ_StartQuiz[User starts quiz]
    AQ_StartQuiz --> AQ_AnswerQuestions[User answers questions]
    AQ_AnswerQuestions --> AQ_MoreQuestions{Are there more questions?}
    AQ_MoreQuestions -->|Yes| AQ_ContinueQuiz[Continue quiz]
    AQ_MoreQuestions -->|No| AQ_SubmitQuiz[Submit quiz]
    AQ_ContinueQuiz --> AQ_SubmitQuiz
    AQ_SubmitQuiz --> AQ_AIGrading[AI grades quiz]
    AQ_AIGrading --> AQ_UpdatePerformance[System updates performance record]
    AQ_UpdatePerformance --> AQ_End([End])
  end

  %% AI-Based Performance Feedback
  subgraph AI-Based Performance Feedback
    APF_Start([Start]) --> APF_UserCompletes[User completes course]
    APF_UserCompletes --> APF_AnalyzePerformance[AI analyzes performance]
    APF_AnalyzePerformance --> APF_NeedImprovement{Does the user need improvement?}
    APF_NeedImprovement -->|Yes| APF_SuggestImprovements[Suggest improvements and resources]
    APF_NeedImprovement -->|No| APF_ConfirmCompletion[Confirm completion and achievements]
    APF_SuggestImprovements --> APF_ProvideFeedback[Provide feedback]
    APF_ConfirmCompletion --> APF_ProvideFeedback
    APF_ProvideFeedback --> APF_End([End])
  end

  %% User Feedback and Course Rating
  subgraph User Feedback and Course Rating
    UFCR_Start([Start]) --> UFCR_RequestFeedback[Prompt user for feedback]
    UFCR_RequestFeedback --> UFCR_ProvideFeedback{Does the user provide feedback?}
    UFCR_ProvideFeedback -->|Yes| UFCR_RecordFeedback[Record feedback]
    UFCR_ProvideFeedback -->|No| UFCR_RateReminder[Reminder to rate]
    UFCR_RecordFeedback --> UFCR_UpdateRating[Update course rating]
    UFCR_RateReminder --> UFCR_UpdateRating
    UFCR_UpdateRating --> UFCR_End([End])
  end

  %% Subscription Renewal
  subgraph Subscription Renewal
    SR_Start([Start]) --> SR_CheckExpiration[Subscription nearing expiration]
    SR_CheckExpiration --> SR_SendReminder[System sends renewal reminder]
    SR_SendReminder --> SR_UserRenews{Does the user renew subscription?}
    SR_UserRenews -->|Yes| SR_ProcessPayment[Process payment and update status]
    SR_UserRenews -->|No| SR_DisplayCancellation[Display cancellation message and offer discounts]
    SR_ProcessPayment --> SR_PaymentSuccess[Payment Success]
    SR_PaymentSuccess --> SR_ActivateSubscription[Activate Subscription]
    SR_DisplayCancellation --> SR_NotifyUser[Notify user of cancellation]
    SR_ActivateSubscription --> SR_End([End])
    SR_NotifyUser --> SR_End
  end
