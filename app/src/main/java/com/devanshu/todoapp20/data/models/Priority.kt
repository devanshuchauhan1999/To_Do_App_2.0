package com.devanshu.todoapp20.data.models


import androidx.compose.ui.graphics.Color
import com.devanshu.todoapp20.ui.theme.HighPriorityColor
import com.devanshu.todoapp20.ui.theme.LowPriorityColor
import com.devanshu.todoapp20.ui.theme.MediumPriorityColor
import com.devanshu.todoapp20.ui.theme.NonePriorityColor

enum class Priority(val color: Color){
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}
