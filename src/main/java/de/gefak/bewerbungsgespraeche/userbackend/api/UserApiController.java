package de.gefak.bewerbungsgespraeche.userbackend.api;

import de.gefak.bewerbungsgespraeche.userbackend.api.dto.UserDto;
import de.gefak.bewerbungsgespraeche.userbackend.api.internal.IUserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wahl
 */
@RestController
@RequestMapping("/api/user")
public class UserApiController {


    IUserRepository userRepository;

    public UserApiController(@Autowired IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public void createUser(@RequestBody @Valid UserDto request) {
        this.userRepository.createUser(request);

        //throw new NotImplementedException("Not yet implemented");
    }

    @GetMapping
    public List<UserDto> getUserList(){
        return userRepository.getUserList();
    }

}
