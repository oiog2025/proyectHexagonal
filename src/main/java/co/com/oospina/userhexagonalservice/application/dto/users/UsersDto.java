package co.com.oospina.userhexagonalservice.application.dto.users;

public record UsersDto(
        Long id,
        String country,
        String first_name,
        String last_name,
        String password,
        String rol,
        String username
) {}
