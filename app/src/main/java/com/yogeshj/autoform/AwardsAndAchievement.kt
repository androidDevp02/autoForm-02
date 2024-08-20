package com.yogeshj.autoform

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yogeshj.autoform.databinding.ActivityAwardsAndAchievementBinding

class AwardsAndAchievement : AppCompatActivity() {
    private lateinit var binding :ActivityAwardsAndAchievementBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        binding= ActivityAwardsAndAchievementBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}