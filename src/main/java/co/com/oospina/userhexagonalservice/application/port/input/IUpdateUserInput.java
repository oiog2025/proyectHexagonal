package co.com.oospina.userhexagonalservice.application.port.input;

import co.com.oospina.userhexagonalservice.domain.models.Users;

public interface IUpdateUserInput {
    Users updateUser(Users user);
}
