package com.example.imageflipper2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pager = findViewById<ViewPager>(R.id.pager)

        var imgs = listOf<Int>(R.drawable.img1, R.drawable.img2, R.drawable.img3)
        var adapter = Adapter(imgs, this)
        pager.adapter = adapter
    }
}