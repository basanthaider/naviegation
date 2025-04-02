package com.example.naviegation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.naviegation.ui.screens.NavHostScreen
import com.example.naviegation.ui.theme.NaviegationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NaviegationTheme {
                NavHostScreen()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomePreview() {
    NaviegationTheme {
        NavHostScreen()
    }
}