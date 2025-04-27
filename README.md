# SmartLearn: AI-Powered Personalized Learning Platform

## Description
An AI-driven platform that personalizes learning experiences by adapting to individual student needs, tracking progress, and providing actionable insights.

## Language and Design Decisions
Java was selected for this project because it aligns well with object-oriented principles and offers robust support for implementing creational design patterns. I personally chose Java because I am more comfortable using it, which made it easier to focus on applying the patterns correctly.

All six major creational patterns were applied using only the classes present in the UML Class Diagram, ensuring a clean, pattern-focused structure. The patterns were separated into individual packages under `creational_patterns/` for clarity and maintainability. Unit testing was done using JUnit 5, and validation was added to the builder pattern to avoid incomplete object construction.
## Abstraction Mechanism: Factory Pattern

For the storage abstraction, the Factory Pattern was chosen over full Dependency Injection (DI). 

The `RepositoryFactory` located inside the `/factories` directory handles the creation of different repository implementations based on the selected storage type (e.g., In-Memory, FileSystem, or Database). This approach provides a simple, centralized way to switch storage mechanisms without modifying business logic.

The Factory pattern was selected because:
- It keeps the system lightweight and simple.
- It avoids unnecessary complexity for a project of this size.
- It easily supports future storage expansions (like adding database repositories).
- It maintains separation of concerns by decoupling object creation from usage.

In larger, enterprise systems, a full DI framework (e.g., Spring) would be more appropriate, but for this project scope, a Factory offers clean, sufficient abstraction.


## Links
- [SPECIFICATION.md](./SPECIFICATION.md)
- [ARCHITECTURE.md](./ARCHITECTURE.md)
- [STAKEHOLDERS.md](STAKEHOLDERS.md)
- [SYSTEM_REQUIREMENTS.md](SYSTEM_REQUIREMENTS.md)
- [REFLECTION.md](REFLECTION.md)
- [Use_Case_Diagram.md](Use_Case_Diagram.md)
- [Test_Case_Development.md](Test_Case_Development.md)
- [Use_Case_Specifications.md](Use_Case_Specifications.md)
- [Reflection_Challenges.md](Reflection_Challenges.md)
- [Agile_Planning_Document.md](Agile_Planning_Document.md)
- [User_Story_Table.md](User_Story_Table.md)
- [Product_Backlog.md](Product_Backlog.md)
- [Sprint_Plan.md](Sprint_Plan.md)
- [template_analysis.md](template_analysis.md)
- [kanban_creation.md](kanban_creation.md)
- [kanban_explanation.md](kanban_explanation.md)
- [Reflection_on_kanboard_implementation.md](Reflection_on_kanboard_implementation.md)
- [State_Transition_diagram.md](State_Transition_diagram.md)
- [Activity_Diagrams.md](Activity_Diagrams.md)_
- [Integration_with_Prior_Work.md](Integration_with_Prior_Work.md)
- [xxxxx_reflection.md](xxxxx_reflection.md)
- [Domain_Model.md](Domain_Model.md)
- [Class_Diagram.md](Class_Diagram.md)
- [Domain_Modeling_and_Class_Reflection.md](Domain_Modeling_and_Class_Reflection.md)
- [CHANGELOG.md](CHANGELOG.md)
- [CoverageReport.md](CoverageReport.md)
