package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMotherBinding
import com.example.myapplication.motherqustions.questionlist

class MotherActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMotherBinding
    private var position = 0
    private var chose = 0
    private var points = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMotherBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            tv.text = questionlist[position].question
            btn1.text = questionlist[position].firstChoice
            btn2.text = questionlist[position].secondChoice
            btn1.setOnClickListener {
                chose= 1
            }
            btn2.setOnClickListener {
                chose = 2
            }

            btnGo.setOnClickListener {

                if(position<=3){
                    position++
                    tv.text = questionlist[position].question
                    btn1.text = questionlist[position].firstChoice
                    btn2.text = questionlist[position].secondChoice
                    if (chose==1&& questionlist[position].answer==1)
                        points++
                    else

                    if(position==3)
                        btnGo.text = "Submit"
                }else {

                }




            }

        }

    }
}