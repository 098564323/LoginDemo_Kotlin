package com.icreative.profileDemo.Modules

import android.app.Application
import com.icreative.profileDemo.DI.ApplicationComponent
import com.icreative.profileDemo.DI.DaggerApplicationComponent

/**
 *   Create Application Class for Managing Component For whole Application
 */
class Application : Application() {
    //Global component variable to access by any android component
    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerApplicationComponent.builder().androidModule(AndroidModule(this)).build()
    }
}