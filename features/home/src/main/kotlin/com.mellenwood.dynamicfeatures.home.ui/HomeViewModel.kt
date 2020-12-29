package com.mellenwood.dynamicfeatures.home.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.mellenwood.dynamicfeatures.home.R

//val NAV_FRAGMENTS_ID = setOf(R.id.characters_list_fragment, R.id.characters_favorites_fragment);

class HomeViewModel : ViewModel() {

    private val _state = MutableLiveData<HomeViewState>()
    val state: LiveData<HomeViewState>
        get() = _state

    /**
     * Navigation controller add destination changed listener.
     *
     * @param navController Navigation manager.
     */
    // TODO: Implement Navigation from Home Fragment
//    fun navigationControllerChanged(navController: NavController) {
//        navController.addOnDestinationChangedListener { _, destination, _ ->
//            if (NAV_FRAGMENTS_ID.contains(destination.id)) {
//                _state.postValue(HomeViewState.NavigationScreen)
//            } else {
//                _state.postValue(HomeViewState.FullScreen)
//            }
//        }
//    }
}