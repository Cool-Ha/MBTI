package com.example.mbti

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mbti.ui.theme.MBTITheme

class INTJDESC : ComponentActivity() {

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
        Column (horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()) {
            Image(
                painter = painterResource(id = R.drawable.intj_image),
                contentDescription = null
            )
            Text(text = "INTJ")
            Text(text = "용의주도한 전략가")

            val activity = LocalContext.current as? Activity
            Button(onClick = {
//                val intent = Intent(context, SubActivity::class.java)
//                context.startActivity(intent)
                activity?.finish()
            }) {
                Text(text = "닫기")
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
}