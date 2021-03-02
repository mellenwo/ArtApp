package com.mellenwood.dynamicfeatures.artlist.ui.list.di

import com.mellenwood.core.di.CoreComponent
import com.mellenwood.core.di.scopes.FeatureScope
import com.mellenwood.dynamicfeatures.artlist.ui.list.ArtListFragment
import dagger.Component

/**
 * Class for which a fully-formed, dependency-injected implementation is to
 * be generated from [ArtListModule].
 *
 * @see Component
 */
@FeatureScope
@Component(
    modules = [ArtListModule::class],
    dependencies = [CoreComponent::class]
)
interface ArtListComponent {

    /**
     * Inject dependencies on component.
     *
     * @param listFragment Characters list component.
     */
    fun inject(listFragment: ArtListFragment)
}