package com.trip_planner.business_config.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.trip_planner.business_config.utils.Constants.BASE_URI;

@RestController
@RequestMapping(BASE_URI + "/validation")
public class ValidationController {

    @GetMapping
    public String hello() {
        return "hello";
    }
}
