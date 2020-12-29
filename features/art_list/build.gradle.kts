plugins {
    id("commons.android-dynamic-feature")
}

dependencies {
    implementation(project(BuildModules.Features.HOME))
    implementation(project(BuildModules.Commons.VIEWS))

    implementation(Dependencies.RECYCLER_VIEW)
    implementation(Dependencies.PAGING)
    implementation(Dependencies.SWIPE_REFRESH_LAYOUT)
}

