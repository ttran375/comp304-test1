package com.example.johnsmith_comp304_002_hands_on_test1_s24

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private val useCheckBoxes = true // Set to false if using RadioButtons

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nextButton: Button = findViewById(R.id.next_button)
        nextButton.setOnClickListener {
            showSelectedExercises()
        }
    }

    private fun showSelectedExercises() {
        val selectedExercises = StringBuilder("Selected exercises: ")

        val loseThings: RadioButton = findViewById(R.id.radio_lose_things)
        val rememberNames: RadioButton = findViewById(R.id.radio_remember_names)
        val learnQuickly: RadioButton = findViewById(R.id.radio_learn_quickly)
        val keepTrack: RadioButton = findViewById(R.id.radio_keep_track)

        if (loseThings.isChecked) selectedExercises.append("Lose things")
        if (rememberNames.isChecked) selectedExercises.append("Remember names")
        if (learnQuickly.isChecked) selectedExercises.append("Learn things quickly")
        if (keepTrack.isChecked) selectedExercises.append("Keep track of multiple things")

        Toast.makeText(this, selectedExercises.toString(), Toast.LENGTH_SHORT).show()
    }
}