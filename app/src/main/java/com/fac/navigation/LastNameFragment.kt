package com.fac.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.fac.navigation.databinding.ActivityMainBinding
import com.fac.navigation.databinding.FragmentLastNameBinding


class LastNameFragment : Fragment() {

    // private val args: LastNameFragmentArgs by navArgs()
    private lateinit var binding: FragmentLastNameBinding
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil
            .inflate(inflater, R.layout.fragment_last_name, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // binding.lastNameTextView.text = args.name
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        binding.actionNext.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.action_lastNameFragment_to_resultFragment)
        }
    }
}