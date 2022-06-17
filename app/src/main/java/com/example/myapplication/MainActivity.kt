package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        trueButton = findViewById(R.id.true_butthon)
        falseButton = findViewById(R.id.false_butthon)

        trueButton.setOnClickListener{
            Toast.makeText(this, R.string.Toast_corect,Toast.LENGTH_LONG).show()
        }

        falseButton.setOnClickListener{
            Toast.makeText(this, R.string.Toast_incorrect,Toast.LENGTH_LONG,)
        }




    }
}