package com.mellenwood.artapp

import android.content.Context
import com.google.android.play.core.splitcompat.SplitCompatApplication
import com.mellenwood.artapp.di.DaggerAppComponent
import com.mellenwood.core.di.CoreComponent
import com.mellenwood.core.di.DaggerCoreComponent
import com.mellenwood.core.di.modules.ContextModule

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

    /**
     * Called when the application is starting, before any activity, service, or receiver objects
     * (excluding content providers) have been created.
     *
     * @see SplitCompatApplication.onCreate
     */
    override fun onCreate() {
        super.onCreate()
        initCoreDependencyInjection()
        initAppDependencyInjection()
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
        coreComponent = DaggerCoreComponent
            .builder()
            .contextModule(ContextModule(this))
            .build()
    }

}