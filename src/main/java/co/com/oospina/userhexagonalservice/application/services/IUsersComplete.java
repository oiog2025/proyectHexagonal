package co.com.oospina.userhexagonalservice.application.services;

import co.com.oospina.userhexagonalservice.application.dto.users.UserCompleteDto;

public interface IUsersComplete {
  UserCompleteDto getUserComplete(Long id);
}
