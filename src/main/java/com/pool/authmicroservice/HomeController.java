package com.pool.authmicroservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping("/api/v1/user")
@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){

        return ("<h1>Welcome!!</h1>");

    }
}
