package com.yogeshj.autoform

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yogeshj.autoform.databinding.ActivityLanguageBinding
import java.util.zip.Inflater

class LanguageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLanguageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        binding=ActivityLanguageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}