package br.edu.atirus.poo.atitusound.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class ConfigSwagger {
	
	@Bean
	public OpenAPI getOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("API AtituSound")
						.description("Documentação do backend AtituSound")
						.version("version 1.0.0")
						.contact(new Contact()
								.name("___Ygo_Muhammad___")
								.email("fulano@atitus.edu.br")));
				
	}

}
