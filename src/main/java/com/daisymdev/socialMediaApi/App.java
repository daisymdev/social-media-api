package com.daisymdev.socialMediaApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.daisymdev.socialMediaApi")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
