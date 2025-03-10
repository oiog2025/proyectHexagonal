package co.com.oospina.userhexagonalservice.infrastructure.jpa;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.application.mapper.UserMapper;
import co.com.oospina.userhexagonalservice.application.port.output.IUpdateUserOutput;
import co.com.oospina.userhexagonalservice.infrastructure.jpa.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;


@AllArgsConstructor
@Component
public class UpdateUserAdapter implements IUpdateUserOutput {

    private final UserRepository userRepository;

    @Override
    public UsersDto updateUserDto(UsersDto usersDto) {
        return UserMapper.toUserDto(userRepository.save(UserMapper.toUserEntity(usersDto)));
    }
}
