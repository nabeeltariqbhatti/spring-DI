package com.limits.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limits.example.bean.limitsConfiguration;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private limitsConfiguration limits;

    @GetMapping("/limits")
    public limitsConfiguration returnLimits() {

        return new limitsConfiguration((int) limits.getMaximum(), (int) limits.getMinimum());
    }

}
