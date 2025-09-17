//ANA DOSYA
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
        var spiderman = Hero()
        spiderman.names = "Kyle Earving"
        spiderman.age = "35"
        spiderman.job = "Engeener"
        spiderman.healty = "100"

    }
}
//EK DOSYA

package com.furkhangul.furoftheweak

//Class kavramını daha iyi kavramak adına yeni bi sınıf açıyoruz.

class Hero{
    var names=""
    var age= ""
    var healty=""
    var job=""

}
