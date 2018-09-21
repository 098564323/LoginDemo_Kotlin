package com.icreative.profileDemo.DB

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase


@Database(entities = [(LoginData::class)], version = LoginDBDemo.DATABASE_VERSION, exportSchema = false)
abstract class LoginDatabase : RoomDatabase() {

    abstract fun loginDao(): LoginDao
}