package com.example.microservicegithubapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GithubApiService {

    @Value("${github.api.url}")
    private String githubApiUrl;

    private final RestTemplate restTemplate;

    @Autowired
    public GithubApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
