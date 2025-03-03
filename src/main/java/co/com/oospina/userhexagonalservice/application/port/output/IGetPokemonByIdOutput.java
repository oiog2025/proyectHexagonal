package co.com.oospina.userhexagonalservice.application.port.output;

import co.com.oospina.userhexagonalservice.application.dto.users.PokemonDto;

public interface IGetPokemonByIdOutput {

    PokemonDto getPokemonById(Long id);
}
