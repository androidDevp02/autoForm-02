package com.yogeshj.autoform

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yogeshj.autoform.databinding.ActivityContactInformationBinding
import com.yogeshj.autoform.databinding.ActivityUpdateProfileBinding

class ContactInformation : AppCompatActivity() {
    private lateinit var binding: ActivityContactInformationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        binding= ActivityContactInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}