package de.gefak.bewerbungsgespraeche.userbackend.api.dto;

/**
 * @author wahl
 */
public record UserDto(
        String name,
        String vorname,
        String email,
        String nachricht
) {}
