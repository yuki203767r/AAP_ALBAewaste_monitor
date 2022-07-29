package org.tensorflow.lite.examples.objectdetection

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_object_detected.*

class ObjectFound : AppCompatActivity() {
    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_detected)

        var resultsName = OverlayView.ewasteName
        var resultsScore = OverlayView.ewasteScore
        Log.d("hi", resultsName)
        if (resultsScore == "-") {
            objectDetected.text =
                "The item you have deposited is $resultsName. Please take out the item you have deposited."

            handler = Handler()

            handler.postDelayed(object : Runnable {
                override fun run() {


                    startActivity(
                        Intent(
                            this@ObjectFound,
                            NotWellDone::class.java
                        )
                    )

                    finish()


                }
            }, 5000)

        }
        else {
            objectDetected.text = "The E-waste you have deposited is a ${resultsName}with an accuracy score of $resultsScore."

            if (resultsName.contains("refrigerator")) {
                imageEwaste.setImageResource(R.drawable.refrigerator)
            }
            else if (resultsName.contains("vehicle battery")) {
                imageEwaste.setImageResource(R.drawable.vehicle_battery)
            }
            else if (resultsName.contains("aircon")) {
                imageEwaste.setImageResource(R.drawable.aircon)
            }
            else if (resultsName.contains("laptop")) {
                imageEwaste.setImageResource(R.drawable.laptop)
            }
            else if (resultsName.contains("monitor")) {
                imageEwaste.setImageResource(R.drawable.monitor)
            }
            else if (resultsName.contains("phone")) {
                imageEwaste.setImageResource(R.drawable.phone)
            }
            else if (resultsName.contains("washing machine")) {
                imageEwaste.setImageResource(R.drawable.washing_machine)
            }
            else if (resultsName.contains("dryer")) {
                imageEwaste.setImageResource(R.drawable.dryer)
            }
            else if (resultsName.contains("television")) {
                imageEwaste.setImageResource(R.drawable.television)
            }
            else if (resultsName.contains("pmd")) {
                imageEwaste.setImageResource(R.drawable.pmd)
            }
            else if (resultsName.contains("power assisted bicycle")) {
                imageEwaste.setImageResource(R.drawable.pab)
            }
            else if (resultsName.contains("powerbank")) {
                imageEwaste.setImageResource(R.drawable.powerbank)
            }
            else if (resultsName.contains("consumer lamp")) {
                imageEwaste.setImageResource(R.drawable.lamp)
            }
            else if (resultsName.contains("solar panel")) {
                imageEwaste.setImageResource(R.drawable.solar_panel)
            }
            else if (resultsName.contains("printer")) {
                imageEwaste.setImageResource(R.drawable.printer)
            }

            handler = Handler()

            handler.postDelayed(object : Runnable {
                override fun run() {


                    startActivity(
                        Intent(
                            this@ObjectFound,
                            WellDone::class.java
                        )
                    )

                    finish()


                }
            }, 5000)
        }

        }


    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
    }



}
