package com.example.dataclasses.request

import com.example.dataclasses.data.DataResult
import com.example.dataclasses.mapper.DataMapper
import com.google.gson.Gson
import java.net.URL

class RequestData {

    companion object {
        private const val CHALLENGE_DATA_URL = "https://bbc.github.io/sport-app-dev-tech-challenge/data.json"
    }

    fun execute() : MutableList<String> {
        val forecastJsonStr = URL(CHALLENGE_DATA_URL).readText()
        val dataResult = Gson().fromJson(forecastJsonStr, DataResult::class.java)
        return DataMapper().convertFromDataToModel(dataResult)
    }
}