package com.luu9798.catcomposeapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Breed (
    @SerializedName("adaptability")
    @Expose
    var adaptability: Int? = null,
    @SerializedName("affection_level")
    @Expose
    var affectionLevel: Int? = null,
    @SerializedName("alt_names")
    @Expose
    var altNames: String? = null,
    @SerializedName("cfa_url")
    @Expose
    var cfaUrl: String? = null,
    @SerializedName("child_friendly")
    @Expose
    var childFriendly: Int? = null,
    @SerializedName("country_code")
    @Expose
    var countryCode: String? = null,
    @SerializedName("country_codes")
    @Expose
    var countryCodes: String? = null,
    @SerializedName("description")
    @Expose
    var description: String? = null,
    @SerializedName("dog_friendly")
    @Expose
    var dogFriendly: Int? = null,
    @SerializedName("energy_level")
    @Expose
    var energyLevel: Int? = null,
    @SerializedName("experimental")
    @Expose
    var experimental: Int? = null,
    @SerializedName("grooming")
    @Expose
    var grooming: Int? = null,
    @SerializedName("hairless")
    @Expose
    var hairless: Int? = null,
    @SerializedName("health_issues")
    @Expose
    var healthIssues: Int? = null,
    @SerializedName("hypoallergenic")
    @Expose
    var hypoallergenic: Int? = null,
    @SerializedName("id")
    @Expose
    var id: String? = null,
    @SerializedName("indoor")
    @Expose
    var indoor: Int? = null,
    @SerializedName("intelligence")
    @Expose
    var intelligence: Int? = null,
    @SerializedName("lap")
    @Expose
    var lap: Int? = null,
    @SerializedName("life_span")
    @Expose
    var lifeSpan: String? = null,
    @SerializedName("name")
    @Expose
    var name: String? = null,
    @SerializedName("natural")
    @Expose
    var natural: Int? = null,
    @SerializedName("origin")
    @Expose
    var origin: String? = null,
    @SerializedName("rare")
    @Expose
    var rare: Int? = null,
    @SerializedName("reference_image_id")
    @Expose
    var referenceImageId: String? = null,
    @SerializedName("rex")
    @Expose
    var rex: Int? = null,
    @SerializedName("shedding_level")
    @Expose
    var sheddingLevel: Int? = null,
    @SerializedName("short_legs")
    @Expose
    var shortLegs: Int? = null,
    @SerializedName("social_needs")
    @Expose
    var socialNeeds: Int? = null,
    @SerializedName("stranger_friendly")
    @Expose
    var strangerFriendly: Int? = null,
    @SerializedName("suppressed_tail")
    @Expose
    var suppressedTail: Int? = null,
    @SerializedName("temperament")
    @Expose
    var temperament: String? = null,
    @SerializedName("vcahospitals_url")
    @Expose
    var vcahospitalsUrl: String? = null,
    @SerializedName("vetstreet_url")
    @Expose
    var vetstreetUrl: String? = null,
    @SerializedName("vocalisation")
    @Expose
    var vocalisation: Int? = null,
    @SerializedName("weight")
    @Expose
    var weight: Weight? = null,
    @SerializedName("wikipedia_url")
    @Expose
    var wikipediaUrl: String? = null
)