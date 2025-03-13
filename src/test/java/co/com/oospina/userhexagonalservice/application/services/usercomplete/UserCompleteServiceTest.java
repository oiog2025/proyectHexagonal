package co.com.oospina.userhexagonalservice.application.services.usercomplete;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import co.com.oospina.userhexagonalservice.application.dto.users.PokemonDto;
import co.com.oospina.userhexagonalservice.application.dto.users.UserCompleteDto;
import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.application.mapper.PokemonMapper;
import co.com.oospina.userhexagonalservice.application.mapper.UserMapper;
import co.com.oospina.userhexagonalservice.application.usescases.userscomplete.GetPokemonByIdUseCase;
import co.com.oospina.userhexagonalservice.application.usescases.userscomplete.GetUsersByIdUseCase;
import co.com.oospina.userhexagonalservice.domain.models.Pokemon;
import co.com.oospina.userhexagonalservice.domain.models.Users;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserCompleteServiceTest {

  @Mock private GetUsersByIdUseCase getUsersByIdUseCase;

  @Mock private GetPokemonByIdUseCase pokemonUseCase;

  @InjectMocks private UserCompleteService userCompleteService;

  @Mock private UserMapper userMapper;

  @Mock private PokemonMapper pokemonMapper;

  private PokemonDto pokemonDto;
  private UserCompleteDto userCompleteDto;
  private Users mockUser;
  private Pokemon mockPokemon;

  @BeforeEach
  void setUp() {
    mockUser = new Users(1L, "Armenia", "Ospina", "Gonzalez", "123456", "Admin", "Oscar");

    mockPokemon = new Pokemon(1L, "Pikachu", "100", 50);
  }

  @Test
  @DisplayName("Test getUsersComplete - Successful Case")
  void testGetUsersComplete_Success() throws Exception {
    Long userId = 1L;
    // Simular comportamiento de los casos de uso
    when(getUsersByIdUseCase.getUserById(userId)).thenReturn(mockUser);
    when(pokemonUseCase.getPokemonById(userId)).thenReturn(mockPokemon);

    UserCompleteDto userComplete = userCompleteService.getUserComplete(userId);
    // Verificaciones
    assertNotNull(userComplete);
    assertEquals("Armenia", mockUser.country());
    assertEquals("Pikachu", mockPokemon.maxHarvest());

    // Verificar que los métodos fueron llamados correctamente
    verify(getUsersByIdUseCase, times(1)).getUserById(userId);
    verify(pokemonUseCase, times(1)).getPokemonById(userId);
  }

    @Test
    @DisplayName("Test getUsersComplete - User Not Found")
    void testGetUsersComplete_UserNotFound() {
        Long userId = 2L;
        when(getUsersByIdUseCase.getUserById(userId)).thenThrow(new RuntimeException("User not found"));

        Exception exception = assertThrows(RuntimeException.class, () -> userCompleteService.getUserComplete(userId));

        assertEquals("User not found", exception.getMessage());
        verify(pokemonUseCase, never()).getPokemonById(anyLong());
    }
}
