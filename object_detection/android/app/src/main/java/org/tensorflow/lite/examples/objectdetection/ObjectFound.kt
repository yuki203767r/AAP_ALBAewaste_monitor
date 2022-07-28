package org.tensorflow.lite.examples.objectdetection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_object_detected.*

class ObjectFound : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_detected)

//        var resultsFromMain = intent.getStringExtra("results")
        var results = ObjectDetectorHelper.objectFound
        objectDetected.text = "The E-waste you have deposited is $results"
    }
}
