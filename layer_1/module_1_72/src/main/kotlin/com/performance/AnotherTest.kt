package com.performance

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.performance.theme.MyApplicationTheme

@Preview(widthDp = 30)
@Composable
fun AnotherTest(name: String) {
    Text(text = "Hello $name!")
}

@Preview(widthDp = 30)
@Composable
fun AS() {
    MyApplicationTheme {
        Greeting("Android")
    }
}
