package ua.nure.egeometry.egeometry.service.impl;

import ua.nure.egeometry.egeometry.entity.UserEntity;
import ua.nure.egeometry.egeometry.repository.UserRepository;
import ua.nure.egeometry.egeometry.rest.model.User;
import ua.nure.egeometry.egeometry.service.UserService;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User findUserByEmailAndPassword(String email, String password) {
        UserEntity user = userRepository.findByEmailAndPassword(email, password);

        return null;
    }
}
