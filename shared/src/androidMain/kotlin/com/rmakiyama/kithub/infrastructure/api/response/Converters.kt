package com.rmakiyama.kithub.infrastructure.api.response

import com.rmakiyama.kithub.model.Repo

fun RepoResponse.convert(): Repo {
    return Repo(
        id = id,
        name = name,
        fullName = fullName,
        htmlUrl = htmlUrl,
        description = description,
        stargazersCount = stargazersCount,
        forks = forks,
    )
}
