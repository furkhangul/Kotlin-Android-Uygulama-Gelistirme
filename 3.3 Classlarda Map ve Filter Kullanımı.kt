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

    val sanatcilar = arrayListOf<Sanatci>()
    val sanatci1 = Sanatci("Furkan",20, "Gitar")
    val sanatci2 = Sanatci("Özge", 18, "Bateri")
    val sanatci3 = Sanatci("Kerem", 32, "Piyano")

    val otuzdanbuyuksanatciensturmanlar = sanatcilar.filter { it.yas >30}.map{it.ensturman}
    for(ensturman in otuzdanbuyuksanatciensturmanlar){
        println(ensturman)
    }
    }
}

class Sanatci(val isim : String, val yas : Int, val ensturman : String)
{

}

