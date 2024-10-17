package com.example.basiccomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiccomposable.ui.theme.BasicComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicComposableTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicCompose(
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Login",
            style = TextStyle(
                fontSize = 50.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black,
            ),
        )
        Text(
            text = "Ini adalah halaman login",
            style = TextStyle(
                fontSize = 25.sp
            )
        )

        Image(painterResource ( id = R.drawable.umy),
            contentDescription = null,
            modifier = Modifier
                .size(250.dp)
                .padding(40.dp)
        )

        Text(
            text = "Nama",
            style = TextStyle(
                fontSize = 25.sp
            )
        )

        Text(
            text = "Muhammad Dhafa",
            style = TextStyle(
                fontSize = 25.sp,
                color = Color.Red
            )
        )
        Text(
            text = "20220140064",
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
        )
        Image(painter = painterResource(id = R.drawable.dhafa),
            contentDescription = null,
            modifier = Modifier
                .clip(RoundedCornerShape(200.dp))
        )

    }
}
