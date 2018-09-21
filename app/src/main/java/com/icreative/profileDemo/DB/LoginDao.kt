package com.icreative.profileDemo.DB

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query

@Dao
interface LoginDao {

    @Query("SELECT CASE WHEN tbl_name = User")
    fun isTableExists(): Int
}