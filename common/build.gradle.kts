import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
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
    buildFeatures {
        dataBinding = true
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

    // KTX 核心
    api("androidx.core:core-ktx:1.3.2")

    // Appcompat 兼容包
    api("androidx.appcompat:appcompat:1.2.0")
    // 约束布局
    api("androidx.constraintlayout:constraintlayout:2.0.4")

    // LiveData 与 ViewModel
    api("androidx.lifecycle:lifecycle-common-java8:2.2.0")
    api("androidx.lifecycle:lifecycle-livedata:2.2.0")
    api("androidx.lifecycle:lifecycle-viewmodel:2.2.0")

    // Fragment
    api("androidx.fragment:fragment:1.2.5")
    api("androidx.fragment:fragment-ktx:1.2.5")

    // Fragment 导航
    api("androidx.navigation:navigation-ui-ktx:2.3.2")
    api("androidx.navigation:navigation-fragment-ktx:2.3.2")

    // Google Material
    api("com.google.android.material:material:1.2.1")

    // OkHttp3
    api("com.squareup.okhttp3:okhttp:4.9.0")

    api("com.blankj:utilcodex:1.30.5")

    api("com.zackratos.ultimatebarx:ultimatebarx:0.3.1")

}
