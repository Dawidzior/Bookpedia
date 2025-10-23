package com.dawid.bookpedia

import android.app.Application
import com.dawid.bookpedia.di.initKoin
import org.koin.android.ext.koin.androidContext

class BookApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@BookApplication)
        }
    }
}