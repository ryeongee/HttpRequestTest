package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller // file을 응답하는 컨트롤러
@RestController // data를 응답하는 컨트롤러
public class HttpController {

    //http:localhost:8080/get
    @GetMapping("/get")
    public String get(){
        return "get 요청됨";
    }

    @PostMapping("/post")
    public String post(){

        return "post 요청됨";
    }

    @PutMapping("/put")
    public String put(){
        return "put 요청됨";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "delete 요청됨";
    }
}
