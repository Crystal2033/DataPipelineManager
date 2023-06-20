package ru.mai.lessons.rpks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceManagementMain {
    public static void main(String[] args) {
        SpringApplication.run(ServiceManagementMain.class, args);
    }
}

//http://localhost:8080/swagger-ui/index.html
//http://localhost:8080/actuator