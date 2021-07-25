package com.rmakiyama.kithub.infrastructure.api

import com.rmakiyama.kithub.infrastructure.api.response.SearchRepositoriesResponse
import io.ktor.client.HttpClient
import io.ktor.client.request.get

interface GitHubApi {
    suspend fun searchPopularRepos(query: String): SearchRepositoriesResponse
}

internal class GitHubApiKtorClient(
    private val httpClient: HttpClient,
) : GitHubApi {

    companion object {
        const val GITHUB_API_URL = "https://api.github.com"
    }

    override suspend fun searchPopularRepos(query: String): SearchRepositoriesResponse {
        return httpClient.get("$GITHUB_API_URL/search/repositories?sort=starts&q=$query")
    }
}
