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
        val artist1 = Artist("Furkan", 20, "G" +
                "tar")
        println(artist1.isim)
        artist1.isim = "İsimsiz"
        artist1.sarkiSoyle()

        val artist2 = Artist("Zeynep", 20, "Bateri")
        artist2.sarkiSoyle()

        //Encapsulation -> Visibility Modifiers
        //Private ->Özel
        //Protected ->Korunmalı
        //Public ->Herkese Açık
        //İnternal ->iç
    }
}

open class Kisi {
    // Private -> Sadece bu sınıfın içinden erişilebilir
    private var tcNo: String = "12345678901"

    // Protected -> Bu sınıftan ve bu sınıfı miras alan sınıflardan erişilebilir
    protected var ad: String = "Furkan"

    // Internal -> Sadece aynı module içindeki sınıflardan erişilebilir
    internal var soyad: String = "Gül"

    // Public -> Her yerden erişilebilir (default)
    var yas: Int = 25

    fun tcNoGoster() {
        // Private olduğu için sadece buradan erişilebildi
        println("TC No: $tcNo")
    }
}

