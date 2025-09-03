package com.example.texteditorapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, EditorActivity::class.java))
            finish() // prevent returning to splash
        }, 2000)
    }

    private fun openEditor() {
        val intent = Intent(this, EditorActivity::class.java)
        startActivity(intent)
    }
}
