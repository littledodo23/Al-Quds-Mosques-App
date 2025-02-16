package com.example.user.algudsmosques

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_video.*

class video : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        var mediaController=MediaController(this)
        videoView.setVideoURI(Uri.parse("android.resource://"+packageName+"/"+R.raw.vvideo))
        videoView.setMediaController(mediaController)
        videoView.start()
    }
}
