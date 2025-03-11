//package co.com.oospina.userhexagonalservice.infrastructure.controllers.usercomplete;
//
//import co.com.oospina.userhexagonalservice.application.services.usercomplete.IUsersComplete;
//import lombok.AllArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//
//@RequestMapping("/api/v1")
//@AllArgsConstructor
//public class UserCompleteController {
//
//    private final IUsersComplete iUsersById;
//
//    @GetMapping("/users/{id}")
//    public ResponseEntity<?> getUserByIdAndPokemonId(@PathVariable Long id) {
//        return ResponseEntity.ok(iUsersById.getUserComplete(id));
//    }
//}

package co.com.oospina.userhexagonalservice.infrastructure.controllers.usercomplete;

import co.com.oospina.userhexagonalservice.application.services.usercomplete.IUsersComplete;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
@Tag(name = "Usuarios Completos", description = "API para obtener información completa de un usuario")
public class UserCompleteController {

    private final IUsersComplete iUsersById;

    @Operation(
            summary = "Obtener usuario completo por ID",
            description = "Retorna la información completa de un usuario, incluyendo detalles adicionales.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Usuario encontrado",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = Object.class))),  // Cambia Object si tienes un DTO específico
                    @ApiResponse(responseCode = "404", description = "Usuario no encontrado"),
                    @ApiResponse(responseCode = "500", description = "Error interno del servidor")
            }
    )
    @GetMapping("/users/{id}")
    public ResponseEntity<?> getUserByIdAndPokemonId(@PathVariable Long id) {
        return ResponseEntity.ok(iUsersById.getUserComplete(id));
    }
}

