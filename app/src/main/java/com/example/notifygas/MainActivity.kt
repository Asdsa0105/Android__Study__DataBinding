package com.example.notifygas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.notifygas.databinding.ActivityMainBinding
import com.example.notifygas.entity.Gwei
import com.example.notifygas.entity.GweiRange

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.gwei = Gwei(16, GweiRange.Max(18))

        binding.buttonEnter.setOnClickListener {

            binding.apply {

                binding.gwei = Gwei(

                    editInput.text.toString().toInt(),
                    GweiRange.Max(editInput.text.toString().toInt()+2)

                )
            }
        }

    }
}