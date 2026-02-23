package com.example.presentation.data

data class TeaType(
    val id: String,
    val title: String,
    val description: String,
    //val imageRes: Int? = null
)

val teaTypes = listOf(
    TeaType("white", "Белый чай", "Описание"),
    TeaType("green", "Зеленый чай", "Описание"),
    TeaType("yellow", "Желтый чай", "Описание"),
    TeaType("turquoise", "Бирюзовый чай", "Описание"),
    TeaType("red", "Красный чай", "Описание"),
    TeaType("black", "Черный чай", "Описание")
)

