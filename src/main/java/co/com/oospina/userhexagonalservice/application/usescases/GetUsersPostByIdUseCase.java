package co.com.oospina.userhexagonalservice.application.usescases;
import co.com.oospina.userhexagonalservice.application.mapper.MappersUser;
import co.com.oospina.userhexagonalservice.application.port.input.IGetPostUserByIdInput;
import co.com.oospina.userhexagonalservice.application.port.output.IGetUsersPostByIdOutput;
import co.com.oospina.userhexagonalservice.domain.models.Users;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GetUsersPostByIdUseCase  {

//    private final IGetUsersPostByIdOutput getUsersPostByIdOutput;
//    private final MappersUser mapper;

//    @Override
//    public Users getPostUserById(Integer id) {
//        return mapper.toUsers(getUsersPostByIdOutput.getAllUsersPostById(id));
//    }
}
