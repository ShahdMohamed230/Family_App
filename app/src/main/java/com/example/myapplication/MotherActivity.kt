package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMotherBinding

private val TAG = "MotherActivity"

class MotherActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMotherBinding
    private var position = 0
    private var points: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMotherBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            tv.text = questionList[position].question
            btn1.text = questionList[position].firstChoice
            btn2.text = questionList[position].secondChoice

            btnGo.setOnClickListener {

                if (btn1.isChecked) {
                    if (btn1.text == questionList[position].answer) {
                        points++
                    }

                } else if (btn2.isChecked) {
                    if (btn2.text == questionList[position].answer) {
                        points++
                    }
                } else {
                    Toast.makeText(
                        this@MotherActivity,
                        "Please Choice an answer",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                position++

                if (position < 4) {
                    tv.text = questionList[position].question
                    btn1.text = questionList[position].firstChoice
                    btn2.text = questionList[position].secondChoice
                } else {
                    val intent = Intent(this@MotherActivity, ResultActivity::class.java)
                    intent.putExtra("points", points)
                    startActivity(intent)
                }

            }

        }

    }

    companion object {
        val questionList = listOf<MotherQuestion>(
            MotherQuestion("كم عدد جلوسك مع ابنك", "(2:4)", "(4:6)", "(4:6)"),
            MotherQuestion("ما طريقة عقابك له", "الضرب", "الحرمان من اللعب", "الحرمان من اللعب"),
            MotherQuestion("هل تتابع مستواه الدراسي", "نعم", "لا", "نعم"),
            MotherQuestion("هل حضنت ابنك اليوم", "نعم", "لا", "نعم")
        )
    }


}