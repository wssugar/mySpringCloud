package com.sugar.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFeignController {
    @Autowired
    private TestFeignClient testFeignClient;

    @RequestMapping("/sugar")
    public String sugar() {
        String s = testFeignClient.sugarString();
        return s;
    }
}
