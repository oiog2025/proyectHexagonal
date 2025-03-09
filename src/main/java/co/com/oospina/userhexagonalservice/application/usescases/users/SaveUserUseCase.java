package co.com.oospina.userhexagonalservice.application.usescases.users;

import co.com.oospina.userhexagonalservice.application.mapper.UserMapper;
import co.com.oospina.userhexagonalservice.application.port.input.ISaveUserInput;
import co.com.oospina.userhexagonalservice.application.port.output.ISaveUserOutput;
import co.com.oospina.userhexagonalservice.domain.models.Users;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SaveUserUseCase implements ISaveUserInput {

    private final ISaveUserOutput saveUserOutput;
    @Override
    public Users saveUser(Users user) {
        return UserMapper.toUsers( saveUserOutput.saveUser(UserMapper.toUserDto(user))) ;
    }

}
