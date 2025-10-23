package com.dawid.bookpedia.book.data.database

import androidx.room.TypeConverter
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

object StringListTypeConverter {

    @TypeConverter
    fun fromStringToList(value: String): List<String> {
        return Json.decodeFromString(value)
    }

    @TypeConverter
    fun fromListToString(list: List<String>): String {
        return Json.encodeToString(list)
    }
}