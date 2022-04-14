package com.devanshu.todoapp20.ui.screens.list

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.devanshu.todoapp20.R
import com.devanshu.todoapp20.data.models.Priority
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.devanshu.todoapp20.components.PriorityItem
import com.devanshu.todoapp20.ui.theme.*

@Composable
fun ListAppBar(){
    DefaultListAppBar(
        onSearchClicked = {},
        onSortClicked = {},
        onDeleteClicked = {}
    )
}

@Composable
fun DefaultListAppBar(
    onSearchClicked: () -> Unit,
    onSortClicked :(Priority) -> Unit,
    onDeleteClicked: () -> Unit
){
    TopAppBar(
        title = {
            Text(
                text = "Tasks",
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        actions ={
            ListAppBarActions(
                onSearchClicked = onSearchClicked,
                onSortClicked = onSortClicked,
                onDeleteClicked = onDeleteClicked
            )
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor
    )
}

@Composable
fun ListAppBarActions(
    onSearchClicked: () -> Unit,
    onSortClicked :(Priority) -> Unit,
    onDeleteClicked: () -> Unit

){
    SearchAction(onSearchClicked = onSearchClicked)
    SortAction(onSortClicked = onSortClicked)
    DeleteAllAction(onDeleteClicked = onDeleteClicked)
}

@Composable
fun SearchAction(
    onSearchClicked: () -> Unit
){
    IconButton(onClick = {onSearchClicked}) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = stringResource(id = R.string.search_desc),
            tint = MaterialTheme.colors.topAppBarContentColor
        )
    }
}

@Composable
fun SortAction(
    onSortClicked :(Priority) -> Unit
){
    var expanded by remember { mutableStateOf(false)}

    IconButton(onClick = { expanded=true }) {
        Icon(
            painter = painterResource(id = R.drawable.ic_filter_list),
            contentDescription = stringResource(id = R.string.sort_desc),
            tint = MaterialTheme.colors.topAppBarContentColor
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false}
        ) {
            // For Low Item
            DropdownMenuItem(
                onClick = {
                    expanded =false
                    onSortClicked(Priority.LOW)
                }
            ) {
                PriorityItem(priority = Priority.LOW)
            }

            //For High Item
            DropdownMenuItem(
                onClick = {
                    expanded =false
                    onSortClicked(Priority.HIGH)
                }
            ) {
                PriorityItem(priority = Priority.HIGH)
            }
            // For None Item
            DropdownMenuItem(
                onClick = {
                    expanded =false
                    onSortClicked(Priority.NONE)
                }
            ) {
                PriorityItem(priority = Priority.NONE)
            }
        }
    }
}

@Composable
fun DeleteAllAction(
    onDeleteClicked: () -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    IconButton(onClick = { expanded = true }) {
        Icon(
            painter = painterResource(id = R.drawable.ic_more_vert),
            contentDescription = stringResource(id = R.string.delete_all_action),
            tint = MaterialTheme.colors.topAppBarContentColor
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            DropdownMenuItem(
                onClick = {
                    expanded =false
                    onDeleteClicked()

                }) {
                Text(
                    modifier = Modifier.padding(start = MEDIUM_PADDING),
                    text = stringResource(id = R.string.delete_all_action),
                    style = Typography.subtitle2,
                )

            }
        }
    }
}
@Composable
@Preview
private fun DefaultListAppBarPreview(){
    DefaultListAppBar(
        onSearchClicked = {},
        onSortClicked = {},
        onDeleteClicked = {}
    )

}