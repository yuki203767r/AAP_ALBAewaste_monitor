package org.tensorflow.lite.examples.objectdetection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class NotRegistered : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_not_registered)
    }

    fun goHome(view: View) {
        // Do something in response to button click
        val myNext = Intent(this, DisposeEwaste::class.java)
        startActivity(myNext)
    }
}