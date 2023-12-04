package com.adrikhamid.administrasisiswa.model

import androidx.lifecycle.ViewModel
import com.adrikhamid.administrasisiswa.repositori.RepositoriSiswa

class HomeViewModel (private val repositoriSiswa: RepositoriSiswa): ViewModel(){
    companion object{
        private const val TIMEOUT_MILLIS = 5_000L
    }
}