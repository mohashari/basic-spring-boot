package com.kodescript.basicspringboot;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {


    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello World";
    }
}
