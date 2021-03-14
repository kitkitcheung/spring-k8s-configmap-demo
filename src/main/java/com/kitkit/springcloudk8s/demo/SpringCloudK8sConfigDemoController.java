package com.kitkit.springcloudk8s.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@EnableConfigurationProperties(DummyConfig.class)
public class SpringCloudK8sConfigDemoController {
    @Autowired
    private DummyConfig dummyConfig;

    @GetMapping("/")
    public String hello() {
        return dummyConfig.getMessage()
                + " ["
                + new SimpleDateFormat().format(new Date())
                + "]";
    }

/*    @GetMapping("/health")
    public String health() {
        return "success";
    }*/
}
