package com.mkacunha.demoadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class DemoAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAdminApplication.class, args);
    }

}
