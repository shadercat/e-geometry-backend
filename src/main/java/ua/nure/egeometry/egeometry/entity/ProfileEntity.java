package ua.nure.egeometry.egeometry.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProfileEntity {
    @Id
    private String id;
    private String firstName;
    private String lastName;
}
