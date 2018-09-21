package com.icreative.profileDemo.DI


import com.icreative.profileDemo.Modules.Application
import android.support.v7.app.AppCompatActivity

/**
 * Create component variable and assign Android Component which currently Running on the Screen.
 */
val AppCompatActivity.component: ApplicationComponent
    get() = (application as Application).component