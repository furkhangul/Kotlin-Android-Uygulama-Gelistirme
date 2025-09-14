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
        // Tür Dönüşümleri (Type Conversions):
        // Kotlin'de veri tipleri arasında otomatik dönüşüm yoktur. Dönüşümler açıkça belirtilmelidir.

        val intSayi: Int = 42
        val doubleSayi: Double = intSayi.toDouble()  // Int -> Double dönüşümü

        val doubleDeger = 3.14
        val intDeger = doubleDeger.toInt()  // Double -> Int dönüşümü (ondalık kısmı silinir)

        val sayiStr = "123"
        val strToInt = sayiStr.toInt()  // String -> Int dönüşümü

        val intToStr = intSayi.toString()  // Int -> String dönüşümü

        // Uyarı: Geçersiz dönüşüm yapmaya çalışırsan uygulama çökebilir!
        // Örnek: val hata = "abc".toInt()  // HATA verir! Çünkü "abc" sayı değildir.

    }
}
