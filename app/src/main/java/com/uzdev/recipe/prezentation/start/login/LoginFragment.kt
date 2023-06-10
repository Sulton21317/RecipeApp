package com.uzdev.recipe.prezentation.start.login

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.uzdev.recipe.R
import com.uzdev.recipe.databinding.FragmentLoginBinding
import com.uzdev.recipe.prezentation.home.HomeActivity

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLoginBinding.inflate(inflater, container, false)

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
            btnLogin.setOnClickListener {
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