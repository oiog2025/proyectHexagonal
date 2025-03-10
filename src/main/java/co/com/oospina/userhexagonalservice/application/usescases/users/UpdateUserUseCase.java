package co.com.oospina.userhexagonalservice.application.usescases.users;

import co.com.oospina.userhexagonalservice.application.mapper.UserMapper;
import co.com.oospina.userhexagonalservice.application.port.input.IUpdateUserInput;
import co.com.oospina.userhexagonalservice.application.port.output.IUpdateUserOutput;
import co.com.oospina.userhexagonalservice.domain.models.Users;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UpdateUserUseCase implements IUpdateUserInput {

  private final IUpdateUserOutput updateUserOutput;

  @Override
  public Users updateUser(Users user) {
    return UserMapper.toUsers(updateUserOutput.updateUserDto(UserMapper.toUserDto(user)));
  }
}
