package co.com.oospina.userhexagonalservice.infrastructure.jpa;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.application.mapper.UserMapper;
import co.com.oospina.userhexagonalservice.application.port.output.ISaveUserOutput;
import co.com.oospina.userhexagonalservice.infrastructure.jpa.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class SaveUserAdapter implements ISaveUserOutput {

    private final UserRepository userRepository;

    @Override
    public UsersDto saveUser(UsersDto usersDto) {
        return UserMapper.toUserDto(userRepository.save(UserMapper.toUserEntity(usersDto)));
    }
}
