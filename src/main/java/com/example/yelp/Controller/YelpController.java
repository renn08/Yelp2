package com.example.yelp.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // (annotate in class to mark the controller class) - check source code in IntelliJ by holding “command” + click the function
public class YelpController {


    @GetMapping("/") //define API name
    public String index() {
        return "Greetings from Spring Boot!";
    }


}

