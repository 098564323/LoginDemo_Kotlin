package com.icreative.profileDemo.UI

import android.arch.persistence.room.Room
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.icreative.profileDemo.DB.LoginDBDemo
import com.icreative.profileDemo.DB.LoginDatabase
import com.icreative.profileDemo.DI.component
import com.icreative.profileDemo.Presenter.ILoginPresenter
import com.icreative.profileDemo.Presenter.LoginPresenter
import com.icreative.profileDemo.R
import com.icreative.profileDemo.View.ILoginView
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.login.*
import javax.inject.Inject

class LoginActivity : AppCompatActivity(), ILoginView {


    @Inject
    lateinit var context: Context
    //
    private var loginDatabase: LoginDatabase? = null

    //
    override fun onLoginSuccess(message: String) {
        Toasty.success(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onLoginError(message: String) {
        Toasty.error(this, message, Toast.LENGTH_SHORT).show()
    }


    internal lateinit var loginPresenter: ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        //
        component.inject(this)
        //
        loginPresenter = LoginPresenter(this)
        //
        btn_login.setOnClickListener {
            loginPresenter.onLogin(edt_email.text.toString(), edt_password.text.toString())
            //
            loginDatabase = Room.databaseBuilder(this, LoginDatabase::class.java, LoginDBDemo.DATABASE_NAME).build()
            isTableExists()
            //
        }
        //Check The Context which is Injected using Dagger
        Toasty.error(this, "Context - " + context, Toast.LENGTH_SHORT).show()
    }

    private fun isTableExists() {
        if (loginDatabase != null) {
            Thread {
                if (loginDatabase!!.loginDao().isTableExists() == 1) {
                    Toasty.success(this, "Table Exists", Toast.LENGTH_SHORT).show()
                } else {
                    this@LoginActivity.runOnUiThread({
                        Toasty.success(this, "Table Not Exists", Toast.LENGTH_SHORT).show()
                    })
                }
            }.start()
        } else {
            Toasty.success(this, "Table is not Created", Toast.LENGTH_SHORT).show()
        }
    }
}