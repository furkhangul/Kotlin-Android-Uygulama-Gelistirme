,package com.furkhangul.furoftheweak

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val a = 20
    val b = 30

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.d("MainActivity", "onCreate çalıştırılıyor!")

        birinci()
        birinci()
        ikinci(a, b)

        val sonuc = deger(a, b)
        Log.d("MainActivity", "deger fonksiyonundan dönen sonuç: $sonuc")
    }

    fun birinci() {
        Log.d("MainActivity", "Birinci Fonksiyon Çalışmaktadır!")
    }

    fun ikinci(a: Int, b: Int) {
        Log.d("MainActivity", "İki değerin toplamı: ${a + b}")
    }

    fun deger(a: Int, b: Int): Int {
        val toplam = a + b
        return toplam
    }
}
