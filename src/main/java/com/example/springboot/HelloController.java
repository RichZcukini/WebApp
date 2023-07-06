package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController //как использовать пустую строку сверху?
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Hello world!";
    }
}
