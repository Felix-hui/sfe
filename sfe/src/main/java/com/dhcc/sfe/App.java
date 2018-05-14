package com.dhcc.sfe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(basePackages="com.dhcc.sfe.repository")
@Controller
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);	
	}
}
