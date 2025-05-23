package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.collection.emptyLongSet


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username=findViewById<EditText>(R.id.editUsername)
        val password=findViewById<EditText>(R.id.editPassword)
        val loginBtn=findViewById<Button>(R.id.btnLogin)
        val resetBtn=findViewById<Button>(R.id.btnReset)

        val exitUsername="Admin"
        val exitPassword="admin"

        loginBtn.setOnClickListener{
            val user=username.text.toString()
            val pass=password.text.toString()
            if(exitUsername==user && exitPassword==pass)
            {
            Toast.makeText(this,"Successfully Login", Toast.LENGTH_SHORT).show()}
            else{
            Toast.makeText(this,"Invalid Login", Toast.LENGTH_SHORT).show()}

        }
        resetBtn.setOnClickListener{
            username.text.clear()
            password.text.clear()
        }
        }


    }
