package com.teletearbies.roskildedaycare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.net.URI;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        openBrowser();
        SpringApplication.run(Application.class, args);
    }

    public static void openBrowser() {
        try {
            Desktop d = Desktop.getDesktop();
            d.browse(new URI("http://localhost:8094/"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
