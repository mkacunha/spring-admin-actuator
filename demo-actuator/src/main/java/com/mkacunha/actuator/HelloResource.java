package com.mkacunha.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @GetMapping("/api/hello")
    public String getHello() {
        return "Hello";
    }

}
