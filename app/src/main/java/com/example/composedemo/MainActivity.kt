package com.example.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
         Column(modifier = Modifier
             .background(Color.Green)
             .fillMaxHeight()
             .fillMaxWidth()
             .padding(10.dp)
             .border(
                 5.dp, Color.Red
             )
         ) {
             Text(text = "hello", modifier = Modifier
                 .padding(20.dp)
                 .clickable {
                     println("Clicking data")
                 })
             Spacer(modifier = Modifier.height(50.dp))
             Text(text = "world")
         }
        }
    }
}

//