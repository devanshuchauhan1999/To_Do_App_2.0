package com.devanshu.todoapp20.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val DarkGreen = Color(0xFF2d6a4f)
val MidGreen = Color(0xFF52b788)
val LightGreen = Color(0xFFb7e4c7)

val LowPriorityColor = Color(0xFF00C980)
val MediumPriorityColor = Color(0xFFFFC114)
val HighPriorityColor = Color(0xFFFF4646)
val NonePriorityColor = Color(0xFFEEE9E9)


val LightGray = Color(0xFFFCFCFC)
val MediumGray = Color(0xFF9C9C9C)
val DarkGray = Color(0xFF141414)

val Colors.topAppBarContentColor : Color
    @Composable
    get() = if (isLight) Color.White else LightGray

val Colors.topAppBarBackgroundColor : Color
    @Composable
    get() = if (isLight) MidGreen else DarkGreen


val Colors.fabBackgroundColor : Color
    @Composable
    get() = if (isLight) LightGreen else DarkGreen
