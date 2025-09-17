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
        //OOP'ye Giriş
        //4 tane ana prensibi vardır.
        //Encapsulation
        //Polymorphism
        //Inheritance
        //Abstraction
        //Nesne tabanlı programlama büyük çaplı projelerde herkesin kendi sınıfını kullanarak
        //kendi özelliklerini geliştirdiği prensibleri ele alır.

        //Encapsulation:
        // 1) Encapsulation (Kapsülleme)
        // Değişkenleri private yapıp getter/setter ile kontrollü erişim sağlıyoruz.

        // 2) Inheritance (Kalıtım)
        // Bir sınıfın özelliklerini başka sınıfa aktarma

        // 3) Polymorphism (Çok Biçimlilik)
        // Aynı fonksiyon farklı şekillerde davranabilir.

        // 4) Abstraction (Soyutlama)
        // Ortak özellikleri soyut sınıfta toplarız, detayları alt sınıflar belirler
    }
}
