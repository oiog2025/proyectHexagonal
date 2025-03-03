package co.com.oospina.userhexagonalservice.infrastructure.client;

import co.com.oospina.userhexagonalservice.application.dto.users.PokemonDto;
import co.com.oospina.userhexagonalservice.application.port.output.IGetPokemonByIdOutput;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@AllArgsConstructor
public class PokemonClient implements IGetPokemonByIdOutput {

    private final RestTemplate restTemplate;
    //TODO consumo del cliente pokemon https://pokeapi.co/api/v2/berry/1
    @Override
    public PokemonDto getPokemonById(Long id) {

        String url = "https://pokeapi.co/api/v2/berry/" + id;
        return restTemplate.getForObject(url, PokemonDto.class);
    }
}
