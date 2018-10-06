package org.shyu.springboot;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootKkVideo78JdbcConnectionPoolApplication implements CommandLineRunner{
	
	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKkVideo78JdbcConnectionPoolApplication.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("DataSource====" + dataSource);
	}
}
