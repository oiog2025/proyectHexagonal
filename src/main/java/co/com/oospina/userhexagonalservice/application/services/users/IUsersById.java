package co.com.oospina.userhexagonalservice.application.services.users;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;

public interface IUsersById {
    UsersDto getPostUserById(Long id);
}
