package app.babachan.sound

import android.media.MediaPlayer
import android.os.Bundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drumSound = MediaPlayer.create(this, R.raw.drum_sound)
        val guitarSound = MediaPlayer.create(this, R.raw.guitar_sound)
        val pianoSound = MediaPlayer.create(this, R.raw.piano_sound)

        drumImage.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                drumSound.seekTo(0)
                drumSound.start()
                drumImage.setImageResource(R.drawable.drum_playing_image)
            } else if (event.action == MotionEvent.ACTION_UP) {
                drumImage.setImageResource(R.drawable.drum_image)
            }
            true
        }

        guitarImage.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                guitarSound.seekTo(0)
                guitarSound.start()
                guitarImage.setImageResource(R.drawable.guitar_playing_image)
            } else if (event.action == MotionEvent.ACTION_UP) {
                guitarImage.setImageResource(R.drawable.guitar_image)
            }
            true
        }

        pianoImage.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                pianoSound.seekTo(0)
                pianoSound.start()
                pianoImage.setImageResource(R.drawable.piano_playing_image)
            } else if (event.action == MotionEvent.ACTION_UP) {
                pianoImage.setImageResource(R.drawable.piano_image)
            }
            true
        }

    }
}