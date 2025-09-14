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
        //Double - Float - Kesirli Sayılar
        // Double - Float - Kesirli Sayılar:
        // Double ve Float veri tipleri, ondalıklı yani kesirli sayıları saklamak için kullanılır.
        // Double daha yüksek hassasiyetli ve daha büyük ondalıklı sayılar için kullanılır (64-bit).
        // Float ise daha az yer kaplar ve daha düşük hassasiyetlidir (32-bit).
        // Örneğin: val pi = 3.141  // Bu bir Double türündedir (varsayılan olarak).

        val pi = 3.141



    }
}
