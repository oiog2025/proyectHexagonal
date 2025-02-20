package co.com.oospina.userhexagonalservice.application.services.userspost;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersPostDto;
import co.com.oospina.userhexagonalservice.application.port.output.IGetUsersPostOutput;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UsersPostImpl implements IUsersPost {

    private final IGetUsersPostOutput iGetUsersPost;

    @Override
    public UsersPostDto getUsersPost(Integer id) {
        return iGetUsersPost.getUsersPost(id);
    }
}
