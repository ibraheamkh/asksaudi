package co.akwad.asksaudi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"co.akwad.asksaudi"})
public class AsksaudiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsksaudiApplication.class, args);
	}
}
