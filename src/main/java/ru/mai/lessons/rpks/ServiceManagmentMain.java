package ru.mai.lessons.rpks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class ServiceManagmentMain {
    public static void main(String[] args) {
        SpringApplication.run(ServiceManagmentMain.class, args);
    }
}

//http://localhost:8080/swagger-ui/index.html
//http://localhost:8080/actuator