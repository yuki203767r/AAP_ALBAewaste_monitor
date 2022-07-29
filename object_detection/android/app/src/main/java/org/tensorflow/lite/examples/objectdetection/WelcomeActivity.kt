package org.tensorflow.lite.examples.objectdetection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }

    fun beginEwaste(view: View) {
        // Do something in response to button click
        val beginTo = Intent(this, RemoveMask::class.java)
        startActivity(beginTo)
    }
}