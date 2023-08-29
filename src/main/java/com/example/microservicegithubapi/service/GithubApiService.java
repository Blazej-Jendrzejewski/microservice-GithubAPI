package com.example.microservicegithubapi.service;

import com.example.microservicegithubapi.model.BranchInfo;
import com.example.microservicegithubapi.model.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class GithubApiService {

    @Value("${github.api.url}")
    private String githubApiUrl;

    private final RestTemplate restTemplate;

    @Autowired
    public GithubApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Repo> getUserPublicRepos(String username){
        ResponseEntity<Repo[]> response = restTemplate.getForEntity(
                githubApiUrl + "/users/" + username +"/repos",Repo[].class);
        return Arrays.asList(response.getBody());

    }

    public List<BranchInfo> getBranchesForRepo(String username, String repoName){
        ResponseEntity<BranchInfo[]> response = restTemplate.getForEntity(
                githubApiUrl + "/repos/" + username + "/" + repoName + "/branches", BranchInfo[].class);
        return Arrays.asList(response.getBody());
    }


}
