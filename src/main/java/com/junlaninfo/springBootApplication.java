package com.junlaninfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   
public class springBootApplication {

	public static void main(String[] args) {
		
		 SpringApplication application = new SpringApplication(springBootApplication.class);
		 application.run(args); //启动主类

	}

}
