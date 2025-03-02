package co.com.oospina.userhexagonalservice.infrastructure.jpa;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.application.mapper.MappersUser;
import co.com.oospina.userhexagonalservice.application.mapper.UserMapper;
import co.com.oospina.userhexagonalservice.application.port.output.IGetUsersByIdOutput;
import co.com.oospina.userhexagonalservice.infrastructure.jpa.repositories.UserRepository;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class GetUserByIdAdapter implements IGetUsersByIdOutput {

    private final UserRepository userRepository;
//    private final MappersUser mapper;

    public GetUserByIdAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
//        this.mapper = mapper;
    }

    @Override
    public UsersDto getUsersById(Long id) {
        return UserMapper.toUserDto(Objects.requireNonNull(userRepository.findById(id).orElse(null)));
    }
}