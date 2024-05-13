package com.example.mbti

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
            Image(
                painter = painterResource(id = R.drawable.isfj_image),
                contentDescription = null
            )
            Text(text = "ISFJ")
            Text(text = "용감한 수호자")
            Button(onClick = {
                finish()
            }) {
                Text(text = "닫기")
            }
        }
    }
}