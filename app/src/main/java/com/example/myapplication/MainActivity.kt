package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btteste.setOnClickListener{ openUrl() }
    }

    private fun openUrl(){
        val uri = Uri.parse("https://www.google.com/search?q=gif+larry&safe=active&sxsrf=ALeKk03bAXzoXPYfiphm4dLClKdNz-LVng:1620919402094&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiT6q6p-8bwAhV4HrkGHZOZAd4Q_AUoAXoECAIQAw&biw=1366&bih=625#imgrc=1qtbhJvNkV2GvM")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }
}