package com.furkhangul.furoftheweak

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

// Bir sınıf oluşturuyoruz init bloğunu göstermek için
class Kullanici(val isim: String, val yas: Int) {
    init {
        // init bloğu constructor çağrıldıktan hemen sonra çalışır
        println("Kullanıcı oluşturuldu: $isim, Yaş: $yas")
    }
}

class MainActivity : AppCompatActivity() {
    val a = 20
    val b = 30

    // lateinit örneği → değişkeni hemen başlatmıyoruz, sonra dolduracağız
    lateinit var mesaj: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Nullable dönüşüm örneği
        val deger = "20"
        val degerint = deger.toInt()
        println(degerint * 2)

        val dene = "iki"
        val deneint = dene.toIntOrNull()

        if(deneint != null){
            println("Uygulama hatasız çalışmaktadır !")
        }

        // let ile null güvenliği sağlama
        val doubledegeri: Double? = null
        val girdi = doubledegeri?.toDoubleOrNull()

        girdi?.let {
            // eğer girdi null değilse burası çalışır
            println("Girdi değeri: ${it.div(2)}")
        } ?: println("girdi null olduğu için işlem yapılmadı")

        // lateinit örneği → değer sonradan atanıyor
        mesaj = "Merhaba Furkan!"
        println(mesaj)

        // init örneği için sınıftan nesne türetiyoruz
        val k = Kullanici("Furkan", 25)
    }
}
