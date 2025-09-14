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
        // Listeler (Lists):
        // List, birden fazla değeri sıralı olarak saklamaya yarar.
        // Dizilerden farkı: daha esnektir, boyutları kolayca değiştirilebilir (mutable olanlar).

        // 1. Değiştirilemez (Immutable) Liste:
        val sayilarListesi = listOf(10, 20, 30)
        val isimler = listOf("Furkan", "Ahmet", "Zeynep")

        // Elemanlara erişim:
        val ilkIsim = isimler[0]  // "Furkan"
        val listeBoyutu = sayilarListesi.size

        // Liste üzerinde gezinme:
        for (isim in isimler) {
            println(isim)
        }

        // 2. Değiştirilebilir (Mutable) Liste:
        val mutableList = mutableListOf("Elma", "Armut", "Muz")

        // Eleman ekleme:
        mutableList.add("Kiraz")

        // Eleman silme:
        mutableList.remove("Armut")

        // Eleman değiştirme:
        mutableList[0] = "Karpuz"

        // Sonuçları yazdır:
        for (meyve in mutableList) {
            println(meyve)
        }
    }
}
