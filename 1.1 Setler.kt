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
        // Set - Benzersiz Elemanlardan Oluşan Koleksiyon:
        // Aynı eleman birden fazla kez eklenemez. Otomatik olarak teke düşürülür.

        // 1. Değiştirilemez Set:
        val sabitSet = setOf("Elma", "Armut", "Elma", "Karpuz")
        // "Elma" 2 kere yazıldı ama sadece bir kere saklanır

        println("Sabit Set: $sabitSet")  // Çıktı: [Elma, Armut, Karpuz]

        // 2. Değiştirilebilir Set:
        val meyveSet = mutableSetOf("Muz", "Kivi")

        // Eleman ekleme:
        meyveSet.add("Çilek")
        meyveSet.add("Kivi")  // Eklenmez, çünkü zaten var

        // Eleman silme:
        meyveSet.remove("Muz")

        // Set üzerinde gezinme:
        for (meyve in meyveSet) {
            println("Meyve: $meyve")
        }

        // Eleman kontrolü:
        val varMi = meyveSet.contains("Kivi")  // true

    }
}
