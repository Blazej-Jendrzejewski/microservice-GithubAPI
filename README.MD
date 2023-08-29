# Microservice-GithubAPI

## Description

The `Microservice-GithubAPI` serves as a direct interface to GitHub's API. It facilitates:

- Retrieving public repositories of a specific user.
- Fetching branch information for a given repository.

## Key Components

### Models:
- `Repo.java`
- `BranchInfo.java`

  These represent the data structure of GitHub's repositories and branches.

### Service:
- `GithubApiService.java`

  Contains the logic for calling the GitHub API.

### Controller:
- `GithubApiController.java`

  Exposes the methods as RESTful endpoints.

## Installation and Execution

1. Clone the repository.
2. Navigate to the microservice directory.
3. Update any necessary configurations, especially those related to service URLs or other external dependencies.
4. Launch the service.
