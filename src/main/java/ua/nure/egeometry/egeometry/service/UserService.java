package ua.nure.egeometry.egeometry.service;

import ua.nure.egeometry.egeometry.entity.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity getByEmail(String email);
    UserEntity createOrUpdate(UserEntity person);
    List<UserEntity> getAll();
    UserEntity getById(String id);
}