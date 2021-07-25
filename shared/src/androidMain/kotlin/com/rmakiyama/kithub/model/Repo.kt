package com.rmakiyama.kithub.model

data class Repo(
    val id: Long,
    val name: String,
    val fullName: String,
    val htmlUrl: String,
    val description: String?,
    val stargazersCount: Int,
    val forks: Int,
)
