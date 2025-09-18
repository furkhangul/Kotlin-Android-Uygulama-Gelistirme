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
        println("--------High Order Function----------")
        //Filter
        val listem = arrayListOf(1,3,5,7,9,11,13,15,17,19)

        val kucuksayilar = listem.filter { num -> num < 10 }
        for(numara in kucuksayilar){
            println(numara)
        //Map kullanımı

        val karesinial = listem.map { it * it}
        for(numara in karesinial){
            println(numara)
        }
        //Map & Filter
        val mapvefilter = listem.filter { it < 10 }.map { it * it }
        mapvefilter.forEach { println(it) }
        }
    }
}



