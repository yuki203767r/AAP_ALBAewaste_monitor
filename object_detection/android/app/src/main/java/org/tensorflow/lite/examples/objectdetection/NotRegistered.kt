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

    fun goNextPage(view: View) {
        // Do something in response to button click
        haveAccount = false
        val goNextPage = Intent(this, DisposeEwaste::class.java)
        startActivity(goNextPage)
    }

    companion object {
        var haveAccount = true
    }
}