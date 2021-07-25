package com.rmakiyama.kithub.ui.home

sealed class HomeAction {
    data class Search(val query: String = "") : HomeAction()
}
