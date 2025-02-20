package co.com.oospina.userhexagonalservice.domain.models;

import java.util.Date;

public record Users(
         Integer id,
         Boolean borrador,
         String creadoPor,
         Date fechaCreacion,
         Date fechaModificacion,
         Integer modificadoPor,
         Integer version,
         String email,
         String password,
         Boolean senSesionActiva,
         Integer tenantId,
         Date fechaLogIn,
         Date fechaLogOut,
         Date fechaUltimaActividad,
         Boolean activo,
         Integer terceroId,
         String canal
){}
