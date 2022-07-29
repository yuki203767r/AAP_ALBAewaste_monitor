package org.tensorflow.lite.examples.objectdetection

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class NotWellDone: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_not_well_done)

        var mp=MediaPlayer()
        mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.beepbeep))
        mp.prepare()
        mp.start()
    }
}