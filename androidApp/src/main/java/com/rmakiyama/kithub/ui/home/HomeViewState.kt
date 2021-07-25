package com.rmakiyama.kithub.ui.home

import com.rmakiyama.kithub.model.Repo

data class HomeViewState(
    val repos: List<Repo> = emptyList(),
    val loading: Boolean = false,
) {
    companion object {
        val Empty = HomeViewState()
    }
}
