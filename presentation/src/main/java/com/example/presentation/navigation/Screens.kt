package com.example.presentation.navigation

import androidx.compose.ui.res.painterResource
import com.example.presentation.R

sealed class Screen(
    val route: String,
    val title: String,
    val iconId: Int
) {
    object Catalog : Screen (
        route = "Catalog",
        title = "Каталог",
        iconId = R.drawable.try_icon
    )

    object Notes : Screen (
        route = "Notes",
        title = "Заметки",
        iconId = R.drawable.try_icon
    )

    object Guide : Screen (
        route = "Guide",
        title = "Гайд",
        iconId = R.drawable.try_icon
    )

    object Profile : Screen (
        route = "Profile",
        title = "Профиль",
        iconId = R.drawable.try_icon
    )

    object TeaDetails : Screen (
        route = "TeaDetails/{teaId}",
        title = "Описание чая",
        iconId = R.drawable.try_icon
    ) {
        fun createById(teaId: String): String = "TeaDetails/$teaId"
    }

    object Settings : Screen (
        route = "Settings",
        title = "Настройки",
        iconId = R.drawable.try_icon
    )

    object Login : Screen (
        route = "Login",
        title = "Вход",
        iconId = R.drawable.try_icon
    )
}
