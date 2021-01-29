package com.mellenwood.artapp.di

import com.mellenwood.artapp.ArtApplication
import com.mellenwood.core.di.CoreComponent
import com.mellenwood.core.di.scopes.AppScope
import dagger.Component

/**
 * App component that application component's components depend on.
 *
 * @see Component
 */
@AppScope
@Component(
    dependencies = [CoreComponent::class],
    modules = [AppModule::class]
)
interface AppComponent {
    /**
     * Inject dependencies on application.
     *
     * @param application The sample application.
     */
    fun inject(application: ArtApplication)

}