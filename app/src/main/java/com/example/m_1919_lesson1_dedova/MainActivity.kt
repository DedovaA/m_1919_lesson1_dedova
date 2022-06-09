package com.example.m_1919_lesson1_dedova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.m_1919_lesson1_dedova.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}