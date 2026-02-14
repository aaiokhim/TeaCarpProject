package com.example.teacarpproject.ui.navigation

import androidx.compose.ui.res.painterResource
import com.example.teacarpproject.R

sealed class Screen( //не уверена, но возможно стоит вынести названия экранов в константы
    val route: String,
    val title: String,
    val iconId: Int
) { //сюда по идее еще иконку надо добавить)
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

    object Brewing : Screen (
        route = "Brewing",
        title = "Рецепты",
        iconId = R.drawable.try_icon
    )

    object TeaDetails : Screen (
        route = "TeaDetails/{teaId}",
        title = "Описание чая",
        iconId = R.drawable.try_icon
    ) {
        fun createId(teaId: String): String = "TeaDetails/$teaId"
    }
}
