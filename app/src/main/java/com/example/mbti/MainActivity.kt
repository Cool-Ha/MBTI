package com.example.mbti

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.mbti.ui.theme.MBTITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MBTITheme {
                MainScreen()
            }
        }
    }

    @Composable
    fun MainScreen() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth().fillMaxHeight()
        ) {
            MbtiButton(ISTJDESC::class.java, "ISTJ")
            MbtiButton(ISFJDESC::class.java, "ISFJ")
            MbtiButton(INTJDESC::class.java, "INTJ")

//            val context = LocalContext.current
//            Button(onClick = {
//                val intent = Intent(context, ISTJDESC::class.java)
//                context.startActivity(intent)
//            }) {
//                Text(text = "ISTJ")
//            }
//            Button(onClick = {
//                val intent = Intent(context, ISFJDESC::class.java)
//                context.startActivity(intent)
//            }) {
//                Text(text = "ISFJ")
//            }
//
//            Button(onClick = {
//                val intent = Intent(context, INTJDESC::class.java)
//                context.startActivity(intent)
//            }) {
//                Text(text = "INTJ")
//            }
        }
    }

    @Composable
    private fun MbtiButton(
        java: Class<*>,
        text: String
    ) {
        val context = LocalContext.current
        Button(onClick = {
            val intent = Intent(context, java)
            intent.putExtra("seungsu", 132)
            intent.putExtra("ai", "this is ai")
            intent.putExtra("intel", text)
            context.startActivity(intent)
        }) {
            Text(text = text)
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun JustPreview() {
        MBTITheme {
            MainScreen()
        }
    }
}