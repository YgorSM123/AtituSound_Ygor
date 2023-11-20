package br.edu.atirus.poo.atitusound.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class ConfigDivs {
	
	@Bean
	public PasswordEncoder getPassworEncoder() {
		return new BCryptPasswordEncoder();
	}

}
