package com.example.listview

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private val countries = arrayOf(
        "Sri Lanka", "India", "Japan", "China", "Nepal",
        "Australia", "New Zealand", "USA", "UK", "Germany",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.ListViewCountries)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,countries)

        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedCountry = countries[position]
            Toast.makeText(this, "Selected: $selectedCountry", Toast.LENGTH_SHORT).show()
        }
    }
    }
