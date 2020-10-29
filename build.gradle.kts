import extensions.applyDefault

allprojects {
    repositories.applyDefault()
}

buildscript {
    repositories {
        jcenter()
        google()
    }

    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.28.3-alpha")
    }
}