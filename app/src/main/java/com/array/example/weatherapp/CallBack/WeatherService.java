package com.array.example.weatherapp.CallBack;

import com.array.example.weatherapp.DbWeather.Weatherdb;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

public interface WeatherService {

    @GET("2.5/weather")
    Call<Weatherdb> getWeather(@Query("lat") double lat,
                               @Query("lon") double lon,
                               @Query("units") String units,
                               @Query("appid") String appid);

}
