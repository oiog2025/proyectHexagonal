package co.com.oospina.userhexagonalservice.infrastructure.jpa.repositories;

import co.com.oospina.userhexagonalservice.application.port.output.IDeleteUserByIdOutput;
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
