package de.gefak.bewerbungsgespraeche.userbackend.ui;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wahl
 */
@Controller
public class UserUiController {

    @GetMapping("/userregistration")
    public String index(Model model) {
        return "userregistration";
    }

}
