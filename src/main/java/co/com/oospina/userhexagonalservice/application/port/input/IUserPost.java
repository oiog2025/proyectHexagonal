package co.com.oospina.userhexagonalservice.application.port.input;

import co.com.oospina.userhexagonalservice.domain.models.UsersPost;

public interface IUserPost {
    UsersPost getAllUsersPostById(Integer id);
}
