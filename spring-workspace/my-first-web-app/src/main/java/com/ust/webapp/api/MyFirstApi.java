package com.ust.webapp.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MyFirstApi {
    @GetMapping("/hi")
    public String sayHello(){
        return "Welcome to the world of REST APIs";
    }

    @GetMapping("/bye")
    public String sayBye(){
        return "Bye..have a great day";
    }

    @PostMapping
    public String addSomeData(){
        return "Data Added";
    }


}
