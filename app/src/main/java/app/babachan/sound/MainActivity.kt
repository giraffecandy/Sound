package app.babachan.sound

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drumSound = MediaPlayer.create(this, R.raw.drum_sound)

        drumImage.setOnClickListener {
            drumSound.isPlaying
        }

        if (drumSound.isPlaying && drumImage.setOnClickListener{})

    }
}