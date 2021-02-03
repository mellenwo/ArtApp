package com.mellenwood.dynamicfeatures.home.ui

import android.os.Bundle
import android.view.View
import com.mellenwood.artapp.ArtApplication.Companion.coreComponent
import com.mellenwood.commons.ui.base.BaseFragment
import com.mellenwood.dynamicfeatures.home.R
import com.mellenwood.dynamicfeatures.home.databinding.FragmentHomeBinding
import com.mellenwood.dynamicfeatures.home.ui.di.DaggerHomeComponent
import com.mellenwood.dynamicfeatures.home.ui.di.HomeModule

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    layoutId = R.layout.fragment_home
) {

    /**
     * Called to have the fragment instantiate its user interface view.
     *
     * @param view The view returned by onCreateView(LayoutInflater, ViewGroup, Bundle)}.
     * @param savedInstanceState If non-null, this fragment is being re-constructed
     * from a previous saved state as given here.
     * @see BaseFragment.onViewCreated
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar()
        if (savedInstanceState == null) {
            setupBottomNavigationBar()
        }
    }

    private fun setupBottomNavigationBar() {
        // TODO: need to implement
    }

    private fun setupToolbar() {
        setHasOptionsMenu(true)
        // TODO: uncomment once nav graph is finished
        //requireCompatActivity().setSupportActionBar(viewBinding.toolbar)
    }

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