package com.cesaratteh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BuzzController {

    @GetMapping("/buzz")
    public String helloWorld() {
        return "buzz";
    }
}
