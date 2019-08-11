package com.puhuo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class login {

    @GetMapping("/puhuo/login")
    public String login() {
        return "i am come from china";
    }
}
