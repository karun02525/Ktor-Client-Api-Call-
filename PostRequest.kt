package com.exa.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class PostRequest(
    val body:String,
    val title:Int,
    val userId:Int
)
