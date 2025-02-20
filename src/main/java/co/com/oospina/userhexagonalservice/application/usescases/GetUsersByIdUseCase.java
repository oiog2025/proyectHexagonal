package co.com.oospina.userhexagonalservice.application.usescases;

import co.com.oospina.userhexagonalservice.application.mapper.MappersUtility;
import co.com.oospina.userhexagonalservice.application.port.input.IGetPostUserByIdInput;
import co.com.oospina.userhexagonalservice.application.port.output.IGetUsersByIdOutput;
import co.com.oospina.userhexagonalservice.domain.models.Users;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GetUsersByIdUseCase implements IGetPostUserByIdInput {

  private final IGetUsersByIdOutput getUsersByIdOutput;
  private final MappersUtility mapper;

    @Override
  public Users getPostUserById(Integer id) {
    return mapper.toUsers(getUsersByIdOutput.getUsersById(id));
  }
}
