package com.cos.controllerdemo.web;

import com.cos.controllerdemo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JavaToJspController {
    @GetMapping("/jsp/java")
    public String jspToJava(){
        return "d";
    }
    @GetMapping("/jsp/java/model")
    public String jspToJavaToModel(Model model){ // 함수의 파라메터에 model을 선언하고
        User user = new User();
        user.setUserName("ssar");
        model.addAttribute("username",user.getUserName()); // addAt tribute 함수로 전달만 하면 됨
        return "e";
    }
}
