package com.example.bimandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val btnCalculate:Button
        val lLMain:LinearLayout
        setContentView(R.layout.activity_main)

        val etWeight = findViewById<EditText>(R.id.etWeight)
        val etHeightFt = findViewById<EditText>(R.id.etHeightInFt)
        val etHeightInc = findViewById<EditText>(R.id.etHeightInInches)
        val tvResult = findViewById<TextView>(R.id.tvResu)
        btnCalculate  = findViewById(R.id.btnCalculateBMI)
        lLMain = findViewById(R.id.llMain)
        btnCalculate.setOnClickListener(View.OnClickListener(){

           val wt:Int =  etWeight.text.toString().toInt()
            val hiInInc:Int = etHeightInc.text.toString().toInt()
            val hiInFt:Int = etHeightFt.text.toString().toInt()

            val totalIn:Int  = (hiInFt * 12) + hiInInc

            val totalCm:Double = totalIn *2.53
            val totalM:Double = totalCm/100

            val bmi:Double = wt/(totalM*totalM)

            if (bmi>25){
                tvResult.text = "You're OverWeight"
                lLMain.setBackgroundColor(resources.getColor(R.color.OW))
            }
            else if (bmi<18){
                tvResult.text = "You're UnderWeight"
                lLMain.setBackgroundColor(resources.getColor(R.color.UW))
            }
            else{
                tvResult.text = "You're Healthy"
                lLMain.setBackgroundColor(resources.getColor(R.color.H ))
            }
        })
    }
}