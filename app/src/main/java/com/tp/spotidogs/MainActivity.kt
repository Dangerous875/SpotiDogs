package com.tp.spotidogs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.google.firebase.auth.FirebaseAuth
import com.tp.spotidogs.data.navigation.AuthenticationScreenRoute
import com.tp.spotidogs.data.navigation.FavoriteScreenRoute
import com.tp.spotidogs.data.navigation.FireStoreRoute
import com.tp.spotidogs.data.navigation.HomeScreenRoute
import com.tp.spotidogs.data.navigation.LoginScreenRoute
import com.tp.spotidogs.data.navigation.MainScreenRoute
import com.tp.spotidogs.data.navigation.RegisterScreenRoute
import com.tp.spotidogs.data.navigation.ZoomScreenRoute
import com.tp.spotidogs.ui.screens.authenticationScreen.AuthenticationScreen
import com.tp.spotidogs.ui.screens.favoriteScreen.FavoritesScreen
import com.tp.spotidogs.ui.screens.firestore.FireStoreScreen
import com.tp.spotidogs.ui.screens.homeScreen.HomeScreen
import com.tp.spotidogs.ui.screens.loginScreen.LoginScreen
import com.tp.spotidogs.ui.screens.mainDogsScreen.MainScreen
import com.tp.spotidogs.ui.screens.registerScreen.RegisterScreen
import com.tp.spotidogs.ui.screens.zoomScreen.ZoomScreen
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = LoginScreenRoute) {
                composable<AuthenticationScreenRoute> { AuthenticationScreen(navController = navController,auth) }
                composable<RegisterScreenRoute> { RegisterScreen(navController = navController,auth) }
                composable<LoginScreenRoute> { LoginScreen(navController = navController,auth) }
                composable<MainScreenRoute> { MainScreen(navController) }
                composable<HomeScreenRoute> { HomeScreen(navController,auth) }
                composable<ZoomScreenRoute> {
                    val safeArgs = it.toRoute<ZoomScreenRoute>()
                    ZoomScreen(safeArgs.urlImage,navController)
                }
                composable<FavoriteScreenRoute> { FavoritesScreen(navController) }
                composable<FireStoreRoute> { FireStoreScreen(navController) }
            }
            }
        }
    }

