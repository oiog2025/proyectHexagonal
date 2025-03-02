package co.com.oospina.userhexagonalservice.infrastructure.controllers;

import co.com.oospina.userhexagonalservice.application.services.users.IUsersById;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private final IUsersById iUsersById;

    @GetMapping("/users/{id}")
    public ResponseEntity<?> getUsersById(@PathVariable Long id) {
        return ResponseEntity.ok(iUsersById.getPostUserById(id));
    }
}
