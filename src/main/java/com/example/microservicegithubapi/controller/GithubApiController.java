package com.example.microservicegithubapi.controller;

import com.example.microservicegithubapi.model.BranchInfo;
import com.example.microservicegithubapi.model.Repo;
import com.example.microservicegithubapi.service.GithubApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GithubApiController {

    @Autowired
    GithubApiService githubApiService;

    @GetMapping("/api/github/repos/{username}")
    public List<Repo> getPublicReposForUser(@PathVariable String username){
        return githubApiService.getUserPublicRepos(username);
    }

    @GetMapping("/api/github/repos/{username}/{repoName}/branches")
    public List<BranchInfo> getBranchesForRepo (@PathVariable String username, @PathVariable String repoName) {
        return githubApiService.getBranchesForRepo(username, repoName);
    }

}
