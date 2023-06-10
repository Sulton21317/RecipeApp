package com.uzdev.recipe.data.model

data class ChefFullInfo(
    val name: String,
    val image: Int,
    val food: Food,
    val like: Int,
    val msgCount: Int,
    val timeAgo: String
)
