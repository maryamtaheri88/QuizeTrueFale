package com.example.quizetrue_fale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizetrue_fale.databinding.ActivityCheatBinding

class cheat : AppCompatActivity() {

    lateinit var binding :ActivityCheatBinding
    var currentIndex = 0
    var max = 9

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCheatBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.showAnswerButton.setOnClickListener{

            for (i in  0..max ){
                binding.CheatQuesti.text= SetData.que[currentIndex].question
                binding.answer.text=SetData.que[currentIndex].correctAnswer
            }

        }
    }



}