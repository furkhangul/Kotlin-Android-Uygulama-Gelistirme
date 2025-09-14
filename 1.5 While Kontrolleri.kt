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
        // while Döngüsü - Koşul doğru olduğu sürece kod bloğunu tekrarlar
        var sayac = 1
        while (sayac <= 5) {
            println("Sayaç: $sayac")
            sayac++
        }


//Bakiye kontrolü ile çekim işlemi
        var bakiye = 1000      // Başlangıç bakiyesi 1000 TL
        var cekilen = 0        // Toplam çekilen miktar

// while döngüsü, bakiye 200 TL veya üzerinde olduğu sürece devam eder
        while (bakiye >= 200) {
            println("200 TL çekildi.")
            bakiye -= 200      
            cekilen += 200    
        }

// Döngü bittiğinde bakiyeyi ve toplam çekilen tutarı yazdırıyorum
        println("Toplam çekilen miktar: $cekilen TL")
        println("Kalan bakiye: $bakiye TL")

    }
}
