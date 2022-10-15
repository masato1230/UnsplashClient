package com.example.unsplashclient.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AncestryX(
    val category: CategoryX,
    val subcategory: SubcategoryX,
    val type: TypeX
)