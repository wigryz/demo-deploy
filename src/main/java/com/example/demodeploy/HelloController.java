package com.example.demodeploy;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Optional;

@RestController
@RequestMapping()
public class HelloController {

    @Value("SOME_ENV_VARIABLE")
    private String envVariable;

    @GetMapping(value = "hello")
    public String hello()  {
        String lhAddress = "";
        String lhHost = "";
        try {
            lhHost = InetAddress.getLocalHost().getHostAddress();
            lhAddress = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
        }
        String lbAddress = InetAddress.getLoopbackAddress().getHostAddress();
        String lbHost = InetAddress.getLoopbackAddress().getHostName();
        return "LH: A: " + lhAddress + " H: " + lhHost + " ___ LB: A: " + lbAddress + " H: " + lbHost + ".";
    }

    @GetMapping(value = "env")
    public String env() {
        return "Env variable: " + Optional.ofNullable(envVariable).orElse("undefined");
    }
}