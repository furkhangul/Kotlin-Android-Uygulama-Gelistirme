package com.furkhangul.furoftheweak

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //When diğer dillerdeki switch e benziyor.
        val gun = 3

        when (gun) {
            1 -> println("Pazartesi")
            2 -> println("Salı")
            3 -> println("Çarşamba")
            4 -> println("Perşembe")
            5 -> println("Cuma")
            6 -> println("Cumartesi")
            7 -> println("Pazar")
            else -> println("Geçersiz gün")
        }


    }
}
