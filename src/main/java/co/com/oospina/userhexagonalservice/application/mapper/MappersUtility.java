package co.com.oospina.userhexagonalservice.application.mapper;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.application.dto.users.UsersPostDto;
import co.com.oospina.userhexagonalservice.domain.models.Users;
import co.com.oospina.userhexagonalservice.domain.models.UsersPost;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
public interface MappersUtility {
    Users toUsers(UsersDto usersDto);
    UsersDto toUsersDto(Users user);
    UsersPostDto toUsersPostDto(UsersPost usersPost);
    UsersPost toUsersPost(UsersPostDto usersPostDto);
}
