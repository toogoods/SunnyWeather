package com.sunnyweather.android.logic.model

/**
 * @Author Wxg
 * @Date 2021/2/22 0022 21:15
 */
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)