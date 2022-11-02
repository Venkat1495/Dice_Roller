package com.example.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // This will helps to connects between the layout and main activity
        var rollbutton: Button = findViewById(R.id.roll_button)
        //rollbutton.text = "Let's Roll"  Modified the text on button
        rollbutton.setOnClickListener {
            // Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show() this helps display small popup on screen
            rollDice()
        }

    }

    private fun rollDice() {
        var resulttext: TextView = findViewById(R.id.result_text)
        var randomdice = Random().nextInt(6) + 1
        resulttext.text = randomdice.toString()
    }
}