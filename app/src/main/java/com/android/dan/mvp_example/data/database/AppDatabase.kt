package com.android.dan.mvp_example.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.android.dan.mvp_example.data.dao.QuoteDao
import com.android.dan.mvp_example.entities.Quote

@Database(entities = [Quote::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun quoteDao() : QuoteDao
}