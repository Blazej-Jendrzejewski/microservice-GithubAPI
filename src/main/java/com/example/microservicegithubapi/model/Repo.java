package com.example.microservicegithubapi.model;

public class Repo {

    private String name;
    private String owner;
    private boolean isFork;

    public Repo(String name, String owner, boolean isFork) {
        this.name = name;
        this.owner = owner;
        this.isFork = isFork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isFork() {
        return isFork;
    }

    public void setFork(boolean fork) {
        isFork = fork;
    }
}

