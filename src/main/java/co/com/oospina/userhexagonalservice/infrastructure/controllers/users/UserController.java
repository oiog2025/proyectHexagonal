//package co.com.oospina.userhexagonalservice.infrastructure.controllers.users;
//
//
//import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
//import co.com.oospina.userhexagonalservice.application.services.user.IUsers;
//import io.swagger.v3.oas.annotations.tags.Tag;
//import lombok.AllArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/users")
//@AllArgsConstructor
//@Tag(name = "Productos", description = "API para gestionar productos")
//public class UserController {
//
//    private final IUsers iUsers;
//
//    @Transactional(readOnly = true)
//    @GetMapping("/{id}")
//    public ResponseEntity<UsersDto> getUserById(@PathVariable Long id) {
//        return ResponseEntity.ok(iUsers.getUsersById(id));
//    }
//
//    @PostMapping()
//    public ResponseEntity<UsersDto> saveUser(@RequestBody UsersDto usersDto) throws Exception {
//        return ResponseEntity.ok(iUsers.saveUser(usersDto));
//    }
//
//    @PostMapping("/update")
//    public ResponseEntity<UsersDto> updateUser(@RequestBody UsersDto usersDto) throws Exception {
//        return ResponseEntity.ok(iUsers.updateUser(usersDto));
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<Void> eliminar(@PathVariable Long id) throws Exception {
//        iUsers.deleteUserById(id);
//        return ResponseEntity.ok().build();
//    }
//
//}
package co.com.oospina.userhexagonalservice.infrastructure.controllers.users;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.application.services.user.IUsers;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
@Tag(name = "Usuarios", description = "API para gestionar usuarios")
public class UserController {

    private final IUsers iUsers;

    @Operation(
            summary = "Obtener usuario por ID",
            description = "Retorna un usuario específico dado su ID",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Usuario encontrado",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = UsersDto.class))),
                    @ApiResponse(responseCode = "404", description = "Usuario no encontrado"),
                    @ApiResponse(responseCode = "500", description = "Error interno del servidor")
            }
    )
    @Transactional(readOnly = true)
    @GetMapping("/{id}")
    public ResponseEntity<UsersDto> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(iUsers.getUsersById(id));
    }

    @Operation(
            summary = "Guardar un usuario",
            description = "Guarda un nuevo usuario en la base de datos",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Usuario creado exitosamente"),
                    @ApiResponse(responseCode = "400", description = "Error en la solicitud"),
                    @ApiResponse(responseCode = "500", description = "Error interno del servidor")
            }
    )
    @PostMapping()
    public ResponseEntity<UsersDto> saveUser(@RequestBody UsersDto usersDto) throws Exception {
        return ResponseEntity.ok(iUsers.saveUser(usersDto));
    }

    @Operation(
            summary = "Actualizar un usuario",
            description = "Actualiza la información de un usuario existente",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Usuario actualizado exitosamente"),
                    @ApiResponse(responseCode = "404", description = "Usuario no encontrado"),
                    @ApiResponse(responseCode = "500", description = "Error interno del servidor")
            }
    )
    @PostMapping("/update")
    public ResponseEntity<UsersDto> updateUser(@RequestBody UsersDto usersDto) throws Exception {
        return ResponseEntity.ok(iUsers.updateUser(usersDto));
    }

    @Operation(
            summary = "Eliminar un usuario",
            description = "Elimina un usuario dado su ID",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Usuario eliminado exitosamente"),
                    @ApiResponse(responseCode = "404", description = "Usuario no encontrado"),
                    @ApiResponse(responseCode = "500", description = "Error interno del servidor")
            }
    )
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) throws Exception {
        iUsers.deleteUserById(id);
        return ResponseEntity.ok().build();
    }
}
