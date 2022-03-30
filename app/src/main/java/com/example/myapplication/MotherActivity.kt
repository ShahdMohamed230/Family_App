package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMotherBinding
import com.example.myapplication.motherqustions.questionlist

private val TAG = "MotherActivity"

class MotherActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMotherBinding
    private var position = 0
    private var chose = 0
    private var points: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMotherBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            tv.text = questionlist[position].question
            btn1.text = questionlist[position].firstChoice
            btn2.text = questionlist[position].secondChoice

            btnGo.setOnClickListener {

                if (position < 3) {
                    position++
                    Toast.makeText(this@MotherActivity, "$position", Toast.LENGTH_SHORT).show()
                    tv.text = questionlist[position].question
                    btn1.text = questionlist[position].firstChoice
                    btn2.text = questionlist[position].secondChoice
                    if (radioGroup.checkedRadioButtonId == 1)


                        if (position == 3)
                            btnGo.text = "Submit"
                } else {
                    val intent = Intent(this@MotherActivity, ResultActivity::class.java)
                    intent.putExtra("points", points)
                    startActivity(intent)
                }

            }

        }

    }

}