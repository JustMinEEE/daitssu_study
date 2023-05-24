package com.study.daitssu_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DaitssuStudyController {

    @GetMapping("/daitssu")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }
}
