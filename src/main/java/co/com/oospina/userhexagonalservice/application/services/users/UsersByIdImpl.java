package co.com.oospina.userhexagonalservice.application.services.users;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.application.mapper.UserMapper;
import co.com.oospina.userhexagonalservice.application.usescases.GetUsersByIdUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersByIdImpl implements IUsersById {

    private final GetUsersByIdUseCase getUsersByIdUseCase;
    //TODO se implenta el CU de POST

    @Override
    public UsersDto getPostUserById(Long id) {
        //TODO se implementa la logica de los 2 consumos
        return UserMapper.toUserDto(getUsersByIdUseCase.getUserById(id));
    }
}
