package com.icreative.profileDemo.Presenter

import com.icreative.profileDemo.Model.User
import com.icreative.profileDemo.View.ILoginView

class LoginPresenter(internal var iLoginView: ILoginView) : ILoginPresenter {
    override fun onLogin(email: String, password: String) {
        var user = User(email, password)
        var loginCode = user.isDataValid()

        if (loginCode == 0)
            iLoginView.onLoginError("Email Must not be null")
        else if (loginCode == 1)
            iLoginView.onLoginError("Wrong email address")
        else if (loginCode == 2)
            iLoginView.onLoginError("Password must be grater than 6")
        else
            iLoginView.onLoginSuccess("Login Success")
    }
}