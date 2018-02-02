package com.smile.modeldemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageLoader = ImageLoader.getInstance()
        imageLoader.setImageCache(DoubleCache())
        imageLoader.displayImage("http://pic4.nipic.com/20091217/3885730_124701000519_2.jpg", imageView)
    }

}
