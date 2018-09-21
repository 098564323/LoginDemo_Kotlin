package com.icreative.profileDemo.DI

import com.icreative.profileDemo.Modules.AndroidModule
import com.icreative.profileDemo.UI.LoginActivity
import dagger.Component
import javax.inject.Singleton


/**
 *  Create Singleton Class object with inject method
 */
@Singleton
@Component(modules = arrayOf(AndroidModule::class))
interface ApplicationComponent {


    fun inject(activity:LoginActivity);
}