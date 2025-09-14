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
        // for Döngüsü - Belirli sayıda veya koleksiyon elemanları kadar tekrarlanır

// 1'den 5'e kadar sayıları yazdıran for döngüsü
        for (i in 1..5) {
            // i değişkeni 1'den başlayıp 5'e kadar artar (5 dahil)
            println("Sayı: $i")
        }

// Liste üzerinde for döngüsü kullanımı
        val meyveler = listOf("Elma", "Armut", "Muz")

// Meyveler listesindeki her eleman için döngü çalışır
        for (meyve in meyveler) {
            println("Meyve: $meyve")
        }

// Index ile birlikte liste üzerinde dönmek
        for ((index, meyve) in meyveler.withIndex()) {
            println("Meyve $index: $meyve")
        }

    }
}
