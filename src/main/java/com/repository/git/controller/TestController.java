package com.repository.git.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    public String test1() {
        return "test1";
    }

    public String test2() {
        return "test2";
    }

}
