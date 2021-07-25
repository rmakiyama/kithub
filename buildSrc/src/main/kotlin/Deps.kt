object Deps {

    object Koin {
        const val core = "io.insert-koin:koin-core:${Versions.koin}"

        const val android = "io.insert-koin:koin-android:${Versions.koin}"
        const val compose = "io.insert-koin:koin-androidx-compose:${Versions.koin}"
    }

    object Ktor {
        const val core = "io.ktor:ktor-client-core:${Versions.ktor}"
        const val serialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
        const val cio = "io.ktor:ktor-client-cio:${Versions.ktor}"
    }

    object Kotlinx {
        const val serializationCore =
            "org.jetbrains.kotlinx:kotlinx-serialization-core:${Versions.kotlinSerialization}}"
    }

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val activity = "androidx.activity:activity-compose:${Versions.activityCompose}"
        const val viewModelCompose =
            "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.viewModelCompose}"
    }

    object Compose {
        const val ui = "androidx.compose.ui:ui:${Versions.compose}"
        const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
        const val material = "androidx.compose.material:material:${Versions.compose}"

        const val runtime = "androidx.compose.runtime:runtime:${Versions.compose}"
        const val runtimeLiveData = "androidx.compose.runtime:runtime-livedata:${Versions.compose}"
    }
}

object Versions {
    const val kotlin = "1.5.10"
    const val koin = "3.1.2"
    const val ktor = "1.6.1"
    const val kotlinSerialization = "1.2.1"

    const val appCompat = "1.3.1"
    const val activityCompose = "1.3.0-rc02"
    const val viewModelCompose = "1.0.0-alpha07"
    const val compose = "1.0.0-rc02"
}
