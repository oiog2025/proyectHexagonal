package co.com.oospina.userhexagonalservice.application.mapper;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.domain.models.Users;
import co.com.oospina.userhexagonalservice.infrastructure.jpa.models.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

//@Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)

@Mapper(componentModel = "spring")
public interface MappersUser {
    MappersUser INSTANCE = Mappers.getMapper(MappersUser.class);

    Users toUsers(UsersDto usersDto);
    UsersDto toUsersDto(Users user);

    // TODO pasarlos a otro mapper en la capa de infraestructura
    UsersDto toUserDto(UserEntity userEntity);
    UserEntity toUserEntity(UsersDto usersDto);
//    UsersPostDto toUsersPostDto(UsersPost usersPost);
//    UsersPost toUsersPost(UsersPostDto usersPostDto);
}
