package com.manoj.pipeline_demo.controller;

import com.manoj.pipeline_demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RESTController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/hello")
    public String getMessage(){
        return demoService.getMessage();
    }
}
