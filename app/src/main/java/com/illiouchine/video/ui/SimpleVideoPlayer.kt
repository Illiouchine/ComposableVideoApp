package com.illiouchine.video.ui

import android.net.Uri
import android.widget.VideoView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.illiouchine.video.R

@Composable
fun SimpleVideoPlayer() {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = {
            VideoView(it).apply {
                // apply onClickListener here
                setVideoURI(
                    Uri.parse("android.resource://" + context.packageName +"/"+ R.raw.brossage_dents_1920_1088)
                )
                setOnPreparedListener { mediaPlayer ->
                    mediaPlayer.isLooping = true
                }
                start()
            }
        },
        update = { view ->

        }
    )
}