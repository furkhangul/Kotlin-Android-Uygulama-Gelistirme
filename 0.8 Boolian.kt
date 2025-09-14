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
        // Boolean - Mantıksal Değerler:
        // Boolean veri tipi yalnızca true (doğru) veya false (yanlış) değerlerini alabilir.
        // Karşılaştırma operatörleriyle birlikte kullanılır (==, !=, >, <, >=, <=)
        // Mantıksal operatörler: && (ve), || (veya), ! (değil)

        val dogruMu: Boolean = true
        val yanlisMi: Boolean = false

        val sayi = 10
        val kontrol = sayi > 5  // true döner

        val ad = "Furkan"
        val kontrol2 = ad == "Furkan"  // true döner

        val sonuc = (sayi > 5) && (ad == "Furkan")  // true && true -> true

        val tersSonuc = !sonuc  // false olur (true'nun değil'i)

    }
}
