package com.example.unsplashclient.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AncestryXX(
    val category: CategoryXX,
    val subcategory: SubcategoryXX,
    val type: TypeXX
)