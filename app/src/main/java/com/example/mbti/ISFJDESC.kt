package com.example.mbti

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mbti.ui.theme.MBTITheme

class ISFJDESC : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MBTITheme {
                MainScreen()
            }
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun JustPreview() {
        MBTITheme {
            MainScreen()
        }
    }

    @Composable
    fun MainScreen() {
        Column {
            Image(
                painter = painterResource(id = R.drawable.isfj_image),
                contentDescription = null
            )
            Text(text = "ISFJ")
            Text(text = "용감한 수호자")
        }
    }
}