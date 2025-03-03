package co.com.oospina.userhexagonalservice.application.usescases.userscomplete;

import co.com.oospina.userhexagonalservice.application.mapper.PokemonMapper;
import co.com.oospina.userhexagonalservice.application.port.input.IGetPokemonByIdInput;
import co.com.oospina.userhexagonalservice.application.port.output.IGetPokemonByIdOutput;
import co.com.oospina.userhexagonalservice.domain.models.Pokemon;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class GetPokemonByIdUseCase implements IGetPokemonByIdInput {

    private final IGetPokemonByIdOutput iGetPokemonByIdOutput;
    @Override
    public Pokemon getPokemonById(Long id) {
        return PokemonMapper.toPokemon(iGetPokemonByIdOutput.getPokemonById(id));
    }
}
