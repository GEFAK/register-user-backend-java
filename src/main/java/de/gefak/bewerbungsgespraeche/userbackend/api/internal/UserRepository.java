package de.gefak.bewerbungsgespraeche.userbackend.api.internal;

import de.gefak.bewerbungsgespraeche.userbackend.api.dto.UserDto;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * @author wahl
 */

public class UserRepository implements IUserRepository {

    private List<UserDto> userList;

    public UserRepository() {
        if(userList == null){
            List.of(
                    new UserDto("Mustermann", "Max", "max@deinemail.de", "Hallo ich bin Max und code gerne in Java"),
                    new UserDto("Doe", "Jane", "jane@deinemail.de", "Hallo ich bin Jane und code gerne in C#")
            );
        }
    }
    @Override
    public List<UserDto> getUserList() {
        return userList;
    }
}
