package com.adrikhamid.administrasisiswa

import android.app.Application
import com.adrikhamid.administrasisiswa.repositori.ContainerApp
import com.adrikhamid.administrasisiswa.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}