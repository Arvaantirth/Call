package com.example.call

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
    }


fun call(view: View) {
    val dialIntent = Intent(Intent.ACTION_DIAL)
    dialIntent.data = Uri.parse("tel:" + "7621865079")
    startActivity(dialIntent)
}
}
