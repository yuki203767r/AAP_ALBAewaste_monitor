package org.tensorflow.lite.examples.objectdetection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_registered.*

class Registered : AppCompatActivity() {
    private lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registered)

        val person = intent.getStringExtra("person")
        val score =
        String.format("%.2f", intent.getStringExtra("score")!!.toDouble() * 100)
        hello.text = "hello this is $score%  $person"
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
        }, 10000)
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
    }

}