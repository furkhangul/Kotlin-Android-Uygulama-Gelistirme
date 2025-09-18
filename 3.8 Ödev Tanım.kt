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
        //Ödev Koşulları
        //Çalışanlar sınıfı oluşturulacak
        //Çalışan isim, maaş, departmant, yaş bilgileri olacak
        //10 örnek çalışan olacak bir listede tutulacak
        //Okunabilir çalışan ismi olacak
        //maas bilgileri okunamayacak yalnızca fonksiyon ile gösterilecek
        //Main activity içerisinde  -> 30 yaşıdnan büyük olanaların departmanlarınını listele
        //Aynı şekilde 25ten küçüklerin ise sadece ismi tutulan lite olacak
    }
}

