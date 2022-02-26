package com.example.quizetrue_fale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizetrue_fale.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding

    var currentIndex = 0
    var max = 9
    lateinit var answer : String

    var currentcheat = 0
    var listOfnumberOfCheat = arrayListOf<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        checkQuestionNumber()
        listeners()
        setquestion()
    }

    private fun setquestion() {
        SetData.getQuestion()
        binding.questionTextView.text = SetData.que[currentIndex].question
        answer = SetData.que[currentIndex].correctAnswer  //zakhire javab soal

    }

    fun checkQuestionNumber(){
        if (currentIndex == 0){
            binding.prevButton.isClickable = false
        }
        if (currentIndex == max){
            binding.nextButton.isClickable = false
        }
    }
    private fun listeners() {
        binding.cheatButton.setOnClickListener {
            var cheatButton = Intent(this, cheat::class.java)
            cheatButton.putExtra("answer",SetData.que[currentIndex].correctAnswer)
            startActivity(cheatButton)
            currentcheat = SetData.que[currentIndex].id
            listOfnumberOfCheat.add(currentcheat)
        }


        supportActionBar?.hide()   // ActionBar ra az bin mibarad


        binding.trueButton.setOnClickListener {
            if( answer == "true")
                Toast.makeText(this, R.string.true_text, Toast.LENGTH_SHORT).show()
            if( answer == "false")
                Toast.makeText(this, R.string.false_text, Toast.LENGTH_SHORT).show()
        }

        binding.falseButton.setOnClickListener {
            if( answer == "false")
                Toast.makeText(this, R.string.true_text, Toast.LENGTH_SHORT).show()
            if( answer == "true")
                Toast.makeText(this, R.string.false_text, Toast.LENGTH_SHORT).show()
        }

        binding.nextButton.setOnClickListener{
            currentIndex++
            setquestion()
        }


        binding.prevButton.setOnClickListener{
            currentIndex--
            setquestion()
        }

    }


}