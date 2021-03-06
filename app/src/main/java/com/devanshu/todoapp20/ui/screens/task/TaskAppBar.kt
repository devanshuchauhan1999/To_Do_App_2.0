package com.devanshu.todoapp20.ui.screens.task


import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.devanshu.todoapp20.R
import com.devanshu.todoapp20.ui.theme.topAppBarBackgroundColor
import com.devanshu.todoapp20.ui.theme.topAppBarContentColor
import com.devanshu.todoapp20.utils.Action

@Composable
fun TaskAppBar(
    navigateToListScreen : (Action) -> Unit
){
    NewTaskAppBar(navigateToListScreen = navigateToListScreen)
}

@Composable
fun NewTaskAppBar(
    navigateToListScreen : (Action) -> Unit
){
    TopAppBar(
        navigationIcon = {
            BackAction(onBackClicked = navigateToListScreen)             
        },
        title = {
            Text(
                text = stringResource(id = R.string.add_task),
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor,
        actions = {
            AddAction(onAddClicked = navigateToListScreen)
        }
           
    ) 
}

@Composable
fun BackAction(
    onBackClicked: (Action) -> Unit
){
    IconButton(onClick = { onBackClicked(Action.NO_ACTION) }) {
        Icon(
            imageVector = Icons.Filled.ArrowBack,
            contentDescription = stringResource(id = R.string.back_arrow),
            tint = MaterialTheme.colors.topAppBarContentColor
        )
    }
}

@Composable
fun AddAction(
    onAddClicked: (Action) -> Unit
){
    IconButton(onClick = { onAddClicked(Action.ADD) }) {
        Icon(
            imageVector = Icons.Filled.Check,
            contentDescription = stringResource(id = R.string.add_task),
            tint = MaterialTheme.colors.topAppBarContentColor
        )
    }
}

@Composable
@Preview
fun topTaskPreview(){
    NewTaskAppBar(navigateToListScreen = {})
}