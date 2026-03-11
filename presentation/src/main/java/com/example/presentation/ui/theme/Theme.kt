package com.example.presentation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import com.example.presentation.ui.theme.backgroundDark


private val DarkColorScheme = darkColorScheme(
    primary = backgroundDark,
    secondary = mainTitleColorDark,
    tertiary = subTitleGrayColorDark,

    background = backgroundDark,
    surface = backgroundDark
)

private val LightColorScheme = lightColorScheme(
    primary = background,
    secondary = mainTitleColor,
    tertiary = subTitleGrayColor,

    background = background,
    surface = background,

    onBackground = mainTitleColor
)

@Composable
fun TeaCarpAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        content = content,
        //typography = Typography
    )

}