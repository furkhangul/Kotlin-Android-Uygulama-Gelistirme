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

        //Kotlin'de kodlar sırası ile yukarıdan aşağıya doğru çalışmaktadır.
        //Burada yazılan her şeyin anlaşılır olması gerekmektedir.
        //Çift slash ifadesi ile yorum satırı açılır.
        //Bütün veriler senkroinze çalışır. Ve parantez açılır ise parantez kapatılaması şarttır.
        //Metinler tırnak işaretleri arasında çalışmaktadır.
        println("FurOfTheWeak")
        print(5/2)
    }
}
