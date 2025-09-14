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

        //Kotlin'de veri tipleri ve değişkenler
        //var değeri variable anlamına gelir yani değişkendir.
        var x =10
        println(x)
        println(x * 20)
        //x değerini daha sonra değiştirebilirim.
        //Kodlar sıra ile çalıştığı için artık değerleri değiştikten sonraki hali ile kullanılıyor.
        x = 20
        print(x)
        println(x * 20)

        var y =10
        println(y)
        println(x + y)

        //val değeri ise value olarak gelir yani değer olarak kullanılır.
        //val değeri var dan ayıran özellik ise val değiştirilebmiyor daha sonra
        //fakat var değeri ise daha sonra değiştirilebiliyordu.

        val z =20
        // z =30 şeklinde yazılınca hata verir.
        println(z*50)
    }
}
