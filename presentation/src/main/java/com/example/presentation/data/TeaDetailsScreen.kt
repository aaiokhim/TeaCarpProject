package com.example.presentation.data

data class TeaType(
    val id: String,
    val title: String,
    val baseDescription: String,
    val brewing: String,
    val fastBrew: String,
    val fastBrewDescription: String,
    val longBrew: String,
    val longBrewDescription: String
    //val imageRes: Int? = null
)

val teaTypes = listOf(
    TeaType(
        "white",
        "Белый чай",
        "Описание",
        "рецепт",
        "проливы",
        "как заваривать проливами",
        "настаивание",
        "как заваривать настаиванием"
    ),
    TeaType(
        "green",
        "Зеленый чай",
        "Описание",
        "рецепт",
        "проливы",
        "как заваривать проливами",
        "настаивание",
        "как заваривать настаиванием"
        ),
    TeaType(
        "yellow",
        "Желтый чай",
        "Описание",
        "рецепт",
        "проливы",
        "как заваривать проливами",
        "настаивание",
        "как заваривать настаиванием"
        ),
    TeaType(
        "turquoise",
        "Бирюзовый чай",
        "Описание",
        "рецепт",
        "проливы",
        "как заваривать проливами",
        "настаивание",
        "как заваривать настаиванием"
    ),
    TeaType(
        "red",
        "Красный чай",
        "Описание",
        "рецепт",
        "проливы",
        "как заваривать проливами",
        "настаивание",
        "как заваривать настаиванием"
    ),
    TeaType(
        "black",
        "Черный чай",
        "Описание",
        "рецепт",
        "проливы",
        "как заваривать проливами",
        "настаивание",
        "как заваривать настаиванием"
    ),
)

