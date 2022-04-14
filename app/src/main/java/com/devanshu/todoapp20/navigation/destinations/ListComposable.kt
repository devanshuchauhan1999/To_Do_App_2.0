package com.devanshu.todoapp20.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.devanshu.todoapp20.navigation.Screens
import com.devanshu.todoapp20.ui.screens.list.ListScreen
import com.devanshu.todoapp20.ui.viewmodels.SharedViewModel
import com.devanshu.todoapp20.utils.Constants.LIST_ARGUMENT_KEY
import com.devanshu.todoapp20.utils.Constants.LIST_SCREEN

fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId: Int) -> Unit,
    sharedViewModel: SharedViewModel
){
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY){
            type = NavType.StringType
        })
    ){
        ListScreen(
            navigateToTaskScreen = navigateToTaskScreen,
            sharedViewModel = sharedViewModel
        )
    }
}