package co.com.oospina.userhexagonalservice.application.services.post;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;

public interface IGetPostByUserId {
    UsersDto getPostByUserId(Integer id);
}
