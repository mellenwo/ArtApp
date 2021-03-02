package com.mellenwood.dynamicfeatures.artlist.ui.detail.di

import androidx.annotation.VisibleForTesting
import androidx.annotation.VisibleForTesting.PRIVATE
import com.mellenwood.dynamicfeatures.artlist.ui.detail.ArtDetailFragment
import dagger.Module

/**
 * Class that contributes to the object graph [ArtDetailComponent].
 *
 * @see Module
 */
@Module
class ArtDetailModule(
    @VisibleForTesting(otherwise = PRIVATE)
    val fragment: ArtDetailFragment
) {


}