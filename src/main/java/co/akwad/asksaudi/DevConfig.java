package co.akwad.asksaudi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@Configuration
@ComponentScan("co.akwad.asksaudi")
public class DevConfig {

}
