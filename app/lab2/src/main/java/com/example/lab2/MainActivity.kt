package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View

class MainActivity : AppCompatActivity()
{
    private lateinit var  button1: Button
    private lateinit var  button2: Button
    private lateinit var  button3: Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linearlayout)
        button1=findViewById(R.id.button1)
        button2=findViewById(R.id.button2)
        button3=findViewById(R.id.button3)
    }

    fun onButton1Click(view: View)
    {
        val buttonText2 = button2.text.toString()
        val buttonText3 = button3.text.toString()

        button2.text=buttonText3
        button3.text=buttonText2
    }

    fun onButton2Click(view: View)
    {
        val buttonText1 = button1.text.toString()
        val buttonText3 = button3.text.toString()

        button1.text=buttonText3
        button3.text=buttonText1
    }

    fun onButton3Click(view: View)
    {
        val buttonText1 = button1.text.toString()
        val buttonText2 = button2.text.toString()

        button1.text=buttonText2
        button2.text=buttonText1
    }

}