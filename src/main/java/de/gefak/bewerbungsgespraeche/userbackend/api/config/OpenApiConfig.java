package de.gefak.bewerbungsgespraeche.userbackend.api.config;

import de.gefak.bewerbungsgespraeche.userbackend.api.internal.IUserRepository;
import de.gefak.bewerbungsgespraeche.userbackend.api.internal.UserRepository;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wahl
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .version("1.0")
                        .title("Register User Backend API")
                );
    }

    @Bean
    public IUserRepository userRepository() {
        return new UserRepository();
    }


}
