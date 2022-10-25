package com.naveen.basic.naveen.project;

import com.naveen.basic.naveen.project.models.User;
import com.naveen.basic.naveen.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class NaveenSvc {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void initUsers() {
		List<User> users = Arrays.asList(
				new User(101, "naveen",  "naveen","xyz@gmail.com"),
				new User(102, "chauhan",  "chauhan","xyz1@gmail.com"),
				new User(103, "security",  "security","xyz2@gmail.com")

		);
		userRepository.saveAll(users);
	}

	public static void main(String[] args) {
		//if you want to change the config file name from application.yml/application.properties, Use the below config
		System.setProperty("Spring.config.name", "naveenSvc");

		SpringApplication.run(NaveenSvc.class, args);
	}

}
