package ua.nure.egeometry.egeometry.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    private String email;
    private String password;
    private String username;
    private String role;

}
