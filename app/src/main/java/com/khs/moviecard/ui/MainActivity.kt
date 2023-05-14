package com.khs.moviecard.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.khs.common.theme.MovieCardAppTheme
import com.khs.moviecard.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieCardAppTheme {
                MainUI()
            }
        }
    }

    sealed class Screen(val route: String, @DrawableRes val drawable: Int) {
        object Home : Screen("home", R.drawable.ic_home)
        object Chart : Screen("chart", R.drawable.ic_movie)
        object Favorite : Screen("favorite", R.drawable.ic_favorite)
    }
}