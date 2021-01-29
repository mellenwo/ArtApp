package commons

import BuildModules
import Dependencies
import dependencies.AnnotationProcessorsDependencies
import extensions.addTestDependencies

plugins {
    id("com.android.dynamic-feature")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(29)

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(29)
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    dataBinding {
        isEnabled = true
    }

    androidExtensions {
        isExperimental = true
    }

    sourceSets {
        getByName("main") {
            java.srcDir("src/main/kotlin")
        }
        getByName("test") {
            java.srcDir("src/test/kotlin")
        }
    }
}

dependencies {
    implementation(project(BuildModules.APP))
    implementation(project(BuildModules.Commons.UI))
    implementation(project(BuildModules.CORE))
    implementation(Dependencies.LIFECYCLE_EXTENSIONS)
    implementation(Dependencies.LIFECYCLE_VIEWMODEL)

    implementation(Dependencies.KOTLIN)
    implementation(Dependencies.COROUTINES)
    implementation(Dependencies.COROUTINES_ANDROID)
    implementation(Dependencies.TIMBER)
    implementation(Dependencies.NAVIGATION_FRAGMENT)
    implementation(Dependencies.NAVIGATION_UI)
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.FRAGMENT_KTX)
    implementation(Dependencies.CONSTRAINT_LAYOUT)

    kapt(AnnotationProcessorsDependencies.DATABINDING)

    addTestDependencies()

}