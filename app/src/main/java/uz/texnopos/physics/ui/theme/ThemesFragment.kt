package uz.texnopos.physics.ui.theme

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import org.koin.android.viewmodel.ext.android.viewModel
import uz.texnopos.physics.R
import uz.texnopos.physics.core.BaseFragment
import uz.texnopos.physics.core.extention.addVertDivider
import uz.texnopos.physics.databinding.ThemesBinding

class ThemesFragment: BaseFragment(R.layout.themes) {
    private val adapter = ThemesAdapter()
    private val viewModel: ThemesViewModel by viewModel()
    private lateinit var binding: ThemesBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binding = ThemesBinding.bind(view)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.addVertDivider(requireContext())
        viewModel.getThemes()

        viewModel.themeList.observe(
            viewLifecycleOwner, Observer {
                adapter.models = it
            }
        )
    }
}