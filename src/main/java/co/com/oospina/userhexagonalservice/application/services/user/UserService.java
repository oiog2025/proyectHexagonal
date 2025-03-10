package co.com.oospina.userhexagonalservice.application.services.user;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.application.mapper.UserMapper;
import co.com.oospina.userhexagonalservice.application.usescases.users.DeleteUseCase;
import co.com.oospina.userhexagonalservice.application.usescases.users.SaveUserUseCase;
import co.com.oospina.userhexagonalservice.application.usescases.users.UpdateUserUseCase;
import co.com.oospina.userhexagonalservice.application.usescases.userscomplete.GetUsersByIdUseCase;
import co.com.oospina.userhexagonalservice.infrastructure.jpa.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import static co.com.oospina.userhexagonalservice.utilities.EncryptPassword.encryptPassword;

@Component
@AllArgsConstructor
public class UserService implements IUsers {

  private final GetUsersByIdUseCase getUsersByIdUseCase;
  private final SaveUserUseCase saveUserUseCase;
  private final UpdateUserUseCase updateUserUseCase;
  private final UserRepository userRepository;
  private final DeleteUseCase deleteUseCase;

  @Override
  public UsersDto getUsersById(Long id) {
    return UserMapper.toUserDto(getUsersByIdUseCase.getUserById(id));
  }

  @Override
  public UsersDto saveUser(UsersDto usersDto) throws Exception {
    usersDto.setPassword(encryptPassword(usersDto.getPassword()));
    return UserMapper.toUserDto(saveUserUseCase.saveUser(UserMapper.toUsers(usersDto)));
  }

  @Override
  public UsersDto updateUser(UsersDto usersDto) throws Exception {
    if (userRepository.findById(usersDto.getId()).isEmpty()) {
      throw new Exception("El usuario no existe");
    }
    return UserMapper.toUserDto(updateUserUseCase.updateUser(UserMapper.toUsers(usersDto)));
  }

  @Override
  public void deleteUserById(Long id) throws Exception {
    if (userRepository.findById(id).isEmpty()) {
      throw new Exception("El usuario no existe");
    }
    deleteUseCase.deleteUserById(id);
  }
}
