import dependencies.AnnotationProcessorsDependencies

plugins {
    id("commons.android-library")
}


dependencies {
    implementation(Dependencies.LIFECYCLE_EXTENSIONS)
    implementation(Dependencies.LIFECYCLE_VIEWMODEL)
    implementation(Dependencies.ANDROIDX_CORE)
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.NAVIGATION_FRAGMENT)
    implementation(Dependencies.NAVIGATION_UI)
    implementation(Dependencies.PAGING)
    implementation(Dependencies.COIL)
    implementation(Dependencies.FRAGMENT_KTX)
    implementation(Dependencies.CONSTRAINT_LAYOUT)
    implementation(Dependencies.RECYCLER_VIEW)
    implementation(Dependencies.NAVIGATION_LIBRARY)
    implementation(Dependencies.NAVIGATION_FRAGMENT)

    kapt(AnnotationProcessorsDependencies.DATABINDING)
}