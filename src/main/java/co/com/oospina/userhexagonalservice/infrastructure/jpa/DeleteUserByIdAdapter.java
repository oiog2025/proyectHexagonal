package co.com.oospina.userhexagonalservice.infrastructure.jpa;

import co.com.oospina.userhexagonalservice.application.port.output.IDeleteUserByIdOutput;
import co.com.oospina.userhexagonalservice.infrastructure.jpa.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DeleteUserByIdAdapter implements IDeleteUserByIdOutput {

  private final UserRepository userRepository;

  @Override
  public void deleteUserById(Long id) {
    userRepository.deleteById(id);
  }
}
