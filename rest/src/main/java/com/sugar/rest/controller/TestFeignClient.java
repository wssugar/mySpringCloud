package com.sugar.rest.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "BITCHAIN-ADMIN")
public interface TestFeignClient {

    @GetMapping("/balance/sugarString")
    String sugarString();
}
