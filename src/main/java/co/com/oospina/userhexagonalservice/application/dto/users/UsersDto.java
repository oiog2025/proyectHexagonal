package co.com.oospina.userhexagonalservice.application.dto.users;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto {
    private Long id;
    private String country;
    private String first_name;
    private String last_name;
    private String password;
    private String rol;
    private String username;
}
