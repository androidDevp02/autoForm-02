package com.yogeshj.autoform

import android.os.Bundle
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yogeshj.autoform.databinding.ActivityFieldSelectBinding

class FieldSelectActivity : AppCompatActivity() {
    private lateinit var binding:ActivityFieldSelectBinding

    private var numSelected=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFieldSelectBinding.inflate(layoutInflater)
        setContentView(binding.root)



        isCheck(binding.engineering)

    }

    private fun isCheck(id: CheckBox) {
        id.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked)
                numSelected++
        }
    }

}