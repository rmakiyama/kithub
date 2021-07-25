package com.rmakiyama.kithub.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rmakiyama.kithub.model.Repo
import com.rmakiyama.kithub.usecase.SearchPopularReposUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch

class HomeViewModel(
    private val searchPopularRepos: SearchPopularReposUseCase,
) : ViewModel() {

    private val repos = MutableStateFlow<List<Repo>>(emptyList())
    private val loading = MutableStateFlow<Boolean>(false)

    val state = combine(
        repos, loading
    ) { repos, loading ->
        HomeViewState(
            repos = repos,
            loading = loading
        )
    }

    init {
        // debug
        dispatch(HomeAction.Search("kotlin-multiplatform"))
    }

    fun dispatch(action: HomeAction) {
        viewModelScope.launch {
            loading.value = true
            when (action) {
                is HomeAction.Search -> search(action.query)
            }
        }
    }

    private suspend fun search(query: String) {
        val result = searchPopularRepos(query)
        repos.value = result
    }
}
