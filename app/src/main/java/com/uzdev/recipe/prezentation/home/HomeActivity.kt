package com.uzdev.recipe.prezentation.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.uzdev.recipe.R
import com.uzdev.recipe.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNavigationView.setupWithNavController(findNavController(R.id.homeFragmentContainerView))
    }

    override fun onNavigateUp(): Boolean {
        return findNavController(R.id.startFragmentContainerView).navigateUp() || super.onNavigateUp()
    }
}