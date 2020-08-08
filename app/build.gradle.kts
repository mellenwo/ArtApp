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

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation (Dependencies.KOTLIN)
    implementation (Dependencies.ANDROIDX_CORE)
    implementation (Dependencies.APPCOMPAT)
    implementation (Dependencies.CONSTRAINT_LAYOUT)
    implementation (Dependencies.KOIN_CORE)
    implementation (Dependencies.KOIN_SCOPE)
    implementation (Dependencies.KOIN_FRAGMENT)
    implementation (Dependencies.KOIN_VIEWMODEL)
    implementation (Dependencies.KOIN_EXPERIMENTAL)
    testImplementation (Dependencies.KOIN_TEST)
    testImplementation (Dependencies.JUNIT)
    androidTestImplementation (Dependencies.JUNIT_EXT)
    androidTestImplementation (Dependencies.ESPRESSO)

}