package com.appydesk.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // Declaring Variables

   lateinit var tv:TextView
   lateinit var button:Button
   lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Finding Variables
        tv = findViewById(R.id.tv)
        button = findViewById(R.id.button)
        imageView = findViewById(R.id.imageView)


        // OnClick Listner
        button.setOnClickListener {
            rollDice()  //Function

          }
    }


// Creating Our Function
    private fun rollDice() {
        val rollNumb = (1..6).random()
         var number = rollNumb.toString()
        tv.text=number


        // Showing A Toast In Android Kotlin!
        Toast.makeText(applicationContext, "Your Dice Is Rolled Good Luck!", Toast.LENGTH_LONG)
            .show()


        // When Condition!

       var dice =  when(rollNumb){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6


        }
imageView.setImageResource(dice)

    }




}