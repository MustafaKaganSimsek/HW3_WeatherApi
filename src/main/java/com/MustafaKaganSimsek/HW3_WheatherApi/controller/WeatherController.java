package com.MustafaKaganSimsek.HW3_WheatherApi.controller;

import com.MustafaKaganSimsek.HW3_WheatherApi.dto.WeatherDto;
import com.MustafaKaganSimsek.HW3_WheatherApi.service.WeatherService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Pattern;
import java.util.Map;

@RequestMapping("api/weather")
@RestController
@AllArgsConstructor
@Validated
public class WeatherController {
    private final WeatherService weatherService;

    //today's weather data
    @GetMapping("/today/{location}")
    public ResponseEntity<WeatherDto> getTodayWeatherData(@PathVariable
                                                                        @Pattern(regexp = "^[a-zA-Z][a-zA-Z\\s-]+[a-zA-Z]$",
                                                                                message = "Invalid location found. Please check your location parameter")
                                                                        String location) {
        return ResponseEntity.ok(weatherService.getCurrentDayWeather(location));
    }
    //weather data for the next 7 days
    @GetMapping("/week/{location}")
    public ResponseEntity<WeatherDto> getWeeklyWeatherDatas(@PathVariable
                                                                        @Pattern(regexp = "^[a-zA-Z][a-zA-Z\\s-]+[a-zA-Z]$",
                                                                                message = "Invalid location found. Please check your location parameter")
                                                                        String location) {
        return ResponseEntity.ok(weatherService.getNextWeekWeather(location));
    }
    //weather data for the next 30 days
    @GetMapping("/month/{location}")
    public ResponseEntity<WeatherDto> getMonthlyWeatherDatas(@PathVariable
                                                                         @Pattern(regexp = "^[a-zA-Z][a-zA-Z\\s-]+[a-zA-Z]$",
                                                                                 message = "Invalid location found. Please check your location parameter")
                                                                         String location) {
        return ResponseEntity.ok(weatherService.getNextMonthWeather(location));
    }

}
