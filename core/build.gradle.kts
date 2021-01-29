import dependencies.AnnotationProcessorsDependencies
import extensions.kapt

plugins {
    id("commons.android-library")
}

dependencies {
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.LIFECYCLE_EXTENSIONS)
    implementation(Dependencies.FRAGMENT_KTX)

    kapt(AnnotationProcessorsDependencies.DATABINDING)

}