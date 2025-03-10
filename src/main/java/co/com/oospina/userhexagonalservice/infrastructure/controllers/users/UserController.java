package co.com.oospina.userhexagonalservice.infrastructure.controllers.users;


import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.application.services.user.IUsers;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final IUsers iUsers;

    @Transactional(readOnly = true)
    @GetMapping("/{id}")
    public ResponseEntity<UsersDto> getUsers(@PathVariable Long id) {
        return ResponseEntity.ok(iUsers.getUsersById(id));
    }

    @PostMapping()
    public ResponseEntity<UsersDto> saveUser(@RequestBody UsersDto usersDto) throws Exception {
        return ResponseEntity.ok(iUsers.saveUser(usersDto));
    }

    @GetMapping("/update")
    public ResponseEntity<UsersDto> updateUser(@RequestBody UsersDto usersDto) throws Exception {
        return ResponseEntity.ok(iUsers.updateUser(usersDto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) throws Exception {
        iUsers.deleteUserById(id);
        return ResponseEntity.ok().build();
    }

}
