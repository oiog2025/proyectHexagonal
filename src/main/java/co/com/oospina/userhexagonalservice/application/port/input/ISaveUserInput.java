package co.com.oospina.userhexagonalservice.application.port.input;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.domain.models.Users;

public interface ISaveUserInput {

    Users saveUser(Users user);

}
