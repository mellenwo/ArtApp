package com.mellenwood.dynamicfeatures.artlist.ui.list.di

import androidx.annotation.VisibleForTesting
import androidx.annotation.VisibleForTesting.PRIVATE
import com.mellenwood.commons.ui.extensions.viewModel
import com.mellenwood.core.di.scopes.FeatureScope
import com.mellenwood.dynamicfeatures.artlist.ui.list.ArtListFragment
import com.mellenwood.dynamicfeatures.artlist.ui.list.ArtListViewModel
import dagger.Module
import dagger.Provides

@Module
class ArtListModule(
    @VisibleForTesting(otherwise = PRIVATE)
    val fragment: ArtListFragment
) {

    @FeatureScope
    @Provides
    fun providesArtListViewModel() = fragment.viewModel {
        ArtListViewModel()
    }

}