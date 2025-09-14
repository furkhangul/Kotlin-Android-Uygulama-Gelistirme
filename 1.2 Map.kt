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
        // Map (Anahtar - Değer Yapısı):
        // Her bir anahtar (key) bir değere (value) karşılık gelir.
        // Anahtarlar benzersiz olmalıdır, ancak değerler aynı olabilir.

        // 1. Değiştirilemez Map:
        val sabitMap = mapOf(
            "ad" to "Furkan",
            "yas" to 25,
            "sehir" to "Siirt"
        )

        // Değerlere anahtar ile erişim:
        val isim = sabitMap["ad"]         // "Furkan"
        val yas = sabitMap["yas"]         // 25

        // 2. Değiştirilebilir Map:
        val mutableMap = mutableMapOf(
            "kitap" to "1984",
            "yazar" to "George Orwell"
        )

        // Yeni eleman ekleme:
        mutableMap["sayfa"] = 328

        // Var olan değeri güncelleme:
        mutableMap["kitap"] = "Hayvan Çiftliği"

        // Eleman silme:
        mutableMap.remove("yazar")

        // Map üzerinde gezinme:
        for ((anahtar, deger) in mutableMap) {
            println("Anahtar: $anahtar, Değer: $deger")
        }

        // Anahtar içeriyor mu?
        val varMi = mutableMap.containsKey("kitap")  // true

    }
}
