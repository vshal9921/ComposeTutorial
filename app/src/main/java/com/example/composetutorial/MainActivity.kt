package com.example.composetutorial

import android.os.Bundle
import android.widget.Toast
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarData
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorial.R
import com.example.composetutorial.ui.theme.ForgotPasswordStyle
import com.example.composetutorial.ui.theme.HeadingText
import com.example.composetutorial.ui.theme.LoginButton
import com.example.composetutorial.ui.theme.LoginButtonColor
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

    var content = LocalContext.current

    var emailText = remember {

        mutableStateOf("")
    }


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
            value = emailText.value
            , onValueChange = {string ->
                emailText.value = string
            }
            , modifier = Modifier.fillMaxWidth()
            , placeholder = {
                Text(text = "Enter email")
            }
            , textStyle = MaterialTheme.typography.LoginText
            , leadingIcon = {
                Icon(painter = painterResource(id =  R.drawable.ic_email) , contentDescription = "mail icon")
            }
            , trailingIcon = {
                Image(painter = painterResource(id = R.drawable.ic_right), contentDescription = "right icon")
            }
        )

        Spacer(modifier = Modifier.padding(20.dp))

        Text(
            text = "Password",
            style = MaterialTheme.typography.LoginText
        )

        Spacer(modifier = Modifier.padding(5.dp))

        OutlinedTextField(
            value = ""
            , onValueChange = {}
            , modifier = Modifier.fillMaxWidth()
            , placeholder = {
                Text(text = "Enter password")
            }
            , textStyle = MaterialTheme.typography.LoginText
        )

        Spacer(modifier = Modifier.padding(5.dp))

        Text(
            text = "Forgot password"
            , modifier = Modifier.align(Alignment.End)
            , style = MaterialTheme.typography.ForgotPasswordStyle
        )

        Spacer(modifier = Modifier.padding(5.dp))

        Button(
            onClick = {
                      Toast.makeText(content,"Button clicked", Toast.LENGTH_SHORT).show()
            }
            , modifier = Modifier.fillMaxWidth()
            , colors = ButtonDefaults.buttonColors(containerColor = LoginButtonColor)
            , shape = ButtonDefaults.shape
        ) {
            Text(
                text = "Sign in"
                , style = MaterialTheme.typography.LoginButton
            )
        }

    }
}
