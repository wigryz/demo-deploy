package com.example.demodeploy;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HelloController {

    @GetMapping(value = "hello")
    public String hello() {
        return "hello";
    }
}