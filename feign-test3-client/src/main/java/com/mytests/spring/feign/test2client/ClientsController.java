package com.mytests.spring.feign.test2client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientsController {

    @Value("${spring.application.name}")
    String appName;

    @Autowired
    private FeignClient1 test1;

    @GetMapping("/server_info")
    public String m1() {
        return test1.m1();
    }

    @GetMapping("/client_info")
    public String m2() {
        return test1.m2(appName);
    }

}
