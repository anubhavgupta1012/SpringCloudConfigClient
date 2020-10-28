package com.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @Autowired
    private ConfigProps props;

    @GetMapping("/info")
    public Data getData() {
        return new Data(props.getName(), props.getJobtitle(), props.getGithub());
    }
}
