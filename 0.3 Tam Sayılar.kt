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
        //variable atanırken aslında kotlin arka planda veri tipi atamakatadır.
        //Eğer otomatik bir şekilde atanmasını istemiyorsak biz bunları kendimiz atayabiliriz.
        //Veri tiplerinin oluşmasının asıl sebebi biz her zaman aynı tipte veri girmemekteyiz.
        //Bazen yazı fotmatında bazen sayı bazen de kesirler olarak işte bundan dolayı veri tipleri oluşmaktadır.
        //mesela x değerini int olarak algılar
        var x = 20
        //intager ise 4e ayrılıyor: byte, short, int, long olmak üzere

        //kendimiz atayacaksak bu değerleri
        var deger : Long = 200000000000
        println(deger)
        var deger1 : Short = 200
        println(deger1)
        var deger2 : Byte = 2
        println(deger2)



    }
}
