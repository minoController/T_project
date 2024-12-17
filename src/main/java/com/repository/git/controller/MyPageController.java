package com.repository.git.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyPageController {

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "MyPageController test()";
    }
}
