package com.example.newcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edittext = EditText(this)
        val button = Button(this)
        button.setOnClickListener {
            edittext.append("1")
        }

        /*   button.setOnClickListener {

        }

        val sum = calculate(1, 2)
        sum




        calculateAction(1, 2) { sum ->
        }
    }


    private fun calculate(first:Int, second: Int): Int {
        return first + second
    }

    private fun calculateAction(first: Int, second: Int, action: (Int) -> Unit) {
        action(first + second)
    }*/
    }
}