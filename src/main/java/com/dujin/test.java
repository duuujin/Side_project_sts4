package com.dujin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

//    @GetMapping("/hello")
//    public String hello() {
//        return "Hello World!";
//    }
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
