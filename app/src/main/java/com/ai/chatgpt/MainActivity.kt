package com.ai.chatgpt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ai.chatgpt.screens.HomeScreen
import com.ai.chatgpt.ui.theme.ChatGPTTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            ChatGPTTheme {
                    MyChatGPTApp()
//            }
        }
    }
}

@Composable
fun MyChatGPTApp() {
    HomeScreen()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ChatGPTTheme {
    }
}