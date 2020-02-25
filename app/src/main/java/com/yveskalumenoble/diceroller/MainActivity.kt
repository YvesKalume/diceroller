package com.yveskalumenoble.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn :Button = findViewById(R.id.roll_btn)
        rollBtn.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val Dice :ImageView = findViewById(R.id.dice)
        val randInt = Random.nextInt(6)+1
        val diceImage = when(randInt){
            1 -> R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        Dice.setImageResource(diceImage)
    }
}
