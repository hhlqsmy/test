package com.linhs.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Value("${custom.name}")
    private String name;

    @RequestMapping(value = "/index")
    public String index() {
        logger.info("name:" + name);
        //int i = 10 / 0;
        return "index";
    }
}
