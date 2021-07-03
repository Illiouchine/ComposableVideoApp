package com.illiouchine.video

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import com.illiouchine.video.ui.SimpleVideoPlayer
import com.illiouchine.video.ui.theme.VideoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VideoTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    SimpleVideoPlayer()
                    Button(onClick = {}){
                        Text("Click Me")
                    }
                }
            }
        }
    }
}