package co.com.oospina.userhexagonalservice.infrastructure.jpa;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.application.mapper.UserMapper;
import co.com.oospina.userhexagonalservice.application.port.output.IGetUsersByIdOutput;
import co.com.oospina.userhexagonalservice.infrastructure.jpa.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@AllArgsConstructor
public class GetUserByIdAdapter implements IGetUsersByIdOutput {

    private final UserRepository userRepository;

    @Override
    public UsersDto getUsersById(Long id) {
        if (userRepository.findById(id).isEmpty()) {
            throw new RuntimeException("El usuario no existe");
        }
        return UserMapper.toUserDto(Objects.requireNonNull(userRepository.findById(id).orElse(null)));
    }
}