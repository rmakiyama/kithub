package com.rmakiyama.kithub.di

import com.rmakiyama.kithub.infrastructure.api.GitHubApi
import com.rmakiyama.kithub.infrastructure.api.GitHubApiKtorClient
import com.rmakiyama.kithub.infrastructure.repository.RepoRepository
import com.rmakiyama.kithub.infrastructure.repository.RepoRepositoryImpl
import com.rmakiyama.kithub.usecase.SearchPopularReposUseCase
import io.ktor.client.HttpClient
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import kotlinx.serialization.json.Json
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(appDeclaration: KoinAppDeclaration = {}) = startKoin {
    appDeclaration()
    modules(networkModule, repositoryModule, useCaseModule)
}

private val networkModule = module {
    single { createHttpClient() }
    single<GitHubApi> { GitHubApiKtorClient(get()) }
}

private val repositoryModule = module {
    single<RepoRepository> { RepoRepositoryImpl(get()) }
}

private val useCaseModule = module {
    single { SearchPopularReposUseCase(get()) }
}

fun createHttpClient() = HttpClient {
    val json = Json { ignoreUnknownKeys = true }
    install(JsonFeature) { serializer = KotlinxSerializer(json) }
}
