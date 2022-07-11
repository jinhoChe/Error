package com.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController {
    @RequestMapping("hello")
    String hello() {
        return "Hello World!";
    }
    @RequestMapping("/hellokr")
    String hellokr() {
        return "헬로 월드!";
    }
}
