package com.icreative.profileDemo.DB

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = LoginDBDemo.LogingData.TABLE_NAME)
data class LoginData(@ColumnInfo(name = LoginDBDemo.LogingData.EMAIL_ID) val emailID: String,
                     @ColumnInfo(name = LoginDBDemo.LogingData.PASSWORD) val password: String) {

    @PrimaryKey(autoGenerate = true)
    var rowID: Long = 0

}