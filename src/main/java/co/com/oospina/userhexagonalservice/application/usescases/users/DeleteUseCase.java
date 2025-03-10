package co.com.oospina.userhexagonalservice.application.usescases.users;

import co.com.oospina.userhexagonalservice.application.port.input.IDeleteUserByIdInput;
import co.com.oospina.userhexagonalservice.application.port.output.IDeleteUserByIdOutput;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class DeleteUseCase implements IDeleteUserByIdInput {

    private final IDeleteUserByIdOutput iDeleteUserByIdOutput;

    @Override
    public void deleteUserById(Long id) {
        iDeleteUserByIdOutput.deleteUserById(id);
    }
}
