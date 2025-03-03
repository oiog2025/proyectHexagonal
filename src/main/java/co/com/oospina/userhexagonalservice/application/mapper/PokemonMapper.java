package co.com.oospina.userhexagonalservice.application.mapper;

import co.com.oospina.userhexagonalservice.application.dto.users.PokemonDto;
import co.com.oospina.userhexagonalservice.domain.models.Pokemon;

public class PokemonMapper {

  public static PokemonDto toPokemonDto(Pokemon user) {
    return new PokemonDto(user.id(), user.maxHarvest(), user.name(), user.naturalGiftPower());
  }

  public static Pokemon toPokemon(PokemonDto usersDto) {
    return new Pokemon(
        usersDto.getId(),
        usersDto.getMaxHarvest(),
        usersDto.getName(),
        usersDto.getNaturalGiftPower());
  }
}
