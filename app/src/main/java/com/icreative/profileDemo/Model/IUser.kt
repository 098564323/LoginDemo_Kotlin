package com.icreative.profileDemo.Model

/**
 * User Interface with it related fields.
 */
interface IUser {

    val email:String
    val password:String
    fun isDataValid():Int
}