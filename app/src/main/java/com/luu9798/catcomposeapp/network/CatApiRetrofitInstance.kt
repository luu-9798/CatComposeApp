package com.luu9798.catcomposeapp.network

import com.luu9798.catcomposeapp.model.Cat
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CatApiRetrofitInstance {

    private val retrofitInterface: CatApiRetrofitInterface

    init {
        retrofitInterface = createInterface(getInstance())
    }

    private fun getInstance(): Retrofit {
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.HEADERS)
        val client = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }

    private fun createInterface(retrofit: Retrofit): CatApiRetrofitInterface {
        return retrofit.create(CatApiRetrofitInterface::class.java)
    }

    fun getCat(apiKey: String): Call<List<Cat>> {
        return retrofitInterface.getCat(apiKey = apiKey)
    }

    companion object {
        private const val BASE_URL = "https://api.thecatapi.com/"
    }
}