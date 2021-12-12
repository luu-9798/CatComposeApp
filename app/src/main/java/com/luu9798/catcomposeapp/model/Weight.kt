package com.luu9798.catcomposeapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Weight (
    @SerializedName("imperial")
    @Expose
    var imperial: String? = null,
    @SerializedName("metric")
    @Expose
    var metric: String? = null
)