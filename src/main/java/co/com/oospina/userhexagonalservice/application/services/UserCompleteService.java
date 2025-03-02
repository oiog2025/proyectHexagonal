package co.com.oospina.userhexagonalservice.application.services;

import co.com.oospina.userhexagonalservice.application.dto.users.UserCompleteDto;
import co.com.oospina.userhexagonalservice.application.usescases.GetUsersByIdUseCase;
import co.com.oospina.userhexagonalservice.application.usescases.GetUsersPostByIdUseCase;
import co.com.oospina.userhexagonalservice.domain.models.Users;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserCompleteService implements IUsersComplete {

    //TODO: implementa CU user y CUPOST
    // hacer interface
private final GetUsersByIdUseCase getUsersByIdUseCase;
private final GetUsersPostByIdUseCase getUsersPostByIdUseCase;


    public UserCompleteDto getUserComplete(Long id) {


        Users user = getUsersByIdUseCase.getUserById(id);
        //TODO user
        // userPost

        return null;
    }

}
