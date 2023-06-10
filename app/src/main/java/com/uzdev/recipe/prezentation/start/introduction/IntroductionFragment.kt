package com.uzdev.recipe.prezentation.start.introduction

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.uzdev.recipe.R
import com.uzdev.recipe.databinding.FragmentIntroductionBinding


class IntroductionFragment : Fragment() {

    private var _binding: FragmentIntroductionBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentIntroductionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        with(binding) {
            btnSignUp.setOnClickListener {
                findNavController().navigate(R.id.action_introductionFragment_to_singUpFragment)
            }

            btnLogin.setOnClickListener {
                findNavController().navigate(R.id.action_introductionFragment_to_loginFragment)
            }
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}