package com.dreambig.microservices.limitsservice.controller;

import com.dreambig.microservices.limitsservice.configuration.PropertiesConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    PropertiesConfiguration propertiesConfiguration;

    @GetMapping("/load")
    public String load() {
        return propertiesConfiguration.getMinimum()+""+propertiesConfiguration.getMaximum();
    }
}
