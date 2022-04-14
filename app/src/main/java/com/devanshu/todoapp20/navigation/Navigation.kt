package com.devanshu.todoapp20.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.devanshu.todoapp20.navigation.destinations.listComposable
import com.devanshu.todoapp20.navigation.destinations.taskComposable
import com.devanshu.todoapp20.ui.viewmodels.SharedViewModel
import com.devanshu.todoapp20.utils.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
){
    val screen= remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ){
       listComposable(
           navigateToTaskScreen = screen.task,
           sharedViewModel = sharedViewModel
       )
       taskComposable(
           navigateToListScreen = screen.list
       )
    }
}