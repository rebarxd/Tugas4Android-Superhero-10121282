package com.example.tugas4android.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "https://www.superheroapi.com/api/8268811d1004a8e780a2d4d25046bdca/"

    val api: SuperheroAPI by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SuperheroAPI::class.java)
    }
}