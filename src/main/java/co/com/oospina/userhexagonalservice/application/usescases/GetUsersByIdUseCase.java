package co.com.oospina.userhexagonalservice.application.usescases;

import co.com.oospina.userhexagonalservice.application.mapper.UserMapper;
import co.com.oospina.userhexagonalservice.application.port.input.IGetUserByIdInput;
import co.com.oospina.userhexagonalservice.application.port.output.IGetUsersByIdOutput;
import co.com.oospina.userhexagonalservice.domain.models.Users;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GetUsersByIdUseCase implements IGetUserByIdInput {

  private final IGetUsersByIdOutput getUsersByIdOutput;

  @Override
  public Users getUserById(Long id) {
    return UserMapper.toUsers(getUsersByIdOutput.getUsersById(id));
  }
}
