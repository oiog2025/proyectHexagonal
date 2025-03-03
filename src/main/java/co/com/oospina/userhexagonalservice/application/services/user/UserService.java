package co.com.oospina.userhexagonalservice.application.services.user;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.application.mapper.UserMapper;
import co.com.oospina.userhexagonalservice.application.usescases.userscomplete.GetUsersByIdUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserService implements IUsers {

    private final GetUsersByIdUseCase getUsersByIdUseCase;

    @Override
    public UsersDto getUsersById(Long id) {
        return UserMapper.toUserDto(getUsersByIdUseCase.getUserById(id));
    }

}
