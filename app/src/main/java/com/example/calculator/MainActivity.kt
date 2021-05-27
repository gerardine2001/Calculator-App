package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num1=findViewById<TextView>(R.id.etNum)
        var num2=findViewById<TextView>(R.id.editTextNumber2)
        var add=findViewById<Button>(R.id.etButton)
        var subtract=findViewById<Button>(R.id.etbutton2)
        var multiply=findViewById<Button>(R.id.etbutton3)
        var divide=findViewById<Button>(R.id.etbutton4)
        var etresult=findViewById<TextView>(R.id.etNum2)



        subtract.setOnClickListener{
            var number1=num1.text.toString().toInt()
            var number2=num1.text.toString().toInt()
            var result=number1-number2

            etresult.text="Result:$result"




        }
        add.setOnClickListener{
            var number2=num1.text.toString().toInt()
            var number1=num1.text.toString().toInt()
            var result=number1+number2
            etresult.text="Result:$result"


        }
        divide.setOnClickListener{
            var number1=num1.text.toString().toInt()
            var number2=num1.text.toString().toInt()
            var result=number1/number2


            etresult.text="Result:$result"

        }

        multiply.setOnClickListener{

            var number2=num1.text.toString().toInt()
            var number1=num1.text.toString().toInt()
            var result=number1*number2


            etresult.text="Result:$result"


        }

    }

}