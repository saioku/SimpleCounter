package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.incrementButton)
        val textView = findViewById<TextView>(R.id.textView) //ensure that TextView and textView are at their respective spots
        val upgradeButton = findViewById<Button>(R.id.upgradeButton)

        var counter = 0


        button.setOnClickListener {
            counter++
            textView.text = counter.toString()

            if(counter >=100) {

                upgradeButton.visibility = View.VISIBLE
                upgradeButton.setOnClickListener {
                    button.text = "Add 2" //change the text of the counter button

                    //change the increment rate to two
                    button.setOnClickListener{
                        counter += 2
                        textView.text = counter.toString()
                    }

                    //set the button to be invisible immediately after click
                    upgradeButton.visibility = View.INVISIBLE
                }

            }

        }
    }

}