package com.example.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    // lateint var helps to intial outside the funs
    lateinit var diceimage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // This will helps to connects between the layout and main activity
        var rollbutton: Button = findViewById(R.id.roll_button)
        //rollbutton.text = "Let's Roll"  Modified the text on button
        rollbutton.setOnClickListener {
            // Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show() this helps display small popup on screen
            rollDice()
        }
        diceimage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        // var resulttext: TextView = findViewById(R.id.result_text)
        // resulttext.text = randomdice.toString()
        //var diceimage: ImageView = findViewById(R.id.dice_image)

        var randomdice = Random().nextInt(6) + 1
        var draablerecouce = when (randomdice){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        diceimage.setImageResource(draablerecouce)
    }
}