package com.example.aplikasi.Activity


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.aplikasi.R
import com.example.aplikasi.databinding.MainPageBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainpageActivity : AppCompatActivity() {
    private lateinit var binding: MainPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.konten)
        navView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.konten)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
    }
