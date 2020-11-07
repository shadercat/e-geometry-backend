package ua.nure.egeometry.egeometry.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.nure.egeometry.egeometry.entity.ProfileEntity;
import ua.nure.egeometry.egeometry.entity.UserEntity;
import ua.nure.egeometry.egeometry.rest.model.ProfileDto;
import ua.nure.egeometry.egeometry.service.UserService;

@RestController
public class ProfileController {
    private final UserService userService;

    @Autowired
    public ProfileController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/get/profile/{id}")
    public ResponseEntity<ProfileEntity> getUserProfile(@PathVariable("id") String id) {
        ProfileEntity profileEntity = userService.getById(id).getProfile();
        return new ResponseEntity<>(profileEntity, HttpStatus.OK);
    }

    @PostMapping("/user/set/profile")
    public HttpStatus setUserProfile(@RequestBody ProfileDto profileDto) {
        UserEntity user = userService.getByEmail(profileDto.getUserEmail());
        ProfileEntity profile = user.getProfile();
        if (profileDto.getFirstName() != null) {
            profile.setFirstName(profileDto.getFirstName());
        }
        if (profileDto.getLastName() != null) {
            profile.setLastName(profileDto.getLastName());
        }
        user.setProfile(profile);
        userService.createOrUpdate(user);
        return HttpStatus.OK;
    }
}
