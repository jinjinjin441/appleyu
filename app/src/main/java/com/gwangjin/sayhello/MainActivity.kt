package com.gwangjin.sayhello

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        takePicture.setOnClickListener{
            Log.d(TAG, "move to takePicture page")
            startActivity(Intent(this@MainActivity,Take_picture::class.java))
        }

        editPicture.setOnClickListener {
            Log.d(TAG, "move to editPicture page")
            startActivity((Intent(this@MainActivity,Edit_picture::class.java)))
        }

    }
}