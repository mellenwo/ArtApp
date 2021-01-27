import extensions.applyDefault

allprojects {
    repositories.applyDefault()
}

buildscript {
    repositories {
        jcenter()
        google()
    }
}