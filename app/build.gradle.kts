plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {

    compileSdkVersion(Apps.compileSdk)

    defaultConfig {
        applicationId = "ir.gradledsl.myapplication"
        minSdkVersion(Apps.minSdk)
        targetSdkVersion(Apps.targetSdk)
        versionCode = Apps.versionCode
        versionName = Apps.versionName
        multiDexEnabled = true
        setProperty("archivesBaseName", "$applicationId-v$versionName($versionCode)")
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFile(getDefaultProguardFile("proguard-android-optimize.txt"))
        }
    }
}


dependencies { for (dependency in Apps.dependency) implementation(dependency) }