package com.luu9798.catcomposeapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Cat (
    @SerializedName("breeds")
    @Expose
    var breeds: List<Breed>? = null,
    @SerializedName("categories")
    @Expose
    var categories: List<Category>? = null,
    @SerializedName("height")
    @Expose
    var height: Int? = null,
    @SerializedName("id")
    @Expose
    var id: String? = null,
    @SerializedName("url")
    @Expose
    var url: String? = null,
    @SerializedName("width")
    @Expose
    var width: Int? = null,
    @SerializedName("breed_ids")
    @Expose
    var breedIds: Any? = null,
    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null,
    @SerializedName("original_filename")
    @Expose
    var originalFilename: String? = null,
    @SerializedName("sub_id")
    @Expose
    var subId: String? = null
)
