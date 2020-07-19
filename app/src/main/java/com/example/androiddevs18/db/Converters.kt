package com.example.androiddevs18.db

import androidx.room.TypeConverter
import com.example.androiddevs18.model.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}