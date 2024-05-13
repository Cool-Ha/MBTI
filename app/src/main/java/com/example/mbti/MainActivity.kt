package com.example.mbti

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.example.mbti.ui.theme.MBTITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MBTITheme {
                MainScreen(string = "ISTJ")
                MainScreen(string = "ISFJ")
                MainScreen(string = "ISTP")
            }
        }
    }

    @Composable
    fun MainScreen(string: String) {
        val context = LocalContext.current
        Column {
            Button(onClick = {
                val intent = Intent(context, ISTJDESC::class.java)
                context.startActivity(intent)
            }) {
                Text(text = string)
            }
        }
    }
}
