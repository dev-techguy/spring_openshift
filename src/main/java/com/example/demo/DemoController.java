package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/names")
public class DemoController {
    DemoService demoService;

    public DemoController() {
        demoService = new DemoService();
    }

    @GetMapping
    public void frameworkName() {
        demoService.getFrameworkName();
    }
}
