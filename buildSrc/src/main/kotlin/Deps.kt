object Deps {

    object Koin {
        const val core = "io.insert-koin:koin-core:${Versions.koin}"

        const val android = "io.insert-koin:koin-android:${Versions.koin}"
        const val compose = "io.insert-koin:koin-androidx-compose:${Versions.koin}"
    }

    object Ktor {
        const val core = "io.ktor:ktor-client-core:${Versions.ktor}"
        const val serialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
    }

    object Kotlinx {
        const val serializationCore =
            "org.jetbrains.kotlinx:kotlinx-serialization-core:${Versions.kotlinSerialization}}"
    }

    object Compose {
        const val ui = "androidx.compose.ui:ui:${Versions.compose}"
        const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
        const val material = "androidx.compose.material:material:${Versions.compose}"

        private const val activityComposeVersion = "1.3.0-rc02"
        const val activity = "androidx.activity:activity-compose:${activityComposeVersion}"
    }
}

object Versions {
    const val koin = "3.1.2"
    const val ktor = "1.6.1"
    const val kotlinSerialization = "1.2.1"

    const val compose = "1.0.0-rc02"
}
