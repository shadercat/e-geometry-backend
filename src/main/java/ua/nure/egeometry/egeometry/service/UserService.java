package ua.nure.egeometry.egeometry.service;

import ua.nure.egeometry.egeometry.rest.model.User;

public interface UserService {

    User findUserByEmailAndPassword(String email, String password);
}