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
        //Ansenkron Kodlama
        fun postItem(item: Item) {
            val token = preparePost()
            val post = submitPost(token, item)
            processPost(post)
        }

        fun preparePost(): Token {
            return token
        }
        fun postItem(item: Item) {
            preparePostAsync { token ->
                submitPostAsync(token, item) { post ->
                    processPost(post)
                }
            }
        }

        fun preparePostAsync(callback: (Token) -> Unit) {
        }
    }
}

