package com.example.myfirstapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.net.URI;

@SpringBootApplication
public class MyfirstapplicationApplication {

	public static void main(String[] args) {
		openBrowser();
		SpringApplication.run(MyfirstapplicationApplication.class, args);

	}

	public static void openBrowser() {
		try {
			Desktop d = Desktop.getDesktop();
			d.browse(new URI("http://localhost:8000/"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
