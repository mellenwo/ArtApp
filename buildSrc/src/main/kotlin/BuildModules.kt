/**
 * Configuration of build modules
 */
object BuildModules {
    const val APP = ":app"
    const val CORE = ":core"

    object Commons {
        const val UI = ":commons:ui"
        const val VIEWS = ":commons:views"
    }

    object Features {
        const val HOME = ":features:home"
        const val ART_LIST = ":features:art_list"
    }
}