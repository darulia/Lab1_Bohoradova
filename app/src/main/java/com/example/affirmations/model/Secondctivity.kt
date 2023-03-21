package com.example.affirmations.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.affirmations.R

class Secondctivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondctivity)




        data class MyDataClass(val text: String)

    }
}