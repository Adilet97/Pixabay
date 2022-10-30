package com.example.pixabay

import android.app.Application
import com.example.pixabay.model.PixaApi
import com.example.pixabay.model.RetrofitService

class App : Application() {
    companion object {
        lateinit var api: PixaApi
    }

    override fun onCreate() {
        super.onCreate()
        api = RetrofitService().getApi()
    }
}