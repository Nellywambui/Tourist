package com.example.touristapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import com.example.touristapplication.ui.theme.TouristApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TouristApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(){
                        Image(painter = painterResource(id = R.drawable.hotel), contentDescription ="This is my hotel", contentScale = ContentScale.FillBounds )

                    }


                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Wanderly",)
                        Text(
                            text = "Your Ultimate Companion for Seamless Travel Experiences",
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(400.dp))
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier.fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors(Color.Green)

                        ) {
                            Text(
                                text = "Sign in with Phone Number",
                                fontSize = 18.sp,
                                color = Color.White,
                                modifier = Modifier.padding(10.dp)
                            )

                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier.fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors(Color.Green)

                        ) {
                            Text(
                                text = "Sign in with Apple",
                                fontSize = 18.sp,
                                color = Color.White,
                                modifier = Modifier.padding(10.dp)
                            )
                        }
                        Text(
                            text = "Don't have an account? Sign up"
                        )
                        Text(
                            text = "By Creating an account or signing in, you agree to our Terms of Service and Privacy Policy",
                            color = Color.White,
                            textAlign = TextAlign.Center)

                    }
                }
                Button(onClick = {
                    val intent = Intent(
                        this@MainActivity,TravelActivity::class.java
                    )
                    startActivity(intent)
                },
                    modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(Color.DarkGray)
                ) {
                    Text(
                        text = "Travel app",
                        fontSize = 10.sp,
                        color = Color.Green,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(10.dp)
                    )

                }
                }

            }
        }
    }


@Preview(showBackground = true,
    showSystemUi = true,
    name = "Preview")
@Composable
fun ProjectPreview(){
    TouristApplicationTheme {
        Background()
        TextComponent()

    }
}
@Composable
fun Background(){
Box(){
    Image(painter = painterResource(id = R.drawable.hotel), contentDescription ="This is my hotel", contentScale = ContentScale.FillBounds )

}

    }


@Composable
fun TextComponent() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Wanderly",
            color = Color.White
        )
        Text(
            text = "Your Ultimate Companion for Seamless Travel Experiences",
            textAlign = TextAlign.Center,
            color = Color.White

        )
        Spacer(modifier = Modifier.height(400.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Green)

        ) {
            Text(
                text = "Sign in with Phone Number",
                fontSize = 18.sp,
                color = Color.White,
                modifier = Modifier.padding(10.dp)
            )

        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Green)

        ) {
            Text(
                text = "Sign in with Apple",
                fontSize = 18.sp,
                color = Color.White,
                modifier = Modifier.padding(10.dp)
            )
        }

        Text(
            text = "Don't have an account? Sign up",
            color = Color.White
        )
        Text(
            text = "By Creating an account or signing in, you agree to our Terms of Service and Privacy Policy",
            color = Color.White,
            textAlign = TextAlign.Center
        )

    }

}


