package com.luu9798.catcomposeapp.network

import com.luu9798.catcomposeapp.model.Cat
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface CatApiRetrofitInterface {

    @GET("/v1/images/search?limit=30&mime_types=jpg")
    abstract fun getCat(
        @Header("X-Api-Key") apiKey: String
    ): Call<List<Cat>>
}