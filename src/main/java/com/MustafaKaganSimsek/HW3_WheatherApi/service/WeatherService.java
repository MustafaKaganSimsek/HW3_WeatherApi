package com.MustafaKaganSimsek.HW3_WheatherApi.service;

import com.MustafaKaganSimsek.HW3_WheatherApi.dto.WeatherDto;


public interface WeatherService {
    //input String output WeatherDto
    WeatherDto getCurrentDayWeather(String location);

    //input String output WeatherDto
    WeatherDto getNextWeekWeather(String location);

    //input String output WeatherDto
    WeatherDto getNextMonthWeather(String location);
}
