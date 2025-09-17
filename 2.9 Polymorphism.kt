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

    }
}
/*
Nesne tabanlı programlamada aynı isimli fonksiyonların farklı sınıflarda farklı davranış göstermesine denir.
Yani bir üst sınıftan türeyen alt sınıflar, aynı metodu kendine göre değiştirebilir.
 */

// Üst sınıf
open class Hayvan {
    open fun sesCikar() {
        println("Hayvan ses çıkarıyor")
    }
}

// Alt sınıflar
class Kedi : Hayvan() {
    override fun sesCikar() {
        println("Miyav")
    }
}

class Kopek : Hayvan() {
    override fun sesCikar() {
        println("Hav hav")
    }
}

// Polymorphism örneği
fun sesCal(h: Hayvan) {
    h.sesCikar() // Parametre hangi tür ise o çalışır
}

fun main() {
    val h1: Hayvan = Kedi()
    val h2: Hayvan = Kopek()

    sesCal(h1) // Miyav
    sesCal(h2) // Hav hav
}



