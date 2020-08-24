package com.mytests.spring.feign.test2api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *******************************
 * Created by irina on 3/17/2020.
 * Project: feignTest2
 * *******************************
 */
@RestController
public class Controller1 {

    @RequestMapping("/c1/bar")
    public String bar() {

        return "bar";
    }

    @RequestMapping("/c1/foo")
    public String foo() {

        return "foo";
    }
}
