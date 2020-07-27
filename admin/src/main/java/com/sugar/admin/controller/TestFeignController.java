package com.sugar.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFeignController {

    @RequestMapping("/sugar")
    private String sugarString() {
        return "sugar2020";
    }
}
