package co.com.oospina.userhexagonalservice.infrastructure.jpa.repositories;

import co.com.oospina.userhexagonalservice.infrastructure.jpa.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {}
