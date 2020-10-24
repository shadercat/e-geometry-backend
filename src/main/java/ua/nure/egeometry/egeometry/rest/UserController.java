package ua.nure.egeometry.egeometry.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import ua.nure.egeometry.egeometry.entity.UserEntity;
import ua.nure.egeometry.egeometry.rest.model.User;
import ua.nure.egeometry.egeometry.service.impl.UserServiceImpl;


@RestController
public class UserController {
    private final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping("/signUp")
    public ResponseEntity userSignUp(@RequestBody User userDto) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        userService.create(new UserEntity(userDto.getEmail(), userDto.getPassword(), userDto.getUsername(), "USER"));
        return ResponseEntity.ok().build();
    }
}
