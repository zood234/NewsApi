package com.example.myapplication

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {
    @GET("data/2.5/weather?lat=35&lon=139&appid=2e65127e909e178d0af311a81f39948c")
    fun getCurrentWeatherData(): Call<WeatherResponse>
}