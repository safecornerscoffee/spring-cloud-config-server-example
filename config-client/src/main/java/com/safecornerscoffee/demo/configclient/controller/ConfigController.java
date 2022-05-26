package com.safecornerscoffee.demo.configclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    private final ConfigProperties configProperties;

    public ConfigController(ConfigProperties configProperties) {
        this.configProperties = configProperties;
    }

    @GetMapping("/message")
    public String getMessage() {
        return configProperties.getMessage();
    }
}
