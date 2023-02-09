package com.MustafaKaganSimsek.HW3_WheatherApi.service.impl;

import com.MustafaKaganSimsek.HW3_WheatherApi.dto.WeatherDto;
import com.MustafaKaganSimsek.HW3_WheatherApi.service.ApiTransferComponent;
import com.MustafaKaganSimsek.HW3_WheatherApi.service.WeatherService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class WeatherServiceImpl implements WeatherService {

    private final ApiTransferComponent apiTransferComponent;

    @Override
    public WeatherDto getCurrentDayWeather(String location){
        return apiTransferComponent.getCurrentDayWeatherFromApi(location);
    }

    @Override
    public WeatherDto getNextWeekWeather(String location){
        return apiTransferComponent.getDailyWeatherFromApi(location,7);
    }

    @Override
    public WeatherDto getNextMonthWeather(String location){
        return apiTransferComponent.getDailyWeatherFromApi(location,30);
    }
}
