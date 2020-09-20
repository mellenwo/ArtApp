package com.mellenwood.dynamicfeatures.home.ui

import com.mellenwood.commons.ui.base.BaseFragment
import com.mellenwood.dynamicfeatures.home.R
import com.mellenwood.dynamicfeatures.home.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    layoutId = R.layout.fragment_home
) {
    override fun onInitDataBinding() {
        viewBinding
    }

}