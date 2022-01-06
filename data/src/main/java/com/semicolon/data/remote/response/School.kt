package com.semicolon.data.remote.response

import com.google.gson.annotations.SerializedName

//check school
data class School(
    @SerializedName("agency_code") val agencyCode: String,
    @SerializedName("logo_image_url") val logoImageUrl: String,
    @SerializedName("name") val name: String,
    @SerializedName("walk_count") val walkCount: Int
)