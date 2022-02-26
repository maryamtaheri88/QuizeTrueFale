package com.example.quizetrue_fale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizetrue_fale.databinding.ActivityCheatBinding

class cheat : AppCompatActivity() {

    lateinit var binding :ActivityCheatBinding
    var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCheatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.CheatQuesti.text= SetData.que[currentIndex].question

        binding.showAnswerButton.setOnClickListener{

        }
    }



}