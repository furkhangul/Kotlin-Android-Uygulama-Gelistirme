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
       //Basit İf kullanımı
        val yas = 18

        if (yas >= 18) {
            println("Reşitsiniz.")
        //İf-else kullanımı.
            val puan = 45

            if (puan >= 50) {
                println("Geçtiniz.")
            } else {
                println("Kaldınız.")
            }
        //if - else - else if kullanımı
            val not = 85

            if (not >= 90) {
                println("Notunuz: AA")
            } else if (not >= 80) {
                println("Notunuz: BA")
            } else if (not >= 70) {
                println("Notunuz: BB")
            } else {
                println("Daha çok çalışmalısın.")
            }

        }
    }
}
