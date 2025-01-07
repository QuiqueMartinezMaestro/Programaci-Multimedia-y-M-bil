package com.quique.practica2

import android.app.Service
import android.content.Intent
import android.media.AudioManager
import android.media.MediaPlayer
import android.os.IBinder

class Musica : Service() {

    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var audioManager: AudioManager

    override fun onCreate() {
        super.onCreate()
        mediaPlayer = MediaPlayer.create(this, R.raw.greenday)
        mediaPlayer.isLooping = true

        audioManager = getSystemService(AUDIO_SERVICE) as AudioManager

        setVolumeToMax()

        mediaPlayer.start()
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onDestroy() {
        super.onDestroy()
        if (mediaPlayer.isPlaying) {
            mediaPlayer.stop()
        }
        mediaPlayer.release()
    }

    //Modifico el volumen porque se escucha muy bajo
    private fun setVolumeToMax() {
        val maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, maxVolume, 0)
    }

    private fun setVolume(volume: Int) {
        val maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
        val volumeLevel = (volume * maxVolume) / 100
        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, volumeLevel, 0)
    }
}

