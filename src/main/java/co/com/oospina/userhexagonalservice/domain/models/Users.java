package co.com.oospina.userhexagonalservice.domain.models;

public record Users(
    Long id,
    String country,
    String first_name,
    String last_name,
    String password,
    String rol,
    String username) {}
