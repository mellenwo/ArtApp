plugins {
    id(BuildPlugins.ANDROID_APPLICATION)
    id(BuildPlugins.KOTLIN_ANDROID)
    id(BuildPlugins.KOTLIN_ANDROID_EXTENSIONS)
}

android {
    compileSdkVersion(29)

    defaultConfig {
        applicationId = "com.mellenwood.myapplication"
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
    implementation (Dependencies.kotlinStandardLibrary)
    implementation (Dependencies.androidXCoreLibrary)
    implementation (Dependencies.appCompatLibrary)
    implementation (Dependencies.constratintLayoutLibrary)
    implementation (Dependencies.koinLibrary)
    implementation (Dependencies.koinScopeLibrary)
    implementation (Dependencies.koinFragmentLibrary)
    implementation (Dependencies.koinViewModelLibrary)
    implementation (Dependencies.koinExperimentalLibrary)
    testImplementation (Dependencies.koinTestLibary)
    testImplementation (Dependencies.jUnitLibrary)
    androidTestImplementation (Dependencies.jUnitTestLibrary)
    androidTestImplementation (Dependencies.espressoLibrary)

}