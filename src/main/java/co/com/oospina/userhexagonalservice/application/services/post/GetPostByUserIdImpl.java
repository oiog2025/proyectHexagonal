package co.com.oospina.userhexagonalservice.application.services.post;


import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.application.mapper.MappersUtility;
import co.com.oospina.userhexagonalservice.application.usescases.GetUsersPostByIdUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetPostByUserIdImpl  implements IGetPostByUserId {

    private  final GetUsersPostByIdUseCase getPostUserByIdUseCase;
    private  final MappersUtility mapper;

    @Override
    public UsersDto getPostByUserId(Integer id) {
        return mapper.toUsersDto(getPostUserByIdUseCase.getPostUserById(id));
    }
}
