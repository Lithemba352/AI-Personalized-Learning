# Contribution Guidelines to SmartLearn
Thank you for your interest in contributing to SmartLearn!

## 🚀 Setup Instructions
To contribute effectively, follow this end-to-end setup and contribution guide:

### 1. Project Setup
Ensure you have the following installed:
- Java 17 
- Maven
- Git

Clone the repository and install dependencies:

```bash
git clone https://github.com/your-username/AI_Personalised_Learning_Project.git
cd AI_Personalised_Learning_Project
mvn clean install
```
### 2. Follow Code Standards While Developing
Use JAVA conventions:
- **camelCase** for methods and variables
- **PascalCase** for class names
- Keep code modular and aligned with the creational design patterns already used.
- Place each pattern in its respective package under creational_patterns/.
- Use builders with validation to prevent invalid object construction.
- Avoid large methods or duplicate code — prioritize readability and simplicity.

## 3. 🧪 Running Tests
- Use JUnit 5 for writing tests
- Ensure each class has a corresponding test class under /src/test/java
- Use descriptive test method names (e.g., shouldCreateValidStudentProfile())
- Run mvn clean test before committing
 ```bash
mvn clean test
# Coding Standards for SmartLearn
```
Before submitting a pull request, please make sure all tests pass:

### 🔧 Linting & Build
- Run mvn clean verify before opening a PR
- Ensure build passes on GitHub Actions CI pipeline
- Avoid committing commented-out or debug code


### Submitting your Contribution
Once you’ve completed the above:
1. Fork this repository.
2. Create a new branch:
```bash
git checkout -b feature/my-feature
```
3. Commit your code and push to your fork.
4. Open a pull request with a clear and descriptive title explaining your changes.

### 4. How to Pick Issues and Submit Pull Requests(PRs)
1. ***Browse open issues:**
   - Go to the Issues tab of this repository.
   - Look for issues labeled good-first-issue or feature-request.
   - Read the issue description to make sure it's something you'd like to work on.
2. **Comment to claim the issue:**
   - Leave a comment on the issue like: "I'd like to work on this "
   - Wait for confirmation if required.
3. **Fork the repository:**
  - Click "Fork" in the top-right of the repo page and clone your fork locally:
    ```bash
    git clone https://github.com/your-username/AI_Personalised_Learning_Project.git
    cd AI_Personalised_Learning_Project
    git checkout -b fix/issue-title
    git push origin fix/issue-title
    ```
Then, go to your fork on GitHub and click **“Compare & pull request”**.
4. **Use a clear PR title and description:**
 - Include the issue number in the title.
 - Describe what you changed and why.
 - If your PR closes an issue, write: Closes #123
5. **Wait for review** and make any requested changes.
# Tag Issues for Contributors:
### Step-by-Step Instructions
1. **Go to your GitHub repository**
2. Click on the **"Issues"** tab.
3. To create a **"New issue"**:
   - Click "New issue"
   - Fill in a clear title and description (e.g., "Add Javadoc to RepositoryFactory")
   - On the right side under "Labels", click and select:
     - good-first-issue (for beginner-friendly tasks), or
     - feature-request (for enhancements or new ideas)
     - Click "Submit new issue"
4. To label existing issues:
    - Open the issue
    - Click the gear icon or **"Labels"** section on the right
    - Select the appropriate label(s)
# SmartLearn Roadmap
This roadmap outlines planned enhancements and features for the SmartLearn platform.
---

## 🚧 In Progress

- Refactor storage abstraction for better modularity
- Improve unit test coverage to 90%
- Implement JavaDocs for all repository interfaces
---

## 🛠 Planned Features

- Integrate Redis caching for faster data retrieval
- Add PostgreSQL support via RepositoryFactory
- Build a CLI tool for selecting storage types
- Develop a lightweight Swing-based UI for desktop usage
- Include an analytics module to track learning progress
- Provide Learning Recommendations
- Access Personalized Content
- Enroll Courses
- Enrollment allows creation with missing required fileds(nulls values)
---

## 🌟 Future Enhancements

- Integrate with external AI APIs (e.g., OpenAI) for adaptive suggestions
- Deploy as a Docker container with pre-configured environment
- Expose REST API endpoints for accessing SmartLearn data
- Add multilingual support (e.g., English, Xhosa, Afrikaans)
- Role-based access control for teachers and students

---
Stay tuned for updates as the project evolves!
