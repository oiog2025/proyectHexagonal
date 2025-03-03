package co.com.oospina.userhexagonalservice.application.services.usercomplete;

import co.com.oospina.userhexagonalservice.application.dto.users.UserCompleteDto;
import co.com.oospina.userhexagonalservice.application.mapper.PokemonMapper;
import co.com.oospina.userhexagonalservice.application.mapper.UserMapper;
import co.com.oospina.userhexagonalservice.application.usescases.userscomplete.GetPokemonByIdUseCase;
import co.com.oospina.userhexagonalservice.application.usescases.userscomplete.GetUsersByIdUseCase;
import co.com.oospina.userhexagonalservice.domain.models.Pokemon;
import co.com.oospina.userhexagonalservice.domain.models.Users;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserCompleteService implements IUsersComplete {

private final GetUsersByIdUseCase getUsersByIdUseCase;
private final GetPokemonByIdUseCase pokemonUseCase;
  public UserCompleteDto getUserComplete(Long id) {

    Users user = getUsersByIdUseCase.getUserById(id);
    Pokemon pokemon = pokemonUseCase.getPokemonById(id);

    return new UserCompleteDto().builder()
            .users(UserMapper.toUserDto(user))
            .pokemon(PokemonMapper.toPokemonDto(pokemon))
            .build();
  }
}
