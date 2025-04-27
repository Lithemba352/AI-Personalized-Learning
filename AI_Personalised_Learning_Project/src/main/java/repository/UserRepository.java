package repository;

import creational_patterns.abstractfactory.User;

public interface UserRepository extends Repository<User, String>{

    void deleteById(String id);
}
