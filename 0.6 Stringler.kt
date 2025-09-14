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

        // String - Metin İfadeleri:
        // String, karakterlerin birleşiminden oluşan metinleri tutmak için kullanılır.
        // String'ler çift tırnak (" ") içinde yazılır.
        // Örneğin: val name = "Furkan"
        // String ifadeler birleştirilebilir ve içerisine değişken eklenebilir.
        // Örneğin: val welcome = "Hoş geldin, $name"
        val name = "Furkan"
        val welcome = "Hoş geldin, $name"
    }



    }
}
