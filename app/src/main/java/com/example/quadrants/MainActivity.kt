package com.example.quadrants

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quadrants.ui.theme.QuadrantsTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    GreetingImage(
                        modifier = Modifier
                    )
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingImage(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFEADDFF))

            ){
                Column(verticalArrangement = Arrangement.Center,modifier = Modifier.fillMaxSize()){
                    Text(
                        text = "Text Composable",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(0.dp,0.dp,0.dp,6.dp)
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center,

                    )
                    Text(
                        text = "Displays text and follows the recommended Material Design guidelines.",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(16.dp,0.dp,16.dp,0.dp),
                        textAlign = TextAlign.Justify
                    )
                }
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFD0BCFF))
            ){
                Column(verticalArrangement = Arrangement.Center,modifier = Modifier.fillMaxSize()){
                    Text(
                        text = "Image composable",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(0.dp,0.dp,0.dp,6.dp)
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center,

                        )
                    Text(
                        text = "Creates a composable that lays out and draws a given Painter class object.",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(16.dp,0.dp,16.dp,0.dp),
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }
        Row(modifier = Modifier.weight(1f)) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFB69DF8))
            ){
                Column(verticalArrangement = Arrangement.Center,modifier = Modifier.fillMaxSize()){
                    Text(
                        text = "Row composable",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(0.dp,0.dp,0.dp,6.dp)
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center,

                        )
                    Text(
                        text = "A layout composable that places its children in a horizontal sequence.",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(16.dp,0.dp,16.dp,0.dp),
                        textAlign = TextAlign.Justify
                    )
                }
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFF6EDFF))
            ){
                Column(verticalArrangement = Arrangement.Center,modifier = Modifier.fillMaxSize()){
                    Text(
                        text = "Column composable",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(0.dp,0.dp,0.dp,6.dp)
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center,

                        )
                    Text(
                        text = "A layout composable that places its children in a vertical sequence.",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(16.dp,0.dp,16.dp,0.dp),
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}