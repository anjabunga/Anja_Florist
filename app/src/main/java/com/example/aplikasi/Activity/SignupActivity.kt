package com.example.aplikasi.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aplikasi.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.submitbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            Toast.makeText(this, "akun berhasil terdaftar! silakan login", Toast.LENGTH_SHORT).show()

        }
    }
}
