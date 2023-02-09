# HW3_WeatherApi
 Patika.dev DefineX Java Spring Practicum fourth week, third homework


## About Project
Reflecting the data drawn from the weather API to the user on a daily, weekly and monthly basis.

* Java 17
* Maven

## Getting Started

This is an example of how you may give instructions on setting up your project locally. 
To get a local copy up and running follow these simple example steps.

## Project Content
We're going to make a weather API. **https://www.visualcrossing.com/weather-api** is used as an api from this application.

Our main goal is to write an API to communicate with these APIs. Let's show the daily, weekly and monthly weather report according to the country / city information that we will get from the user.

The request will first come to the API you will write, then after you receive the request, you will request the Free Weather APIs and return this information.

You can use the very easy to use RestTemplate class for this process.

what is expected

* Making a correct API structure.
* Making validations on your models or parameters. 
* Handling exceptions.

### Installation

1. Clone the repo
```
https://github.com/MustafaKaganSimsek/HW3_WeatherApi.git
```
### Usage

1. go to folder of the project
```
cd .../HW3_WeatherApi
```
2. run project
```
mvn spring-boot:run
```
3. You can use swagger
```
http://localhost:8080/swagger-ui/
```