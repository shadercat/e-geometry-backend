package ua.nure.egeometry.egeometry.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import ua.nure.egeometry.egeometry.entity.ProfileEntity;
import ua.nure.egeometry.egeometry.entity.UserEntity;
import ua.nure.egeometry.egeometry.rest.model.UserDto;
import ua.nure.egeometry.egeometry.service.UserService;

import java.util.UUID;


@RestController
public class AuthController {
    private final UserService userService;

    @Autowired
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signUp")
    public HttpStatus userSignUp(@RequestBody UserDto userDto) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        ProfileEntity profile = new ProfileEntity();
        profile.setFirstName(userDto.getFirstName());
        profile.setLastName(userDto.getLastName());
        profile.setId(UUID.randomUUID().toString());
        userService.createOrUpdate(new UserEntity(UUID.randomUUID().toString(), userDto.getEmail(), userDto.getPassword(),
                userDto.getUsername(), "USER", profile));
        return HttpStatus.OK;
    }
}
