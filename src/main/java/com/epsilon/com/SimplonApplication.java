package com.epsilon.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.epsilon.com.dao.SimplonRepository;
import com.epsilon.com.entities.Simplon;

@SpringBootApplication
public class SimplonApplication implements CommandLineRunner  {
	
	

	public static void main(String[] args) {
		SpringApplication.run(SimplonApplication.class, args);
			
	}
	@Autowired
	private SimplonRepository simplonRepository;

	@Override
	public void run(String... args) throws Exception {
		simplonRepository.save(new Simplon("Silicon", "Valley", "silocon@gmail.com", "Malika", "+221773780710"));
		
	}

}
