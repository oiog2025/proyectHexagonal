package co.com.oospina.userhexagonalservice.application.port.output;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;

public interface IGetUsersByIdOutput {
    UsersDto getUsersById(Long id);
}
