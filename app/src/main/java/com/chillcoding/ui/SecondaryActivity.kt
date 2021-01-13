package com.chillcoding.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class SecondaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
        findViewById<TextView>(R.id.receivedIntentParamLabel).text =
            "Your id is " + intent.getStringExtra("id")

    }
}