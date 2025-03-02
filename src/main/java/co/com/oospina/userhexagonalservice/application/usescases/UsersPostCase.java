package co.com.oospina.userhexagonalservice.application.usescases;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersPostDto;
import co.com.oospina.userhexagonalservice.application.mapper.MappersUser;
import co.com.oospina.userhexagonalservice.application.port.input.IUserPost;
import co.com.oospina.userhexagonalservice.application.port.output.IGetUsersPostOutput;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class UsersPostCase implements IGetUsersPostOutput {

//    private final IUserPost usersPostUseCase;
   // private final MappersUser mapper;

    @Override
    public UsersPostDto getUsersPost(Integer id) {
//        return mapper.toUsersPostDto(usersPostUseCase.getAllUsersPostById(id));
        return null;
    }
}
