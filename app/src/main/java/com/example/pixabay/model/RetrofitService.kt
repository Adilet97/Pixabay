package com.example.pixabay.model


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {
    val retrofit = Retrofit.Builder().baseUrl("https://pixabay.com/").addConverterFactory(
        GsonConverterFactory.create()).build()

    fun getApi(): PixaApi{
        return retrofit.create(PixaApi::class.java)
    }
}