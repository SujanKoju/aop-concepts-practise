package com.example.preparation.aop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kojusujan1111@gmail.com 24/12/21
 */
@RestController
@RequestMapping("/v1")
public class TestController {

    @GetMapping("test1")
    public String test1() {
        return "test1";
    }

    @LoggingAspect
    @GetMapping("test2")
    public String test2() {
        System.out.println("api called");
        return "test2";
    }
}
