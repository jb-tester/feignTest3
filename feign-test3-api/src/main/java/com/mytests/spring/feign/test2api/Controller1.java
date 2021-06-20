package com.mytests.spring.feign.test2api;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
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
    @Autowired
    @Lazy
    EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/test/server_app_info")
    public String bar() {
        String rez = "Instances of " + appName + ":\n";
        for (InstanceInfo instance : eurekaClient.getApplication(appName).getInstances()) {
            rez = rez + instance + "\n";
        }
        return rez;
    }

    @RequestMapping("/test/client_app_info/{name}")
    public String foo(@PathVariable String name) {
        String rez = "Instances of " + name + ":\n";
        for (InstanceInfo instance : eurekaClient.getApplication(name).getInstances()) {
            rez = rez + instance + "\n";
        }
        return rez;
    }
}
