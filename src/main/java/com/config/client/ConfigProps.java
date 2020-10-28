package com.config.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "user")
public class ConfigProps {
    private String name;
    private String jobtitle;
    private String github;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }
}
