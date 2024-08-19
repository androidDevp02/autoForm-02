package com.yogeshj.autoform

import android.content.Intent
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
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
        for (i in 0 until binding.linearLayout.childCount)
        {
            val view=binding.linearLayout.getChildAt(i)
            if(view is CheckBox)
                isCheck(view)
        }

        binding.continueBtn.setOnClickListener {
            startActivity(Intent(this@FieldSelectActivity,ProfileInfoActivity::class.java))
            finish()
        }
    }
    private fun isCheck(id: CheckBox) {
        id.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) {
                if(numSelected<3)
                    numSelected++
                else
                {
                    id.isChecked=false
                    Toast.makeText(this@FieldSelectActivity,"You can only select 3 fields",Toast.LENGTH_LONG).show()
                }
            }
            else
            {
                numSelected--
            }
        }
    }

}