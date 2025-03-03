package co.com.oospina.userhexagonalservice.application.dto.users;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCompleteDto {

    private UsersDto users;
    private PokemonDto pokemon;
}
