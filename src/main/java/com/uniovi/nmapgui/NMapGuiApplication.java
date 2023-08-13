package com.uniovi.nmapgui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
public class NMapGuiApplication extends SpringApplication {
		
	public static ConfigurableApplicationContext application(String[] args) {
    	
		return SpringApplication.run(NMapGuiApplication.class, args);
	}
}
