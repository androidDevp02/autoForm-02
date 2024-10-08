package com.yogeshj.autoform

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yogeshj.autoform.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSignup.setOnClickListener {
            startActivity(Intent(this@LoginActivity,SignUpActivity::class.java))
            finish()
        }
        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this@LoginActivity,FieldSelectActivity::class.java))
            finish()
        }
    }
}