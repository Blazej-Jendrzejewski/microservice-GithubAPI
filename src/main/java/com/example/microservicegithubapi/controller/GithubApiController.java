package com.example.microservicegithubapi.controller;

import com.example.microservicegithubapi.model.Repo;
import com.example.microservicegithubapi.service.GithubApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class GithubApiController {

    @Autowired
    GithubApiService githubApiService;

    @GetMapping("/api/github/repos/{username}")
    public List<Repo> getPublicReposForUser(@PathVariable String username){
        return githubApiService.getUserPublicRepos(username);
    }




}
