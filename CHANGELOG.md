#  Changelog

All notable changes to this project will be documented in this file.

---

## [v1.0.0] - 2025-04-20

###  Added
- Implemented all six creational design patterns:
  - Singleton: `LearningProgress`
  - Factory Method: `CourseFactory`
  - Abstract Factory: `UserFactory`
  - Builder: `Enrollment`
  - Prototype: `Recommendation`
  - Simple Factory: `ReportFactory`
- Created individual classes and packages under `creational_patterns/`
- Added `Main.java` to demonstrate usage of all patterns
- Wrote JUnit tests for all patterns under `/tests` package

### Fixed
- Validation bug: `Enrollment.Builder` allowed creation with missing fields
  - Now throws `IllegalStateException` if `userId`, `courseId`, or `status` is null
  - Linked to Issue #4 in GitHub

### Improved
- Added `toString()` and `getters` to `Recommendation`, `User`, `Course`, and `Enrollment` to support testing and logging
- Enhanced test coverage with printed output to verify runtime behavior

---

## [Initial Setup] - 2025-04-18

### Added
- Created UML Class Diagram
- Designed folder structure for patterns
- Defined `README.md` and initial `Main.java`
