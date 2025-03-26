package com.example.musicplayerusingservicedemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MusicReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (context != null && intent != null) {
            val action = intent.action
            val serviceIntent = Intent(context, MusicService::class.java)

            when (action) {
                "PLAY" -> {
                    serviceIntent.action = "PLAY"
                    context.startService(serviceIntent)
                }
                "PAUSE" -> {
                    serviceIntent.action = "PAUSE"
                    context.startService(serviceIntent)
                }
            }
        }
    }
}
