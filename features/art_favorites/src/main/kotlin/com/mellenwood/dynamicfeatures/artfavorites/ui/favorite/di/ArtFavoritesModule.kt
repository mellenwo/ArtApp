package com.mellenwood.dynamicfeatures.artfavorites.ui.favorite.di

import androidx.annotation.VisibleForTesting
import androidx.annotation.VisibleForTesting.PRIVATE
import com.mellenwood.commons.ui.extensions.viewModel
import com.mellenwood.core.di.scopes.FeatureScope
import com.mellenwood.dynamicfeatures.artfavorites.ui.favorite.ArtFavoritesFragment
import com.mellenwood.dynamicfeatures.artfavorites.ui.favorite.ArtFavoritesViewModel
import dagger.Module
import dagger.Provides

@Module
class ArtFavoritesModule (
    @VisibleForTesting(otherwise = PRIVATE)
    val fragment: ArtFavoritesFragment
) {

    @FeatureScope
    @Provides
    fun providesArtFavoritesViewModel() = fragment.viewModel {
        ArtFavoritesViewModel()
    }

}