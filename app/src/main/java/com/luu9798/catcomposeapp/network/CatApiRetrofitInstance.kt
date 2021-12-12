package com.luu9798.catcomposeapp.network

import com.luu9798.catcomposeapp.model.Cat
import retrofit2.Call
import retrofit2.Retrofit

class CatApiRetrofitInstance {

    private val retrofitInterface: CatApiRetrofitInterface

    init {
        retrofitInterface = createInterface(getInstance())
    }

    private fun getInstance(): Retrofit = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .build()

    private fun createInterface(retrofit: Retrofit): CatApiRetrofitInterface {
        return retrofit.create(CatApiRetrofitInterface::class.java)
    }

    fun getCat(apiKey: String): Call<List<Cat>> {
        return retrofitInterface.getCat(apiKey = apiKey)
    }

    companion object {
        private const val BASE_URL = "https://api.thecatapi.com/v1/"
    }
}