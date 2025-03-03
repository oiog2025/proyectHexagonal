package co.com.oospina.userhexagonalservice.infrastructure.controllers.users;


import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.application.services.user.IUsers;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final IUsers iUsers;

    @GetMapping("/{id}")
    public ResponseEntity<UsersDto> getUsers(@PathVariable Long id) {
        return ResponseEntity.ok(iUsers.getUsersById(id));
    }

}
