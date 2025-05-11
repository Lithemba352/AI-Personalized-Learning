# PROTECTION.md

## Why Branch Protection Rules Matter

Branch protection rules are essential in modern software development to ensure high code quality, team collaboration, and project stability.

### 1. Require Pull Request Reviews
Requiring at least one pull request review before merging ensures peer oversight. It helps identify bugs, improves code readability, and encourages collaboration.

### 2. Require Status Checks to Pass
By enforcing CI checks before merges, we ensure the codebase is not broken. All automated tests and build processes must succeed, which reduces bugs in production.

### 3. Disable Direct Pushes
Preventing direct pushes to `main` ensures all code changes go through pull requests. This enables tracking, review, discussion, and history management — essential for team projects and CI/CD workflows.

These rules protect the integrity of the main branch and enforce a professional development workflow.

## Screenshots
![image](https://github.com/user-attachments/assets/6e2c2a76-b94c-46c6-bcb5-51e99e058d51)
![image](https://github.com/user-attachments/assets/a840d90d-6e30-4de5-af8a-047fa50ba023)

