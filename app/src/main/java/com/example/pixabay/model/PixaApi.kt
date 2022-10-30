package com.example.pixabay.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixaApi {

    @GET("api/")
    fun getImage(
        @Query("key") key: String = "27651969-3ac549123c952ab579a7bcc60",
        @Query("q") keyWord: String,
        @Query("page") page: Int = 1,
        @Query("per_page") perPage: Int = 5

    ): Call<PixaModel>
}