package com.example.microservicegithubapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Repo {

    private String name;
    private String ownerLogin;
    private boolean fork;

    @SuppressWarnings("unchecked")
    @JsonProperty("owner")
    private void unpackNested(Map<String,Object> owner) {
        this.ownerLogin = (String)owner.get("login");
    }

    public Repo() {
    }

    public Repo(String name, String ownerLogin, boolean fork) {
        this.name = name;
        this.ownerLogin = ownerLogin;
        this.fork = fork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerLogin() {
        return ownerLogin;
    }

    public void setOwnerLogin(String ownerLogin) {
        this.ownerLogin = ownerLogin;
    }

    public boolean isFork() {
        return fork;
    }

    public void setFork(boolean fork) {
        this.fork = fork;
    }
}

