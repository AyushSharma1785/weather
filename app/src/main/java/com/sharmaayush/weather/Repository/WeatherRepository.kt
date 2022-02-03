package com.sharmaayush.weather.Repository

import com.sharmaayush.weather.Model.City
import com.sharmaayush.weather.Network.ApiServiceImp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val apiServiceImp: ApiServiceImp) {

    fun getCityData(city:String):Flow<City> = flow {
        val response= apiServiceImp.getCity(city,"28dd534d0604575c06b15cdb5dcec66b")
        emit(response)
    }.flowOn(Dispatchers.IO)
        .conflate()
}