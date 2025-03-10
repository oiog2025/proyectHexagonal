package co.com.oospina.userhexagonalservice.infrastructure.controllers.usercomplete;

import co.com.oospina.userhexagonalservice.application.services.usercomplete.IUsersComplete;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api/v1")
@AllArgsConstructor
public class UserCompleteController {

    private final IUsersComplete iUsersById;

    @GetMapping("/users/{id}")
    public ResponseEntity<?> getUserByIdAndPokemonId(@PathVariable Long id) {
        return ResponseEntity.ok(iUsersById.getUserComplete(id));
    }
}
