package com.example.mybooks.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mybooks.screens.FavScreen
import com.example.mybooks.screens.NewBooksScreen
import com.example.mybooks.viewmodel.AddBookViewModel

@Composable
fun BookNavigation(navController: NavController = rememberNavController()){

   val navController = rememberNavController() // navcontroller von typ rememberNavcontroller

    val bookViewModel: AddBookViewModel = viewModel() //?

    NavHost(navController = navController, startDestination = BookScreeens.FavScreen.name)
    {
        composable(BookScreeens.FavScreen.name ){
            FavScreen(navController= navController, viewModel= bookViewModel)
        }

        composable(BookScreeens.NewBooksScreen.name) {
            NewBooksScreen(navController=navController, viewModel= bookViewModel)
        }

        // build a route like: root/detail-screen/id=34
    }
}