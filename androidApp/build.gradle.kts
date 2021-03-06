plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = 30
    defaultConfig {
        applicationId = "com.rmakiyama.kithub"
        minSdk = 23
        targetSdk = 30
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }
}

dependencies {
    implementation(project(":shared"))

    implementation("com.google.android.material:material:1.4.0")

    with(Deps.AndroidX) {
        implementation(appCompat)
        implementation(activity)
        implementation(viewModelCompose)
    }

    with(Deps.Compose) {
        implementation(ui)
        implementation(uiTooling)
        implementation(material)
        implementation(runtime)
        implementation(runtimeLiveData)
    }

    with(Deps.Koin) {
        api(core)
        api(android)
        api(compose)
    }
}
