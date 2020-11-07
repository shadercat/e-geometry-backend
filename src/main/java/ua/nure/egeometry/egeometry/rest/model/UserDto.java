package ua.nure.egeometry.egeometry.rest.model;

import lombok.Data;
import ua.nure.egeometry.egeometry.entity.ProfileEntity;

@Data
public class UserDto {
    private String id;
    private String email;
    private String password;
    private String username;
    private String firstName;
    private String lastName;
    private ProfileEntity profile;
}