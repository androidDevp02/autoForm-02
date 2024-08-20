package com.yogeshj.autoform

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yogeshj.autoform.databinding.ActivityEducationBinding
import com.yogeshj.autoform.databinding.ActivityUpdateProfileBinding
import java.util.zip.Inflater

class EducationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEducationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityEducationBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}