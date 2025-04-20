package creational_patterns.abstractfactory;

public interface UserFactory {
    User createUser(String userId, String name, String email, String password, String role);
}
