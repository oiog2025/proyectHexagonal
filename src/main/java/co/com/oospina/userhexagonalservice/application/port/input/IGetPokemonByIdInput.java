package co.com.oospina.userhexagonalservice.application.port.input;

import co.com.oospina.userhexagonalservice.domain.models.Pokemon;

public interface IGetPokemonByIdInput {
    Pokemon getPokemonById(Long id);
}
