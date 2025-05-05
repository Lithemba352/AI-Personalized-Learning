package aipersonalisedlearning.creational_patterns.abstractfactory;

public class ConcreteUserFactory implements UserFactory {
    @Override
    public User createUser(String userId, String name, String email, String password, String role) {
        return new User(userId, name, email, password, role);
    }
}
