# State Transition Diagram screenshot 
![mermaid-diagram-2025-04-06-201614](https://github.com/user-attachments/assets/2e719659-a982-4435-8818-65ee30a88675)

# Markdown explaination
The system contains various objects that each follow a logical lifecycle. 
- A **User Account** moves from registered to active after verification, with options to suspend or deactivate.
- A **Course** starts in draft, can be published, edited, or archived. Enrollment flows from a request to approval, then becomes active and eventually completed or dropped.
- **Learning Progress** helps track course status, allowing for pause and resume.
- A **Report** goes from generating to either success or failure.
- **Recommendations** are AI-generated and move through analyzed, suggested, and viewed states.
- **User Roles** can be assigned, changed, or removed. Lastly, Login Sessions show the flow between logged out, logged in, and timed out statuses.

These diagrams represent how the system manages each core function effectively.

# State Transition Diagram in mermaid
```
stateDiagram code
    state "User Account" as UA {
        [*] --> Registered
        Registered --> Active : onVerifyEmail
        Active --> Suspended : onViolation
        Suspended --> Active : onAppealApproved
        Active --> Deactivated : onUserRequest
        Suspended --> Deactivated : onUserRequest
        Deactivated --> [*]
    }

    state "Course" as C {
        [*] --> Draft
        Draft --> Published : onPublish
        Published --> Archived : onArchive
        Archived --> Published : onRestore
        Published --> Updated : onEdit
    }

    state "Enrollment" as E {
        [*] --> Requested
        Requested --> Approved : onApproval
        Approved --> Active : onPayment
        Active --> Completed : onFinish
        Active --> Dropped : onUserWithdraw
        Dropped --> [*]
        Completed --> [*]
    }

    state "Learning Progress" as LP {
        [*] --> NotStarted
        NotStarted --> InProgress : onStartCourse
        InProgress --> Completed : onAllLessonsDone
        InProgress --> OnHold : onPause
        OnHold --> InProgress : onResume
    }

    state "Report" as R {
        [*] --> Generating
        Generating --> Ready : onSuccess
        Generating --> Failed : onError
        Failed --> Generating : onRetry
        Ready --> [*]
    }

    state "Recommendation" as REC {
        [*] --> Analyzing
        Analyzing --> Suggested : onAIModel
        Suggested --> Viewed : onUserAccess
        Viewed --> [*]
    }

    state "User Role" as UR {
        [*] --> Assigned
        Assigned --> Modified : onUpdateRole
        Modified --> Revoked : onRemove
        Revoked --> [*]
    }

    state "Login Session" as LS {
        [*] --> LoggedOut
        LoggedOut --> LoggedIn : onLogin
        LoggedIn --> TimedOut : onInactivity
        LoggedIn --> LoggedOut : onLogout
        TimedOut --> LoggedOut : onRelogin
    }
