package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @Author Wxg
 * @Date 2021/2/22 0022 21:01
 */
data class RealtimeResponse(val status: String, val result: Result) {
    data class Result(val realtime: Realtime)
    data class Realtime(val temperature: Float, val skycon: String,
                        @SerializedName("air_quality") val airQuality: AirQuality)

    data class AirQuality(val aqi: AQI)
    data class AQI(val chn: String)
}