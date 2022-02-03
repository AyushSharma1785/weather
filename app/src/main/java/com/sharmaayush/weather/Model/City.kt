package com.sharmaayush.weather.Model

data class City(
    val weather:ArrayList<Weather>,
    val main:Main,
    val wind:Wind,
    val name:String
) {
}