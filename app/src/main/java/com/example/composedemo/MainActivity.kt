package com.example.composedemo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val color = remember {
               mutableStateOf(Color.Yellow)
            }
            Column() {

                colorBox(modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()){
                    color.value = it
                }

                Box(modifier = Modifier.background(color.value)
                    .weight(1f).fillMaxSize()
                )
            }

        }
    }
}

@SuppressLint("UnrememberedMutableState", "ComposableNaming")
@Composable
fun colorBox(modifier: Modifier,
             updateColor : (Color)->Unit){
    Box(modifier = modifier
        .background(Color.Red)
        .clickable {
            updateColor(Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                1f
            ))
        }
    )
}