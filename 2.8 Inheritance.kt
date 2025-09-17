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
// Üst sınıf (parent)
open class Hayvan {
    open fun sesCikar() {
        println("Hayvan ses çıkarıyor")
    }
}

// Alt sınıf (child) -> Hayvan sınıfından miras alıyor
class Kedi : Hayvan() {
    override fun sesCikar() {
        println("Miyav")
    }
}

fun main() {
    val hayvan = Hayvan()
    hayvan.sesCikar() // Hayvan ses çıkarıyor

    val kedi = Kedi()
    kedi.sesCikar()   // Miyav
}

