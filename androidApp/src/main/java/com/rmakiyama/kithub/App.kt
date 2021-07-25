package com.rmakiyama.kithub

import android.app.Application
import com.rmakiyama.kithub.di.AppModule
import com.rmakiyama.kithub.di.initKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            modules(AppModule.module)
        }
    }
}
