package de.gefak.bewerbungsgespraeche.userbackend.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * @author wahl
 */
public record UserDto(
        @NotBlank String name,
        @NotBlank String vorname,
        @NotBlank @Email String email,
        String nachricht
) {}
