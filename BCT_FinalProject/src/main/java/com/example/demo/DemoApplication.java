package com.example.demo;

// BCT memeber: SeungYeon Moon, Jaeyoung Lee, Arnur Bodnov, Mikhail Semenov

import com.example.demo.services.JavaFxApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		JavaFxApplication.main(new String[]{""});

	}

}
