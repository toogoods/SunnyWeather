package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * @Author Wxg
 * @Date 2021/2/19 0019 20:16
 */
class SunnyWeatherApplication: Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        const val TOKEN = "token"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}