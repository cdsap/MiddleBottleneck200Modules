package com.performance

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mylibrary91302.R
import com.performance.theme.MyApplicationTheme

@Preview(widthDp = 30)
@Composable
fun AnotherTest(name: String) {
    Text(text = "Hello $name!")
}

@Preview(widthDp = 30, name="asa")
@Composable
fun AS() {
    MyApplicationTheme {
        Greeting("${com.example.mylibrary91302.R.string.module_1_72_recent_tabs_header}")
    }
}

@Composable
@Preview(widthDp = 30, name="assssa")
fun WithConstraintsComposable() {
    BoxWithConstraints {
        Text("My minHeight is $minHeight while my maxWidth is $maxWidth")
        AS()
    }
}

