package ua.nure.egeometry.egeometry.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ua.nure.egeometry.egeometry.entity.UserEntity;
import ua.nure.egeometry.egeometry.rest.model.User;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
    UserEntity findByEmailAndPassword(String email, String password);
    UserEntity findByEmail(String email);
}