package co.com.oospina.userhexagonalservice.application.port.output;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersPostDto;

public interface IGetUsersPostOutput {
    
    UsersPostDto getUsersPost(Integer id);
}
