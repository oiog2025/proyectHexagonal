package co.com.oospina.userhexagonalservice.application.mapper;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.domain.models.Users;
import co.com.oospina.userhexagonalservice.infrastructure.jpa.models.UserEntity;

public class UserMapper {
    public static UsersDto toUserDto(Users user) {
        return new UsersDto(user.id(), user.country(), user.first_name(), user.last_name(), user.password(), user.rol(), user.username());
    }

    public static Users toUsers(UsersDto usersDto) {
        return new Users(usersDto.id(), usersDto.country(), usersDto.first_name(), usersDto.last_name(), usersDto.password(), usersDto.rol(), usersDto.username());
    }

    public static UsersDto toUserDto(UserEntity userEntity) {
        return new UsersDto(userEntity.getId(), userEntity.getCountry(), userEntity.getFirstName(), userEntity.getLastName(), userEntity.getPassword(), userEntity.getRol(), userEntity.getUsername());
    }
}
