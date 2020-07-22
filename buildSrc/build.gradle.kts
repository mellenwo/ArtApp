plugins {
    `kotlin-dsl`
}

// Required since Gradle 4.10+.
repositories {
    google()
    jcenter()
    mavenCentral()
}

object PluginsVersions {
    const val GRADLE_ANDROID = "4.0.1"
    const val KOTLIN = "1.3.72"
}

dependencies {
    implementation("com.android.tools.build:gradle:${PluginsVersions.GRADLE_ANDROID}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginsVersions.KOTLIN}")
}




