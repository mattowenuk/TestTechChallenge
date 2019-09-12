package com.example.dataclasses.mapper

import com.example.dataclasses.data.DataResult

class DataMapper {

    fun convertFromDataToModel(dataResult: DataResult) : MutableList<String> {
        val titleList = mutableListOf<String>()
        dataResult.data.items.forEach { items -> titleList.add(items.title)}
        return titleList
    }
}