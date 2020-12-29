package com.mellenwood.dynamicfeatures.home.ui

import com.mellenwood.artapp.ArtApplication
import com.mellenwood.commons.ui.base.BaseFragment
import com.mellenwood.dynamicfeatures.home.R
import com.mellenwood.dynamicfeatures.home.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    layoutId = R.layout.fragment_home
) {
    override fun onInitDataBinding() {
        //viewBinding.viewModel = viewModel
    }

    override fun onInitDependencyInjection() {
//        DaggerLoginComponent.builder()
//            .context(this)
//            .appDependencies(
//                EntryPointAccessors.fromApplication(
//                    applicationContext,
//                    LoginModuleDependencies::class.java
//                )
//            )
//            .build()
//            .inject(this)
    }

}