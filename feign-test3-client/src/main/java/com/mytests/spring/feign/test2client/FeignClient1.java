package com.mytests.spring.feign.test2client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * *******************************
 * Created by irina on 3/17/2020.
 * Project: feignTest2
 * *******************************
 */
@FeignClient(name = "feign-test3")
public interface FeignClient1 {

    @GetMapping("c1/bar")
    String m1();


}
