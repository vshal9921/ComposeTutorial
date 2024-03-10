package com.example.composetutorial.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.composetutorial.R

// Set of Material typography styles to start with
val Typography = Typography(
        bodyLarge = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.5.sp
        )
        /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

val Typography.HeadingText: TextStyle
        @Composable get() {
                return TextStyle(
                        color = Color.Black,
                        fontSize = 24.sp,
                        fontFamily = FontFamily(Font(R.font.roboto_regular, weight = FontWeight.Bold))
                )
        }

val Typography.SubHeading: TextStyle
        @Composable get() {
                return TextStyle(
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.roboto_regular, weight = FontWeight.Medium)),
                        color = com.example.composetutorial.ui.theme.SubHeading
                )
        }

val Typography.LoginText: TextStyle
        @Composable get() {
                return TextStyle(
                        fontSize = 13.sp,
                        fontFamily = FontFamily(Font(R.font.roboto_regular, weight = FontWeight.Medium)),
                        color = Color.Black
                )
        }

val Typography.ForgotPasswordStyle : TextStyle
        @Composable get() {
                return TextStyle(
                        fontSize = 12.sp,
                        color = ForgotColor,
                        fontFamily = FontFamily(Font(R.font.roboto_regular, weight = FontWeight.Medium))
                )
        }

val kotlin.text.Typography.LoginButton: TextStyle
        @Composable get(){
                return TextStyle(
                        fontFamily = FontFamily(Font(R.font.roboto_regular, weight = FontWeight.Bold))
                        , color = Color.Black
                        , fontSize = 14.sp
                )
        }