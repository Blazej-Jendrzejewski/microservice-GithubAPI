package com.example.microservicegithubapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class BranchInfo {

    private String name;
    private String lastCommitSha;


    @JsonProperty("commit")
    private void unpackNested(Map<String,Object> commit) {
        this.lastCommitSha = (String)commit.get("sha");
    }

    public BranchInfo() {
    }

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
