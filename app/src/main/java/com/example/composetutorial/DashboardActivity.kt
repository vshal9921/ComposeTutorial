package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutorial.ui.theme.HeadingText
import com.example.composetutorial.ui.theme.SubHeading

class DashboardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            initUI()
        }
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun initUI(){

        LazyColumn (verticalArrangement = Arrangement.spacedBy(20.dp),
            modifier = Modifier.padding(start = 10.dp, end = 10.dp)){

            items(5){
                ItemCard()
            }
        }
    }

    @Preview(/*showBackground = true, showSystemUi = true*/)
    @Composable
    fun ItemCard(){

        Card(shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(8.dp),
            modifier = Modifier
                .fillMaxWidth()
        ) {

            Column(modifier = Modifier.background(Color.White)) {

                Image(painter = painterResource(id = R.drawable.biryani),
                    contentDescription = "recipe",
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillWidth
                )

                Spacer(modifier = Modifier.padding(5.dp))

                Text(text = "Biryani",
                    style = MaterialTheme.typography.HeadingText,
                    modifier = Modifier.padding(start = 10.dp)

                )

                Spacer(modifier = Modifier.padding(5.dp))

                Text(text = "North Indian",
                    style = MaterialTheme.typography.SubHeading,
                    modifier = Modifier.padding(start = 10.dp)
                )

                Spacer(modifier = Modifier.padding(5.dp))

                Text(text = "60 off on first order",
                    style = MaterialTheme.typography.SubHeading,
                    modifier = Modifier.padding(start = 10.dp)
                )

                Spacer(modifier = Modifier.padding(5.dp))

            }

        }
    }
}

