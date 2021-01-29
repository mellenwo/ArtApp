package com.mellenwood.artapp

import android.content.Context
import com.google.android.play.core.splitcompat.SplitCompatApplication
import com.mellenwood.artapp.di.DaggerAppComponent
import com.mellenwood.core.di.CoreComponent

class ArtApplication : SplitCompatApplication() {

    lateinit var coreComponent: CoreComponent

    companion object {
        /**
         * Obtain core dagger component.
         *
         * @param context The application context
         */
        @JvmStatic
        fun coreComponent(context: Context) =
            (context.applicationContext as? ArtApplication)?.coreComponent
    }

    // ============================================================================================
    //  Private init methods
    // ============================================================================================

    /**
     * Initialize app dependency injection component
     */
    private fun initAppDependencyInjection() {
        DaggerAppComponent
            .builder()
            .coreComponent(coreComponent)
            .build()
            .inject(this)
    }

    /**
     * Initialize core dependency injection component
     */
    private fun initCoreDependencyInjection() {
        // TODO: implement next
    }

}