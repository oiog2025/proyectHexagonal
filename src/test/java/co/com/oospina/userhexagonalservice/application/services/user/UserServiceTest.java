//package co.com.oospina.userhexagonalservice.application.services.user;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.ArgumentMatchers.eq;
//import static org.mockito.ArgumentMatchers.isA;
//import static org.mockito.ArgumentMatchers.isNull;
//import static org.mockito.Mockito.doNothing;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
//import co.com.oospina.userhexagonalservice.application.usescases.users.DeleteUseCase;
//import co.com.oospina.userhexagonalservice.application.usescases.users.SaveUserUseCase;
//import co.com.oospina.userhexagonalservice.application.usescases.users.UpdateUserUseCase;
//import co.com.oospina.userhexagonalservice.application.usescases.userscomplete.GetUsersByIdUseCase;
//import co.com.oospina.userhexagonalservice.domain.models.Users;
//import co.com.oospina.userhexagonalservice.infrastructure.jpa.models.UserEntity;
//import co.com.oospina.userhexagonalservice.infrastructure.jpa.repositories.UserRepository;
//import java.util.Optional;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Tag;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.aot.DisabledInAotMode;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//@ContextConfiguration(classes = {UserService.class})
//@ExtendWith(SpringExtension.class)
//@DisabledInAotMode
//class UserServiceDiffblueTest {
//
//  @MockBean private GetUsersByIdUseCase getUsersByIdUseCase;
//
//  @Autowired private UserService userService;
//
//  @MockBean private SaveUserUseCase saveUserUseCase;
//
//  @MockBean private UpdateUserUseCase updateUserUseCase;
//
//  @MockBean private UserRepository userRepository;
//
//  @MockBean private DeleteUseCase deleteUseCase;
//
//  @Test
//  @DisplayName("Test getUsersById(Long); then return Password is '0123456789ABCDEF'")
//  @Tag("MaintainedByDiffblue")
//  void testGetUsersById_thenReturnPasswordIs0123456789abcdef() {
//    // Arrange
//    when(getUsersByIdUseCase.getUserById(Mockito.<Long>any()))
//        .thenReturn(
//            new Users(1L, "GB", "Jane", "Doe", "0123456789ABCDEF", "0123456789ABCDEF", "janedoe"));
//
//    // Act
//    UsersDto actualUsersById = userService.getUsersById(1L);
//
//    // Assert
//    verify(getUsersByIdUseCase).getUserById(eq(1L));
//    assertEquals("0123456789ABCDEF", actualUsersById.getPassword());
//    assertEquals("0123456789ABCDEF", actualUsersById.getRol());
//    assertEquals("Doe", actualUsersById.getLast_name());
//    assertEquals("GB", actualUsersById.getCountry());
//    assertEquals("Jane", actualUsersById.getFirst_name());
//    assertEquals("janedoe", actualUsersById.getUsername());
//    assertEquals(1L, actualUsersById.getId().longValue());
//  }
//
//  @Test
//  @DisplayName("Test saveUser(UsersDto); then return Password is '0123456789ABCDEF'")
//  @Tag("MaintainedByDiffblue")
//  void testSaveUser_thenReturnPasswordIs0123456789abcdef() throws Exception {
//    // Arrange
//    when(saveUserUseCase.saveUser(Mockito.<Users>any()))
//        .thenReturn(
//            new Users(1L, "GB", "Jane", "Doe", "0123456789ABCDEF", "0123456789ABCDEF", "janedoe"));
//
//    // Act
//    UsersDto actualSaveUserResult =
//        userService.saveUser(
//            new UsersDto(
//                1L, "GB", "Jane", "Doe", "0123456789ABCDEF", "0123456789ABCDEF", "janedoe"));
//
//    // Assert
//    verify(saveUserUseCase).saveUser(isA(Users.class));
//    assertEquals("0123456789ABCDEF", actualSaveUserResult.getPassword());
//    assertEquals("0123456789ABCDEF", actualSaveUserResult.getRol());
//    assertEquals("Doe", actualSaveUserResult.getLast_name());
//    assertEquals("GB", actualSaveUserResult.getCountry());
//    assertEquals("Jane", actualSaveUserResult.getFirst_name());
//    assertEquals("janedoe", actualSaveUserResult.getUsername());
//    assertEquals(1L, actualSaveUserResult.getId().longValue());
//  }
//
//  @Test
//  @DisplayName(
//      "Test updateUser(UsersDto); given UserRepository findById(Object) return empty; then throw Exception")
//  @Tag("MaintainedByDiffblue")
//  void testUpdateUser_givenUserRepositoryFindByIdReturnEmpty_thenThrowException() throws Exception {
//    // Arrange
//    Optional<UserEntity> emptyResult = Optional.empty();
//    when(userRepository.findById(Mockito.<Long>any())).thenReturn(emptyResult);
//
//    // Act and Assert
//    assertThrows(Exception.class, () -> userService.updateUser(new UsersDto()));
//    verify(userRepository).findById(isNull());
//  }
//
//  @Test
//  @DisplayName("Test updateUser(UsersDto); then return Password is '0123456789ABCDEF'")
//  @Tag("MaintainedByDiffblue")
//  void testUpdateUser_thenReturnPasswordIs0123456789abcdef() throws Exception {
//    // Arrange
//    when(updateUserUseCase.updateUser(Mockito.<Users>any()))
//        .thenReturn(
//            new Users(1L, "GB", "Jane", "Doe", "0123456789ABCDEF", "0123456789ABCDEF", "janedoe"));
//
//    UserEntity userEntity = new UserEntity();
//    userEntity.setCountry("GB");
//    userEntity.setFirstName("Jane");
//    userEntity.setId(1L);
//    userEntity.setLastName("Doe");
//    userEntity.setPassword("0123456789ABCDEF");
//    userEntity.setRol("0123456789ABCDEF");
//    userEntity.setUsername("janedoe");
//    Optional<UserEntity> ofResult = Optional.of(userEntity);
//    when(userRepository.findById(Mockito.<Long>any())).thenReturn(ofResult);
//
//    // Act
//    UsersDto actualUpdateUserResult = userService.updateUser(new UsersDto());
//
//    // Assert
//    verify(updateUserUseCase).updateUser(isA(Users.class));
//    verify(userRepository).findById(isNull());
//    assertEquals("0123456789ABCDEF", actualUpdateUserResult.getPassword());
//    assertEquals("0123456789ABCDEF", actualUpdateUserResult.getRol());
//    assertEquals("Doe", actualUpdateUserResult.getLast_name());
//    assertEquals("GB", actualUpdateUserResult.getCountry());
//    assertEquals("Jane", actualUpdateUserResult.getFirst_name());
//    assertEquals("janedoe", actualUpdateUserResult.getUsername());
//    assertEquals(1L, actualUpdateUserResult.getId().longValue());
//  }
//
//  @Test
//  @DisplayName(
//      "Test deleteUserById(Long); given UserEntity() Country is 'GB'; then calls deleteUserById(Long)")
//  @Tag("MaintainedByDiffblue")
//  void testDeleteUserById_givenUserEntityCountryIsGb_thenCallsDeleteUserById() throws Exception {
//    // Arrange
//    UserEntity userEntity = new UserEntity();
//    userEntity.setCountry("GB");
//    userEntity.setFirstName("Jane");
//    userEntity.setId(1L);
//    userEntity.setLastName("Doe");
//    userEntity.setPassword("0123456789ABCDEF");
//    userEntity.setRol("0123456789ABCDEF");
//    userEntity.setUsername("janedoe");
//    Optional<UserEntity> ofResult = Optional.of(userEntity);
//    when(userRepository.findById(Mockito.<Long>any())).thenReturn(ofResult);
//    doNothing().when(deleteUseCase).deleteUserById(Mockito.<Long>any());
//
//    // Act
//    userService.deleteUserById(1L);
//
//    // Assert
//    verify(deleteUseCase).deleteUserById(eq(1L));
//    verify(userRepository).findById(eq(1L));
//  }
//
//  @Test
//  @DisplayName(
//      "Test deleteUserById(Long); given UserRepository findById(Object) return empty; then throw Exception")
//  @Tag("MaintainedByDiffblue")
//  void testDeleteUserById_givenUserRepositoryFindByIdReturnEmpty_thenThrowException()
//      throws Exception {
//    // Arrange
//    Optional<UserEntity> emptyResult = Optional.empty();
//    when(userRepository.findById(Mockito.<Long>any())).thenReturn(emptyResult);
//
//    // Act and Assert
//    assertThrows(Exception.class, () -> userService.deleteUserById(1L));
//    verify(userRepository).findById(eq(1L));
//  }
//}
package co.com.oospina.userhexagonalservice.application.services.user;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.application.usescases.users.*;
import co.com.oospina.userhexagonalservice.application.usescases.userscomplete.GetUsersByIdUseCase;
import co.com.oospina.userhexagonalservice.domain.models.Users;
import co.com.oospina.userhexagonalservice.infrastructure.jpa.models.UserEntity;
import co.com.oospina.userhexagonalservice.infrastructure.jpa.repositories.UserRepository;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

  @Mock
  private GetUsersByIdUseCase getUsersByIdUseCase;

  @Mock
  private SaveUserUseCase saveUserUseCase;

  @Mock
  private UpdateUserUseCase updateUserUseCase;

  @Mock
  private UserRepository userRepository;

  @Mock
  private DeleteUseCase deleteUseCase;

  @InjectMocks
  private UserService userService;

  private Users mockUser;
  private UsersDto mockUserDto;
  private UserEntity mockUserEntity;

  @BeforeEach
  void setUp() {
    mockUser = new Users(1L, "Armenia", "Ospina", "Gonzalez", "123456",
            "Admin", "Oscar");

    mockUserDto = new UsersDto(1L, "Armenia", "Ospina", "Gonzalez", "123456",
            "Admin", "Oscar");

    mockUserEntity = new UserEntity(1L, "Armenia", "Ospina", "Gonzalez", "123456",
            "Admin", "Oscar");
  }

  @Test
  @DisplayName("Test getUsersById - Successful Case")
  void testGetUsersById_Success() {
    when(getUsersByIdUseCase.getUserById(1L)).thenReturn(mockUser);

    UsersDto result = userService.getUsersById(1L);

    assertNotNull(result);
    assertEquals("Oscar", result.getUsername());
    verify(getUsersByIdUseCase).getUserById(eq(1L));
  }

  @Test
  @DisplayName("Test saveUser - Successful Case")
  void testSaveUser_Success() throws Exception {
    when(saveUserUseCase.saveUser(any(Users.class))).thenReturn(mockUser);

    UsersDto result = userService.saveUser(mockUserDto);

    assertNotNull(result);
    assertEquals("Oscar", result.getUsername());
    verify(saveUserUseCase).saveUser(any(Users.class));
  }

  @Test
  @DisplayName("Test updateUser - User Found")
  void testUpdateUser_Success() throws Exception {
    when(userRepository.findById(1L)).thenReturn(Optional.of(mockUserEntity));
    when(updateUserUseCase.updateUser(any(Users.class))).thenReturn(mockUser);

    UsersDto result = userService.updateUser(mockUserDto);

    assertNotNull(result);
    assertEquals("Oscar", result.getUsername());
    verify(updateUserUseCase).updateUser(any(Users.class));
  }

  @Test
  @DisplayName("Test updateUser - User Not Found")
  void testUpdateUser_UserNotFound() {
    when(userRepository.findById(1L)).thenReturn(Optional.empty());

    Exception exception = assertThrows(Exception.class, () -> userService.updateUser(mockUserDto));
    assertEquals("El usuario no existe", exception.getMessage());
  }

  @Test
  @DisplayName("Test deleteUserById - User Found")
  void testDeleteUserById_Success() throws Exception {
    when(userRepository.findById(1L)).thenReturn(Optional.of(mockUserEntity));
    doNothing().when(deleteUseCase).deleteUserById(1L);

    userService.deleteUserById(1L);

    verify(deleteUseCase).deleteUserById(eq(1L));
  }

  @Test
  @DisplayName("Test deleteUserById - User Not Found")
  void testDeleteUserById_UserNotFound() {
    when(userRepository.findById(1L)).thenReturn(Optional.empty());

    Exception exception = assertThrows(Exception.class, () -> userService.deleteUserById(1L));
    assertEquals("El usuario no existe", exception.getMessage());
  }
}
