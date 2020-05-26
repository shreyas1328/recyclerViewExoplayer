package com.shreyas.viewpager2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shreyas.viewpager2.cwm.CWMAcivity
import com.shreyas.viewpager2.viewpager_image.ImageViewPager
import com.shreyas.viewpager2.viewpager_video.VideoViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv_image.setOnClickListener {
            startActivity(Intent(this, ImageViewPager::class.java))
        }

        iv_video.setOnClickListener {
            startActivity(Intent(this, VideoViewPager::class.java))
        }

        iv_cwm.setOnClickListener {
            startActivity(Intent(this, CWMAcivity::class.java))
        }
    }
}
