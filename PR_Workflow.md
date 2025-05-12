# PR Workflow & Failing Test Enforcement
To ensure code quality, the CI pipeline is configured to run tests on every pull request (PR). This mechanism helps prevent broken code from being merged into the main branch.

## CI/CD Workflow Overview

When a PR is created:
1. GitHub Actions triggers the workflow defined in `.github/workflows/ci.yml`.
2. The pipeline:
   - Checks out the latest code.
   - Sets up Java 17 with the Temurin distribution.
   - Caches Maven dependencies for faster builds.
   - Builds the project and executes all unit and integration tests using Maven.

## Enforcing Test Pass Requirement

- If **any test fails**, the workflow fails.
- The PR status check will indicate failure.
- **Merging is blocked until all tests pass.**

This ensures:
- Higher code reliability.
- No broken builds reach the `main` branch.
- Easier debugging and code maintenance.

## Example: PR Blocked by Failing Tests

The following screenshot captures a scenario where test failures caused the PR to be blocked from merging:

![image](https://github.com/user-attachments/assets/92345108-dcf5-4205-a2ac-742820130e1f)
> 📝 *GitHub automatically enforces test success before allowing merge into `main`.*
