package com.repository.git.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @PostMapping("/showComments")
    public void test() {
        test2();
    }

    public void test2() {
        // main fix it
    }
}
