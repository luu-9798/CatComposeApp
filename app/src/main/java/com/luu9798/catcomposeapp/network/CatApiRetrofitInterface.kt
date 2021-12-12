package com.luu9798.catcomposeapp.network

import com.luu9798.catcomposeapp.model.Cat
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface CatApiRetrofitInterface {

    @GET("/images/search?limit=90&mime_types=jpg")
    abstract fun getCat(
        @Header("x-api-key") apiKey: String
    ): Call<List<Cat>>
}