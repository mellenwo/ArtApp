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
        classpath(Dependencies.HILT_PLUGIN)
    }
}