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

Abstraction: Ortak davranışı (calistir) tanımlar, ama nasıl yapılacağını alt sınıflara bırakır.
*Nesne tabanlı programlamada ortak özellikler ve davranışlar soyut (abstract) sınıflarda toplanır,
 ama detaylar alt sınıflar tarafından uygulanır.
Soyut sınıflardan nesne oluşturulamaz, sadece miras alınabilir. */

// Soyut sınıf
abstract class Arac {
    abstract fun calistir() // gövdesiz, alt sınıflar dolduracak
}

// Alt sınıflar
class Araba : Arac() {
    override fun calistir() {
        println("Araba çalıştı")
    }
}

class Motosiklet : Arac() {
    override fun calistir() {
        println("Motosiklet çalıştı")
    }
}

fun main() {
    val a: Arac = Araba()
    val m: Arac = Motosiklet()

    a.calistir() // Araba çalıştı
    m.calistir() // Motosiklet çalıştı
}


