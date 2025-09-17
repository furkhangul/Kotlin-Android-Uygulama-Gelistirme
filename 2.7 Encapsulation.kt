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
class BankaHesabi {
    private var bakiye: Int = 0  // dışarıdan erişilemez

    fun paraYatir(miktar: Int) { // kontrollü erişim
        bakiye += miktar
    }

    fun bakiyeGoster(): Int {    // sadece okuma izni
        return bakiye
    }
}

fun main() {
    val hesap = BankaHesabi()
    // hesap.bakiye = 1000  -> hata verir, çünkü private
    hesap.paraYatir(200)         // sadece fonksiyonla işlem yapılabilir
    println(hesap.bakiyeGoster())// 200
}

