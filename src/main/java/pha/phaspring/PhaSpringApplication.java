package pha.phaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"pha.phaspring.Service","pha.phaspring.Controller"})
@EntityScan("pha.phaspring.Model")
@EnableJpaRepositories("pha.phaspring.Repository")
public class PhaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhaSpringApplication.class, args);
	}

}
