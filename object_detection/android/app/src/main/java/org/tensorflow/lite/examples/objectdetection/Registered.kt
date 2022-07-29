package org.tensorflow.lite.examples.objectdetection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Registered : AppCompatActivity() {
    private lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registered)
        handler = Handler()

        handler.postDelayed(object : Runnable {
            override fun run() {


                startActivity(
                    Intent(
                        this@Registered,
                        DisposeEwaste::class.java
                    )
                )

                finish()


            }
        }, 5000)
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
    }

}