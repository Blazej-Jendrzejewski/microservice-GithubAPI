package com.example.microservicegithubapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Repo {

    private String name;

    @JsonProperty("owner.login")
    private String login;

    @JsonProperty("fork")
    private boolean isFork;

    public Repo(String name, String login, boolean isFork) {
        this.name = name;
        this.login = login;
        this.isFork = isFork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean isFork() {
        return isFork;
    }

    public void setFork(boolean fork) {
        isFork = fork;
    }
}

