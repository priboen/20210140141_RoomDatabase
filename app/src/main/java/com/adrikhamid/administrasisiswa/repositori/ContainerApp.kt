package com.adrikhamid.administrasisiswa.repositori

import android.content.Context
import com.adrikhamid.administrasisiswa.data.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa: RepositoriSiswa
}

class ContainerDataApp(private val context: Context): ContainerApp{
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OffLineRepositoriSiswa(DatabaseSiswa.getDatabase(context).siswaDao())
    }

}