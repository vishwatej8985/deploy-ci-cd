package com.DevOps.deploy_ci_cd.Controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String demo() {
        return "Hello, Vishwateja!";
    }
}

