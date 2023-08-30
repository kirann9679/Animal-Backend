package APIS.demo;

import APIS.demo.Service.AnimalService;
import APIS.demo.Service.Impl.AnimalServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class Application {
	@Bean
	public AnimalService getAnimalService(){
		return new AnimalServiceImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
