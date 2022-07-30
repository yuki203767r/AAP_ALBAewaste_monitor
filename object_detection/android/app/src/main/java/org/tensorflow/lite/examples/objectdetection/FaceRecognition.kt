package org.tensorflow.lite.examples.objectdetection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FaceRecognition : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_face_recognition)
    }

    fun skipTo(view: View) {
        // Do something in response to button click
        val skipTo = Intent(this, DisposeEwaste::class.java)
        startActivity(skipTo)
    }

    fun registeredUser(view: View) {
        // Do something in response to button click
        val registeredUser = Intent(this, Registered::class.java)
        startActivity(registeredUser)
    }

    fun notRegisteredUser(view: View) {
        // Do something in response to button click
        val notRegisteredUser = Intent(this, NotRegistered::class.java)
        startActivity(notRegisteredUser)
    }
}