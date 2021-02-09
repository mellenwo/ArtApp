plugins {
    id("commons.android-dynamic-feature")
}

dependencies {
    implementation(project(BuildModules.Features.HOME))
    implementation(Dependencies.RECYCLER_VIEW)
}