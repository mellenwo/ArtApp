
plugins {
    id(BuildPlugins.ANDROID_APPLICATION)
    id(BuildPlugins.KOTLIN_ANDROID)
    id(BuildPlugins.KOTLIN_ANDROID_EXTENSIONS)
}

// Required since Gradle 4.10+.
repositories {
    google()
    jcenter()
    mavenCentral()
}

android {
    compileSdkVersion(29)

    defaultConfig {
        applicationId = "com.mellenwood.artapp"
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
        buildToolsVersion("29.0.3")
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
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

    dynamicFeatures = mutableSetOf(
        BuildModules.Features.HOME, BuildModules.Features.ART_LIST
    )

    sourceSets {
        getByName("main") {
            java.srcDir("src/main/kotlin")
        }
    }
}

dependencies {
    implementation (Dependencies.KOTLIN)
    implementation (Dependencies.ANDROIDX_CORE)
    implementation (Dependencies.APPCOMPAT)
    implementation (Dependencies.CONSTRAINT_LAYOUT)
    implementation (Dependencies.PLAY_CORE)
    implementation (Dependencies.HILT)
    implementation (Dependencies.HILT_JETPACK)
//    kapt(Dependencies.HILT_ANNOTATION_PROCESSOR)
    implementation(Dependencies.NAVIGATION_FRAGMENT)
    implementation(Dependencies.NAVIGATION_UI)
    testImplementation (Dependencies.KOIN_TEST)
    testImplementation (Dependencies.JUNIT)
    androidTestImplementation (Dependencies.JUNIT_EXT)
    androidTestImplementation (Dependencies.ESPRESSO)

}