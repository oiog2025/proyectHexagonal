package co.com.oospina.userhexagonalservice.application.dto.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class PokemonDto {
  private Long id;

  @JsonProperty("max_harvest")
  private String maxHarvest;

  private String name;

  @JsonProperty("natural_gift_power")
  private long naturalGiftPower;
}
