package com.neosoft.microservices.limitsservice.controller;

import com.neosoft.microservices.limitsservice.beans.Limitsconfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class LimitsController {


    @GetMapping("/limitsHardcoded")
    public Limitsconfiguration retrieveLimitsFromConfiguration(){
        return new Limitsconfiguration(1,1000);
    }
}
