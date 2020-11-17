import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdkVersion(30)
    buildToolsVersion("30.0.2")
    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0.0"
        consumerProguardFiles("consumer-rules.pro")
    }
    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8", KotlinCompilerVersion.VERSION))

    api("androidx.core:core-ktx:1.3.2")

    api("androidx.lifecycle:lifecycle-common-java8:2.2.0")
    api("androidx.lifecycle:lifecycle-livedata:2.2.0")
    api("androidx.lifecycle:lifecycle-viewmodel:2.2.0")

    api("androidx.navigation:navigation-ui-ktx:2.3.1")
    api("androidx.navigation:navigation-fragment-ktx:2.3.1")

    api("com.blankj:utilcodex:1.30.5")

}
