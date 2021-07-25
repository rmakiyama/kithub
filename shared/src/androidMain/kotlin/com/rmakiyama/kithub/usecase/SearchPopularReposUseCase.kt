package com.rmakiyama.kithub.usecase

import com.rmakiyama.kithub.infrastructure.repository.RepoRepository
import com.rmakiyama.kithub.model.Repo

class SearchPopularReposUseCase(
    private val repository: RepoRepository,
) : OneShotUseCase<String, List<Repo>>() {

    override suspend fun execute(params: String): List<Repo> {
        return repository.searchPopularRepos(params)
    }
}

