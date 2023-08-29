package com.example.microservicegithubapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BranchInfo {

    private String name;

    @JsonProperty("commit.sha")
    private String lastCommitSha;

    public BranchInfo(String name, String lastCommitSha) {
        this.name = name;
        this.lastCommitSha = lastCommitSha;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastCommitSha() {
        return lastCommitSha;
    }

    public void setLastCommitSha(String lastCommitSha) {
        this.lastCommitSha = lastCommitSha;
    }
}
