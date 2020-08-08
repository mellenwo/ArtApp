plugins {
    id("commons.android-library")
}


dependencies {
    implementation(project(BuildModules.Commons.UI))

    implementation(Dependencies.LIFECYCLE_EXTENSIONS)
    implementation(Dependencies.ANDROIDX_CORE)
    implementation(Dependencies.FRAGMENT_KTX)
    implementation(Dependencies.CONSTRAINT_LAYOUT)
    implementation(Dependencies.RECYCLER_VIEW)
    implementation(Dependencies.NAVIGATION_LIBRARY)
    implementation(Dependencies.NAVIGATION_FRAGMENT)
}