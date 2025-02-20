package co.com.oospina.userhexagonalservice.application.port.input;

import co.com.oospina.userhexagonalservice.domain.models.Users;

public interface IGetPostUserByIdInput {
  Users getPostUserById(Integer id);
}

