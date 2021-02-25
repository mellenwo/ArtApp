package com.mellenwood.dynamicfeatures.artfavorites.ui.favorite.di

import com.mellenwood.core.di.CoreComponent
import com.mellenwood.core.di.scopes.FeatureScope
import com.mellenwood.dynamicfeatures.artfavorites.ui.favorite.ArtFavoritesFragment
import dagger.Component

/**
 * Class for which a fully-formed, dependency-injected implementation is to
 * be generated from [ArtFavoritesModule].
 *
 * @see Component
 */
@FeatureScope
@Component(
    modules = [ArtFavoritesModule::class],
    dependencies = [CoreComponent::class]
)
interface ArtFavoritesComponent {

    /**
     * Inject dependencies on component.
     *
     * @param listFragment Characters list component.
     */
    fun inject(favoritesFragment: ArtFavoritesFragment)
}