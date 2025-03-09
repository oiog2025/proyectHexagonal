package co.com.oospina.userhexagonalservice.infrastructure.controllers.users;


import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.application.services.user.IUsers;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final IUsers iUsers;

    @GetMapping("/{id}")
    public ResponseEntity<UsersDto> getUsers(@PathVariable Long id) {
        return ResponseEntity.ok(iUsers.getUsersById(id));
    }

    @PostMapping()
    public ResponseEntity<UsersDto> saveUser(@RequestBody UsersDto usersDto) throws Exception {
        return ResponseEntity.ok(iUsers.saveUser(usersDto));
    }

}
