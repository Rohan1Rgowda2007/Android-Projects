package com.example.my_trial_apk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val entryDateOFBirth = findViewById<EditText>(R.id.dateOfBirthEntry)
        val entryPresentYear = findViewById<EditText>(R.id.PresentYearEntry)
        val textOfAns = findViewById<TextView>(R.id.text_of_ans)
        val calcibutton = findViewById<Button>(R.id.calculatebutton)

        calcibutton.setOnClickListener() {

            try {
                val DateOfBirthValue: Int = entryDateOFBirth.text.toString().toInt()
                val PresentYearValue: Int = entryPresentYear.text.toString().toInt()
                val sum = PresentYearValue - DateOfBirthValue
                textOfAns.setText("        Age : " + sum)
                if (sum > 100) {
                    textOfAns.setText("you have been lived for\n ${sum} years :)")
                }

            } catch (e: NumberFormatException) {
                textOfAns.setText("   Sorry not able to understand")
            }

        }
    }
}
