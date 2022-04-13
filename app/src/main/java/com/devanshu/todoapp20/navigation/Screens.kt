package com.devanshu.todoapp20.navigation

import androidx.navigation.NavHostController
import com.devanshu.todoapp20.utils.Action
import com.devanshu.todoapp20.utils.Constants.LIST_SCREEN


class Screens(navController: NavHostController) {
    val list : (Action) -> Unit ={ action ->
        navController.navigate(route = "list/${action.name}"){
            popUpTo(LIST_SCREEN){inclusive = true}
        }
    }
    val task: (Int) -> Unit = { taskId ->
        navController.navigate(route = "task/$taskId")
    }
}