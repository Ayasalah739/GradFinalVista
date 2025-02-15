package com.example.vistacuregrad.model

import com.google.gson.annotations.SerializedName

data class LoginRequest(
    @SerializedName("Username") val username: String,
    @SerializedName("Password") val password: String
)

data class LoginResponse(
    @SerializedName("status")
    val status: String,
    @SerializedName("message")
    val message: String,
    @SerializedName("token")
    val token: String? // Assuming the API returns a token upon successful login
)
