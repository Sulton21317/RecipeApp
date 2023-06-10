package com.uzdev.recipe.data.model


data class User(

    val name: String,
    val image: Int,
    val food: Food?,
    val like: Int,
    val msg: String,
    val msgCount: Int,
    val timeAgo: String,
    val isChef: Boolean
)

