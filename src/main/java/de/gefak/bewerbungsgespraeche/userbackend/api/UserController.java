package de.gefak.bewerbungsgespraeche.userbackend.api;

import de.gefak.bewerbungsgespraeche.userbackend.api.dto.CreateUserRequest;
import de.gefak.bewerbungsgespraeche.userbackend.api.dto.UserDto;
import de.gefak.bewerbungsgespraeche.userbackend.api.internal.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wahl
 */
@RestController
@RequestMapping("/api/user")
public class UserController {


    IUserRepository userRepository;

    public UserController(@Autowired IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public void createUser(@RequestBody CreateUserRequest request) {

    }

    @GetMapping
    public List<UserDto> getUserList(){
        return userRepository.getUserList();
    }

}
