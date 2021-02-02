package com.mellenwood.dynamicfeatures.home.ui

import com.mellenwood.artapp.ArtApplication.Companion.coreComponent
import com.mellenwood.commons.ui.base.BaseFragment
import com.mellenwood.dynamicfeatures.home.R
import com.mellenwood.dynamicfeatures.home.databinding.FragmentHomeBinding
import com.mellenwood.dynamicfeatures.home.ui.di.DaggerHomeComponent
import com.mellenwood.dynamicfeatures.home.ui.di.HomeModule

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    layoutId = R.layout.fragment_home
) {

    override fun onInitDependencyInjection() {
        DaggerHomeComponent
            .builder()
            .coreComponent(coreComponent(requireContext()))
            .homeModule(HomeModule(this))
            .build()
            .inject(this)
    }

    override fun onInitDataBinding() {
        viewBinding.viewModel = viewModel
    }


}