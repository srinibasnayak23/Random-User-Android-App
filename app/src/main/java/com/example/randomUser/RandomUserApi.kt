package com.example.randomUser

import retrofit2.http.GET

interface RandomUserApi {
    @GET("api")
    suspend fun getRandomUser(): RandomUserResponse
}
