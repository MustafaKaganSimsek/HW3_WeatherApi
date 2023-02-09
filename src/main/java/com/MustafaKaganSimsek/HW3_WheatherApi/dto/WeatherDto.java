package com.MustafaKaganSimsek.HW3_WheatherApi.dto;

import lombok.Data;

import java.util.ArrayList;

@Data
public class WeatherDto {
    private int queryCost;
    private float latitude;
    private float longitude;
    private String resolvedAddress;
    private String address;
    private String timezone;
    private float tzoffset;
    private ArrayList<DailyForecastDto> days;

}
