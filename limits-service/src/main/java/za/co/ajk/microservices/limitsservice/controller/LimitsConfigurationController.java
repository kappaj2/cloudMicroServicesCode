package za.co.ajk.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.ajk.microservices.limitsservice.bean.LimitConfiguration;
import za.co.ajk.microservices.limitsservice.config.Configuration;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration(){


        return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}
