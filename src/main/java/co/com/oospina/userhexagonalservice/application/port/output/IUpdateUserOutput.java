package co.com.oospina.userhexagonalservice.application.port.output;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;

public interface IUpdateUserOutput {
    UsersDto updateUserDto(UsersDto usersDto);
}
