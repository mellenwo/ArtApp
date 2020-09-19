/**
 * Configuration of build modules
 */
object BuildModules {
    const val APP = ":app"

    object Commons {
        const val UI = ":commons:ui"
        const val VIEWS = ":commons:views"
    }

    object Features {
        const val HOME = ":features:home"
    }
}