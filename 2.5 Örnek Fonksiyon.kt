//Yan Dosya
package com.furkhangul.furoftheweak


class Artist(var isim: String, var yas : Int, var enstruman : String){

    fun sarkiSoyle(){
        println("Şarkıyı Söyleyen Sanatçı: ${this.isim}")
    }
    // İLK ÇAĞIRILACAK FONSKİYON BU OLUYOR !
    init {
        println("İnit Çağırıldı !")
    }
}


//Ana Dosya
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
        val artist1 = Artist("Furkan", 20, "G" +
                "tar")
        println(artist1.isim)
        artist1.isim = "İsimsiz"
        artist1.sarkiSoyle()

        val artist2 = Artist("Zeynep", 20, "Bateri")
        artist2.sarkiSoyle()
    }
}
