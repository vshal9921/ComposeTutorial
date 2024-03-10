package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorial.R
import com.example.composetutorial.ui.theme.HeadingText
import com.example.composetutorial.ui.theme.LoginText
import com.example.composetutorial.ui.theme.SubHeading

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            ShowText()
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewUi(){
    ShowText()
}


@Composable
fun ShowText(){

    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(20.dp)
    ){

        Image(painter = painterResource(id = R.drawable.login_image)
            , contentDescription = "login image"
            , modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.padding(5.dp))

        Text(
            text = "Getting Started",
            style = MaterialTheme.typography.HeadingText
        )

        Spacer(modifier = Modifier.padding(5.dp))

        Text(
            text = "Let’s login for explore continues",
            style = MaterialTheme.typography.SubHeading.copy(color= SubHeading)
        )

        Spacer(modifier = Modifier.padding(20.dp))

        Text(
            text = "Email or Phone Number",
            style = MaterialTheme.typography.LoginText
        )

        Spacer(modifier = Modifier.padding(5.dp))

        OutlinedTextField(
            value = ""
            , onValueChange = {}
            , placeholder = {
                Text(text = "Enter email")
            }
        )
    }
}
