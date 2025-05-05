package aipersonalisedlearning.repository;

import aipersonalisedlearning.creational_patterns.abstractfactory.User;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface UserRepository extends JpaRepository<User, String> {

    void deleteById(String id);
}
