package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivityQustionBinding

class qustion : AppCompatActivity() {
    private lateinit var binding: ActivityQustionBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityQustionBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}