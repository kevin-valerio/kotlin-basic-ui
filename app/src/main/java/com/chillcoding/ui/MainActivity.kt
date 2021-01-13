package com.chillcoding.ui

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import splitties.alertdialog.appcompat.*
import splitties.alertdialog.material.materialAlertDialog
import splitties.toast.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            sendEmail("macha@chillcoding.com", "Hi", "Hello!")
        }

        Log.i(MainActivity::class.java.simpleName, "Kotlin is an island")

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
         menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> share(R.string.text_share, R.string.title_share)
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun sendEmail(to: String, subject: String, msg: String) {
        val emailIntent = Intent(Intent.ACTION_SEND)

        emailIntent.data = Uri.parse("mailto:")
        emailIntent.type = "text/plain"
        emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(to))
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject)
        emailIntent.putExtra(Intent.EXTRA_TEXT, msg)

        try {
            startActivity(Intent.createChooser(emailIntent, getString(R.string.title_send_email)))
        } catch (ex: ActivityNotFoundException) {
            toast(R.string.text_no_email_client)
        }
    }

}