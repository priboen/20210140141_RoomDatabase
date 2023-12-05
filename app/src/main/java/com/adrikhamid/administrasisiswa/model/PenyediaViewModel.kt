package com.adrikhamid.administrasisiswa.model

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.adrikhamid.administrasisiswa.AplikasiSiswa

fun CreationExtras.aplikasiSiswa():AplikasiSiswa = (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)