package com.example.sprinteighthomeworkone

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** Реализация нажатия на кнопку "Поиск" с помощью анонимного класса */

        val searchButton = findViewById<Button>(R.id.search)

        val searchButtonClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(
                    this@MainActivity,
                    "Нажали на кнопку \"Поиск\"",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        searchButton.setOnClickListener(searchButtonClickListener)

        /** Реализация нажатия на кнопку "Медиатека" с помощью лямбда-выражения */

        val mediaButton = findViewById<Button>(R.id.media)
        mediaButton.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Нажали на кнопку \"Медиатека\"",
                Toast.LENGTH_SHORT
            ).show()
        }

        /** Реализация нажатия на кнопку "Настройки" с помощью MainActivity */

        val settingsButton = findViewById<Button>(R.id.settings)
        settingsButton.setOnClickListener(this@MainActivity)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.settings -> {
                Toast.makeText(this@MainActivity,
                    "Нажали на кнопку \"Настройки\"",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}