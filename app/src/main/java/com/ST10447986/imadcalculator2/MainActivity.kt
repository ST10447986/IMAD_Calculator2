package com.ST10447986.imadcalculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.*
import android.content.Intent

class MainActivity : AppCompatActivity() {
    var etNum1: EditText? = null
    var etNum2: EditText? = null
    var tvDisp: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        tvDisp = findViewById(R.id.tvDisplay)

        val btnADD = findViewById<Button>(R.id.btnADD)
        btnADD.setOnClickListener{add()}

        val btnSUB = findViewById<Button>(R.id.btnSUB)
        btnSUB.setOnClickListener{sub()}

        val btnMUL = findViewById<Button>(R.id.btnMUL)
        btnMUL.setOnClickListener{mul()}

        val btnDIV = findViewById<Button>(R.id.btnDIV)
        btnDIV.setOnClickListener{div()}

        val btnSQR = findViewById<Button>(R.id.btnSQR)
        btnSQR.setOnClickListener{sqr()}

        val btnPOW = findViewById<Button>(R.id.btnPOW)
        btnPOW.setOnClickListener{pow()}

        val btnNextSc = findViewById<Button>(R.id.btnNextScreen)
        btnNextSc.setOnClickListener{
            //call func
            val intent = Intent(this, MainActivity2::class.java)
            //start your next activity
            startActivity(intent)
        }

    }
    private fun add(){
        val input1 =etNum1?.text?.toString()
        val input2 =etNum2?.text?.toString()

        if (input1.isNullOrEmpty()||input2.isNullOrEmpty()){
            tvDisp?.text = "Please enter the valid numbers."
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0

        intAnswer = intNum1 + intNum2

        tvDisp?.text = intAnswer.toString()
    }

    private fun sub(){
        val input1 =etNum1?.text?.toString()
        val input2 =etNum2?.text?.toString()

        if (input1.isNullOrEmpty()||input2.isNullOrEmpty()){
            tvDisp?.text = "Please enter the valid numbers."
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0

        intAnswer = intNum1 - intNum2

        tvDisp?.text = intAnswer.toString()
    }

    private fun mul(){
        val input1 =etNum1?.text?.toString()
        val input2 =etNum2?.text?.toString()

        if (input1.isNullOrEmpty()||input2.isNullOrEmpty()){
            tvDisp?.text = "Please enter the valid numbers."
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0

        intAnswer = intNum2 * intNum1

        tvDisp?.text = intAnswer.toString()
    }

    private fun div(){
        val input1 =etNum1?.text?.toString()
        val input2 =etNum2?.text?.toString()

        if (input1.isNullOrEmpty()||input2.isNullOrEmpty()){
            tvDisp?.text = "Please enter the valid numbers."
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var fltAnswer = 0.0

        if (intNum2==0){
            tvDisp?.text = "Division ny zero is not allowed"
        } else{
            fltAnswer = (intNum1 / intNum2).toDouble()
        }

        tvDisp?.text = fltAnswer.toString()
    }

    private fun sqr(){
        val input1 =etNum1?.text?.toString()
       //val input2 =etNum2?.text?.toString()

        if (input1.isNullOrEmpty()){                //||input2.isNullOrEmpty()){
            tvDisp?.text = "Please enter the valid numbers."
            return
        }
        val intNum1 = input1.toInt()
        //val intNum2 = input2.toInt()
        var fltAnswer = 0                           //flt because it will be a real number.

        fltAnswer = sqrt(intNum1.toDouble()).toInt()

        tvDisp?.text = fltAnswer.toString()
    } 

    private fun pow(){
        val input1 =etNum1?.text?.toString()
        val input2 =etNum2?.text?.toString()

        if (input1.isNullOrEmpty()||input2.isNullOrEmpty()){
            tvDisp?.text = "Please enter the valid numbers."
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 1

                                                // intAnswer = intNum1.pow(intNum2) imported power

        for (i in 1..intNum2!!){
            intAnswer *= intNum1
        }
        tvDisp?.text = intAnswer.toString()
    }
}