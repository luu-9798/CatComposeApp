package com.luu9798.catcomposeapp

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.luu9798.catcomposeapp.model.Cat
import com.luu9798.catcomposeapp.network.CatApiRetrofitInstance
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {
    var catListResponse:List<Cat> by mutableStateOf(listOf())

    private val catRetrofitInstance = CatApiRetrofitInstance()
    private val catLiveData = MutableLiveData<List<Cat>>()

    fun getCatList(apiKey: String) {
        viewModelScope.launch {
            catRetrofitInstance.getCat(apiKey).enqueue(object : Callback<List<Cat>> {
                override fun onResponse(call: Call<List<Cat>>, response: Response<List<Cat>>) {
                    Log.d("TAG_X", "pass")
                    catLiveData.value = response.body()
                }

                override fun onFailure(call: Call<List<Cat>>, t: Throwable) {
                    Log.d("TAB_X", "fail")
                }
            })
        }
    }
}