package com.icreative.profileDemo.View

interface ILoginView {

    //Method will use for success want display on screen
    fun onLoginSuccess(message:String)
    //Method will use for error want display on screen
    fun onLoginError(message:String)


}