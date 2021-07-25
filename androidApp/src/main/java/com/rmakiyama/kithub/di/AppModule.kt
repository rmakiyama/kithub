package com.rmakiyama.kithub.di

import com.rmakiyama.kithub.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object AppModule {

    val module = module {
        viewModel { HomeViewModel(get()) }
    }
}
