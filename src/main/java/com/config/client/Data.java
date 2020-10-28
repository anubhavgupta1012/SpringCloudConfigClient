package com.config.client;

public class Data {
    private String name;
    private String jobtitle;
    private String github;

    public Data() {
    }

    public Data(String name, String jobtitle, String github) {
        this.name = name;
        this.jobtitle = jobtitle;
        this.github = github;
    }

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
