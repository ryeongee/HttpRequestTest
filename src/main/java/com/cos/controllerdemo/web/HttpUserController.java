package com.cos.controllerdemo.web;

import com.cos.controllerdemo.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpUserController {
    @PostMapping("/user")
    public String applicationJsonUserToObject(@RequestBody User user){
        return "json 전송옴"+"\n번호: "+user.getUserName();
    }
}
