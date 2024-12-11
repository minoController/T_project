package com.repository.git.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @PostMapping("/showComments")
    public String test() {
        return "blahblah";
    }
}
