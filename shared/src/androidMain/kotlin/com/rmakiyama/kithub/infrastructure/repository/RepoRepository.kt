package com.rmakiyama.kithub.infrastructure.repository

import com.rmakiyama.kithub.infrastructure.api.GitHubApi
import com.rmakiyama.kithub.infrastructure.api.response.convert
import com.rmakiyama.kithub.model.Repo

interface RepoRepository {
    suspend fun searchPopularRepos(query: String): List<Repo>
}

internal class RepoRepositoryImpl(private val api: GitHubApi) : RepoRepository {

    override suspend fun searchPopularRepos(query: String): List<Repo> {
        return api.searchPopularRepos(query).items.map { items -> items.convert() }
    }
}
