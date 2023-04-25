package com.example.demodeploy;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping()
public class HelloController {

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

    @GetMapping(value = "test")
    public String test() {
        return "test1";
    }
}