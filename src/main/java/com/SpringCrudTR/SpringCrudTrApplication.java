package com.SpringCrudTR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication  // this cover all other annotations but sometimes it may not work.
//@ComponentScan({"controller","service"})
//@EntityScan("model")
//@EnableJpaRepositories("repository")
public class SpringCrudTrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudTrApplication.class, args);
	}
}
