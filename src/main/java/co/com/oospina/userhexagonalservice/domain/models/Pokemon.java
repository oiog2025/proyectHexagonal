package co.com.oospina.userhexagonalservice.domain.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Pokemon(
    Long id,
    @JsonProperty("max_harvest")
    String maxHarvest,
    String name,
    @JsonProperty("natural_gift_power")
    long naturalGiftPower) {}
