package com.sunnyweather.android.logic.model

import android.location.Location
import com.google.gson.annotations.SerializedName

/**
 * @Author Wxg
 * @Date 2021/2/19 0019 20:19
 */

data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(val name: String, val location: Location,
        @SerializedName("formatted_address") val address: String)

data class Location(val lng: String, val lat: String)