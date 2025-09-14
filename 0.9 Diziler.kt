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
        // Diziler (Arrays):
        // Dizi, birden fazla değeri tek bir değişkende saklamamıza yarar.
        // Dizi tanımı: val diziAdi = arrayOf(deger1, deger2, ...)

        val sayilar = arrayOf(1, 2, 3, 4, 5)
        val meyveler = arrayOf("Elma", "Muz", "Portakal")

        // Diziden eleman erişimi: indeks numarasıyla (0'dan başlar)
        val ilkSayi = sayilar[0]         // 1
        val ikinciMeyve = meyveler[1]    // Muz

        // Dizi elemanını değiştirme:
        sayilar[2] = 99  // 3 yerine 99 olur

        // Dizi uzunluğu (eleman sayısı):
        val uzunluk = meyveler.size  // 3

        // Dizi üzerinde döngü ile gezinme:
        for (meyve in meyveler) {
            println(meyve)
        }

        // İndeksli gezinme:
        for (i in sayilar.indices) {
            println("İndeks: $i, Değer: ${sayilar[i]}")
        }

    }
}
