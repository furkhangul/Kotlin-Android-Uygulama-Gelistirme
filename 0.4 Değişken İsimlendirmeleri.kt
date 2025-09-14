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
        //Değişken isimleri anlamlı olması gerekmektedir.
        //İsmi uzun tutmamamız lazım.
        //alt tire gibi ifadelerin kullanılması daha sağlıklıdır.
        //kullanicininyasi, kullaninici_yasi, kullanıcınınYasi 3 farklı veridir.
        //snake_case
        //camelCase
        //kullanicininSoyismiVeYasi
        //kullanicinin_yasi_ve_soyismi
        val m = 20
        val n = 30
        val toplam_sonuc = m + n
        print(toplam_sonuc)



    }
}
