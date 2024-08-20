package com.yogeshj.autoform

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yogeshj.autoform.databinding.ActivityUpdateProfileBinding

class UpdateProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUpdateProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        binding=ActivityUpdateProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.contactBtn.setOnClickListener {
            startActivity(Intent(this@UpdateProfileActivity,ContactInformation::class.java))
        }

        binding.educationBtn.setOnClickListener {
            startActivity(Intent(this@UpdateProfileActivity,EducationActivity::class.java))
        }

        binding.aaaBtn.setOnClickListener {
            startActivity(Intent(this@UpdateProfileActivity,ActivityUpdateProfileBinding::class.java))
        }

        binding.languageBtn.setOnClickListener {
            startActivity(Intent(this@UpdateProfileActivity,LanguageActivity::class.java))
        }

    }
}