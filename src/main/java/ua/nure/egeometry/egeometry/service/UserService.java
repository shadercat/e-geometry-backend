package ua.nure.egeometry.egeometry.service;

import ua.nure.egeometry.egeometry.entity.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity getByEmail(String email);
    UserEntity create(UserEntity person);
    List<UserEntity> getAll();
}