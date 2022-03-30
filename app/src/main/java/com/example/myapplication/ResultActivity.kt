package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val points=intent.getIntExtra("points",-1)

        when(points){
            5->binding.textView3.text="التواصل بين الأم وإبنها ممتاز"
            4->binding.textView3.text="التواصل بين الأم وإبنها ممتاز"
            3->binding.textView3.text="التواصل بين الأم وإبنها جيد إلى حد ما "
            2->binding.textView3.text="التواصل بين الأم وإبنها متوسط"
            1->binding.textView3.text="التواصل بين الأم وإبنها ضعيف"
            0->binding.textView3.text="التواصل بين الأم وإبنها منعدم"
        }

    }
}