package com.uzdev.recipe.prezentation.start

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.view.WindowInsetsController
import android.widget.RelativeLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.core.view.updateLayoutParams
import androidx.navigation.findNavController
import com.uzdev.recipe.R

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val rel = RelativeLayout(this)
        setContentView(R.layout.activity_start)




    }
    override fun onNavigateUp(): Boolean {
        return  findNavController(R.id.startFragmentContainerView).navigateUp()|| super.onSupportNavigateUp()
    }
}