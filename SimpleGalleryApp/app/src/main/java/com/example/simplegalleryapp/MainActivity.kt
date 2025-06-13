package com.example.simplegalleryapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var buttonSigiriya: Button
    lateinit var buttonKandy: Button
    lateinit var buttonPolonnaruwa: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        buttonSigiriya = findViewById(R.id.buttonSigiriya)
        buttonKandy = findViewById(R.id.buttonKandy)
        buttonPolonnaruwa = findViewById(R.id.buttonPolonnaruwa)

        buttonSigiriya.setOnClickListener{
            imageView.setImageResource(R.drawable.sigiriya)
        }
        buttonKandy.setOnClickListener{
            imageView.setImageResource(R.drawable.kandy)
        }
        buttonPolonnaruwa.setOnClickListener{
            imageView.setImageResource(R.drawable.polonnaruwa)
        }
    }
}