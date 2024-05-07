package com.example.touristapplication

import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.touristapplication.ui.theme.TouristApplicationTheme

class TravelActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TouristApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box() {
                        Image(
                            painter = painterResource(id = R.drawable.statue),
                            contentDescription = "This ia a statue",
                            contentScale = ContentScale.FillBounds
                        )

                    }
                    TouristExperience()

                }

                }
            }
        }
}
@Composable
fun TouristExperience() {
    Card(colors = CardDefaults.cardColors(Color.Black),
        modifier = Modifier.padding(
            start = 10.dp,
            bottom = 0.dp,
            top = 550.dp,
            end = 10.dp
        )
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "travelezy",
                color = Color.White)

            Text(

                text = "Explore the world here",
                color = Color.White,

                )
            Text(
                text = "The best travel app in the world in 2021.Answer of traveller to find their journey",
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                colors = ButtonDefaults.buttonColors(Color.White)

            ) {
                Text(
                    text = "Create an account",
                    fontSize = 18.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(10.dp)
                )

            }

            Text(
                text = "Already have an account?",
                color = Color.White,
                modifier = Modifier.padding(5.dp)
            )
        }
    }
}

@Preview(showBackground = true,
showSystemUi = true,
name = "Preview")
@Composable
fun StatuePreview(){
    TouristApplicationTheme {
        image()
        TouristExperience()
    }


}

@Composable
fun image() {
    Box() {
        Image(
            painter = painterResource(id = R.drawable.statue),
            contentDescription = "This ia a statue",
            contentScale = ContentScale.FillBounds
        )

    }
}