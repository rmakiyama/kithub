package com.rmakiyama.kithub.infrastructure.api.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchRepositoriesResponse(
    @SerialName("items")
    val items: List<RepoResponse>,
)
