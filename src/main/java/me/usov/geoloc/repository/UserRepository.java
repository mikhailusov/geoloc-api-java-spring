package me.usov.geoloc.repository;

import me.usov.geoloc.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by mikhailusov on 12/10/15.
 */
public interface UserRepository extends MongoRepository<User, String> {

    public User findByEmail(String email);
}
