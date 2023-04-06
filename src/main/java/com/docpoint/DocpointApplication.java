package com.docpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.docpoint.repository")
@EntityScan("com.docpoint.model")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class DocpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocpointApplication.class, args);
	}

}
