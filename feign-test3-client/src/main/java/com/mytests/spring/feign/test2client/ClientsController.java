package com.mytests.spring.feign.test2client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ClientsController {
    ;
    @Autowired

    private FeignClient1 test1;


    @GetMapping("/client1/bar")
    public String m1() {
        return test1.m1();
    }


}
