package com.example.ejercicio01

import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateIntSizeAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejercicio01.ui.theme.Ejercicio01Theme
import com.example.ejercicio01.ui.theme.Pink40
import com.example.ejercicio01.ui.theme.Pink80
import com.example.ejercicio01.ui.theme.Purple80
import com.example.ejercicio01.ui.theme.PurpleGrey40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (
            ){
                Box (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                        .background(Color.Cyan),
                    contentAlignment = Alignment.Center
                ){
                    Text(text = "Ejemplo 1")
                }
                Row {
                    Box (
                        modifier = Modifier
                            .width(200.dp)
                            .background(Color.Red)
                            .height(250.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Text(text = "Ejemplo 2")
                    }
                    Box (
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Green)
                            .height(250.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Text(text = "Ejemplo 3")
                    }
                }
                Box (
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .background(Color.Magenta),
                    contentAlignment = Alignment.BottomCenter
                ){
                    Text(text = "Ejemplo 4")
                }
            }
        }
    }
}
