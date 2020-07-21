object Versions {
    val kotlin = "1.2.71"
    val androidX = "1.3.0"
    val appCompat = "1.1.0"
    val constraintLayout = "1.1.3"
    val jUnitTest = "1.1.1"
    val jUnit = "4.12"
    val espresso = "3.2.0"
}

object Dependencies {
    val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val androidXCoreLibrary = "androidx.core:core-ktx:${Versions.androidX}"
    val appCompatLibrary = "androidx.appcompat:appcompat:${Versions.appCompat}"
    val constratintLayoutLibrary = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    val jUnitTestLibrary = "androidx.test.ext:junit:${Versions.jUnitTest}"
    val jUnitLibrary = "junit:junit:${Versions.jUnit}"
    val espressoLibrary = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}