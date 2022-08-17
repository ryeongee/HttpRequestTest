package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HttpDirectionController {
    @GetMapping("/home")
    public String home(){
        //1만줄가정
        return "home";
    }
    @GetMapping("/away")
    public String away(){
        //다른코드
        return "redirect:/home"; // 리다이렉션이된다.(@Controller)
    }
}
