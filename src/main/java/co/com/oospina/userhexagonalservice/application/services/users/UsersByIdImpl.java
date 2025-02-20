package co.com.oospina.userhexagonalservice.application.services.users;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.application.mapper.MappersUtility;
import co.com.oospina.userhexagonalservice.application.usescases.GetUsersByIdUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class UsersByIdImpl implements IUsersById {

    private final GetUsersByIdUseCase getUsersByIdUseCase;
    private final MappersUtility mapper;

    @Override
    public UsersDto getPostUserById(Integer id) {
        return mapper.toUsersDto(getUsersByIdUseCase.getPostUserById(id));
    }
}
