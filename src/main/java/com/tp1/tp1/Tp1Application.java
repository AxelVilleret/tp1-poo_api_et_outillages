package com.tp1.tp1;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tp1.tp1.models.Zoo;

@SpringBootApplication
public class Tp1Application implements CommandLineRunner{
	private Zoo zoo;
	public static void main(String[] args) {
		SpringApplication.run(Tp1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		zoo = new Zoo(20, new ArrayList<>());
	}

}
