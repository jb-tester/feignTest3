package com.mytests.spring.feign.test2client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * *******************************
 * Created by irina on 3/17/2020.
 * Project: feignTest2
 * *******************************
 */
@FeignClient(name = "feign-test3")
public interface FeignClient1 {

    @GetMapping("test/server_app_info")
    String m1();

    @GetMapping("test/client_app_info/{name}")
    String m2(@PathVariable String name);

}
