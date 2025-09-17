package com.furkhangul.furoftheweak

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val a = 20
    val b = 30

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Nulability
        //Biz daha önce verilerin veri tiplerini değiştirmeyi gördük
        val deger = "20"
        val degerint = deger.toInt()
        println(degerint * 2)
        //Fakat eğer yanlış dönüşüm yapılıyorsa yani string değerini int e çeviremye
        //çalışıldığı zaman hata ile karşılaşıyoruz. Bunun için özel hata değerlemndirmeleri vardır.
        val dene = "iki"
        //Burada int yap ya da nulldeğerini çevir demek istemekteyiz.
        val deneint = dene.toIntOrNull()

        if(deneint != null){
            println("Uygulama hatasız çalışmaktadır !")
        }
        //Şeklinde ifade ediliyorsa burada nullable olup olmadığını da kontrol etmektedir
        //Eğer nullable ise null çevir demektedir.
        val doubledegeri : Double? = null
        val girdi = doubledegeri.toDoubleOrNull()
        //Bu şekilde yazılınca hata veriyor
        //doubledegeri.div(2)
        girdi!!.div(2)


    }
}
