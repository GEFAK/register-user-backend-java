package de.gefak.bewerbungsgespraeche.userbackend.api.internal;

import de.gefak.bewerbungsgespraeche.userbackend.api.dto.UserDto;

import java.util.List;

/**
 * @author wahl
 */
public interface IUserRepository {

    public List<UserDto> getUserList();

    public void createUser(UserDto user);

}
