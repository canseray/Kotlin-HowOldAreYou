package com.example.kotlin_howoldareyou

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculate (view: View){

        var bornYear : Int = editText.text.toString().toInt()

        var thisYear : Int = Calendar.getInstance().get(Calendar.YEAR)

        var age = thisYear - bornYear

        textView.text = "Age: " + age


        //  textView.setText("Age: " + age )   java koduyla
    }
}
