package co.com.oospina.userhexagonalservice.application.dto.users;

public record UsersDto(
        Integer id,
        String email,
        Boolean active,
        Integer thirdPartyId,
        String channel
) {}
