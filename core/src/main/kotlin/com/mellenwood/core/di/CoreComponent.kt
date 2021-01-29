package com.mellenwood.core.di

import com.mellenwood.core.di.modules.ContextModule
import dagger.Component
import javax.inject.Singleton

/**
 * Core component that all module's components depend on.
 *
 * @see Component
 */
@Singleton
@Component(
    modules = [
        ContextModule::class
    ]
)
interface CoreComponent