package co.com.oospina.userhexagonalservice.application.services.user;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.application.mapper.UserMapper;
import co.com.oospina.userhexagonalservice.application.usescases.users.SaveUserUseCase;
import co.com.oospina.userhexagonalservice.application.usescases.userscomplete.GetUsersByIdUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import static co.com.oospina.userhexagonalservice.utilities.EncryptPassword.encryptPassword;

@Component
@AllArgsConstructor
public class UserService implements IUsers {

    private final GetUsersByIdUseCase getUsersByIdUseCase;
    private final SaveUserUseCase saveUserUseCase;

    @Override
    public UsersDto getUsersById(Long id) {
        return UserMapper.toUserDto(getUsersByIdUseCase.getUserById(id));
    }

    @Override
    public UsersDto saveUser(UsersDto usersDto) throws Exception {
        usersDto.setPassword(encryptPassword(usersDto.getPassword()));
        return UserMapper.toUserDto(saveUserUseCase.saveUser(UserMapper.toUsers(usersDto)));
    }

}
