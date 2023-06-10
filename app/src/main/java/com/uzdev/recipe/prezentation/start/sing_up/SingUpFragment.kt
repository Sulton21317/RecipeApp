package com.uzdev.recipe.prezentation.start.sing_up

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.uzdev.recipe.R
import com.uzdev.recipe.databinding.FragmentSingUpBinding
import com.uzdev.recipe.prezentation.home.HomeActivity


class SingUpFragment : Fragment() {

    private var _binding: FragmentSingUpBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSingUpBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        with(binding) {
            btnBackToIntro.setOnClickListener {
                findNavController().navigateUp()
            }
            btnSignUp.setOnClickListener {
                startActivity(Intent(requireActivity(), HomeActivity::class.java))
                requireActivity().finish()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}