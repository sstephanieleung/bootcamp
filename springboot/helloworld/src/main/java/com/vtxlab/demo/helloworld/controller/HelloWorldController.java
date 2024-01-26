package com.vtxlab.demo.helloworld.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping (value = "/api/v1")

public class HelloWorldController {

    @GetMapping (value = "/helloworld")
    public String helloWorld() {
        return "Hellow World";
    }

    

}
