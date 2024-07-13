package com.example.tugas4android.api

import com.example.tugas4android.model.Superhero
import retrofit2.Call
import retrofit2.http.GET

interface SuperheroAPI {
    @GET("209")
    fun getSuperhero(): Call<Superhero>
}