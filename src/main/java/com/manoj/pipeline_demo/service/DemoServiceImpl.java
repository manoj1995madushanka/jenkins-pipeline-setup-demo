package com.manoj.pipeline_demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{
    @Override
    public String getMessage() {
        return "hello there app working...";
    }
}
