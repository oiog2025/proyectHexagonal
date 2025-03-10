package co.com.oospina.userhexagonalservice.application.services.user;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;

public interface IUsers {
    UsersDto getUsersById(Long id);
    UsersDto saveUser(UsersDto usersDto) throws Exception;
    UsersDto updateUser(UsersDto usersDto) throws Exception;
    void deleteUserById(Long id) throws Exception;
}
