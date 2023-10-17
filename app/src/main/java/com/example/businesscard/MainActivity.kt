package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    val interRegular = FontFamily(
        Font(R.font.inter_regular)
    )

    val interBold = FontFamily(
        Font(R.font.inter_bold)
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(id = R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = "Android Logo",
            modifier = Modifier
                .height(120.dp)
                .width(150.dp)
        )
        Text(
            text = "Audy Febryanti",
            color = Color(0xFF0D0A2C),
            fontFamily = interBold,
            fontSize = 40.sp
        )
        Text(
            text = "Mahasiswi",
            color = Color(0xFF0D0A2C),
            fontFamily = interRegular,
            fontSize = 16.sp
        )
    }
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 50.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Bottom
    ) {
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color.White)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp)
        ) {
            val phone = painterResource(id = R.drawable.baseline_phone_24)
            Image(painter = phone, contentDescription = null, modifier = Modifier.padding(8.dp))
            Text(
                text = "+62 821 9102 9583",
                color = Color(0xFF5D6481),
                fontFamily = interRegular,
                fontSize = 16.sp,
                modifier = Modifier.padding(8.dp)
            )
        }
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color.White)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp)
        ) {
            val share = painterResource(id = R.drawable.baseline_account_circle_24)
            Image(painter = share, contentDescription = null, modifier = Modifier.padding(8.dp))
            Text(
                text = "@oddzcv",
                color = Color(0xFF5D6481),
                fontFamily = interRegular,
                fontSize = 16.sp,
                modifier = Modifier.padding(8.dp)
            )
        }
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color.White)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp)
        ) {
            val email = painterResource(id = R.drawable.baseline_alternate_email_24)
            Image(painter = email, contentDescription = null, modifier = Modifier.padding(8.dp))
            Text(
                text = "febryantia21@student.unhas.ac.id",
                color = Color(0xFF5D6481),
                fontFamily = interRegular,
                fontSize = 16.sp,
                modifier = Modifier. padding(8.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview(){
    BusinessCardTheme {
        BusinessCard()
    }
}



