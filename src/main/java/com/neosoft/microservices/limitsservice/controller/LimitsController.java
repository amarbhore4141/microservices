package com.neosoft.microservices.limitsservice.controller;

import com.neosoft.microservices.limitsservice.beans.Limitsconfiguration;
import com.neosoft.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limitsHardcoded")
    public Limitsconfiguration retrieveLimitsFromConfiguration() {
        return new Limitsconfiguration(1, 1000);
    }

    @GetMapping("/limitsDynamic")
    public Limitsconfiguration limitsFromApplicationPropertisFileAndConfigClass() {
        return new Limitsconfiguration(configuration.getMinimum(), configuration.getMaximum());
    }


}
