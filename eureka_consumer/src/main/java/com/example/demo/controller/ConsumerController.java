package com.example.demo.controller;

import com.example.demo.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConsumerController {
    @Autowired
    private IConsumerService service;
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return service.test();
    }


}
