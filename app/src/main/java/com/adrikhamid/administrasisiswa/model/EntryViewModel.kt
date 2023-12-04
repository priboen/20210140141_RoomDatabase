package com.adrikhamid.administrasisiswa.model

import com.adrikhamid.administrasisiswa.data.Siswa


data class UIStateSiswa(
    val detailSiswa: DetailSiswa = DetailSiswa(),
    val isEntryValid: Boolean = false
)

data class DetailSiswa(
    val id: Int = 0,
    val nama: String = "",
    val alamat: String = "",
    val telpon: String = ""
)

fun Siswa.toDetailSiswa(): DetailSiswa = DetailSiswa(
    id=id,
    nama=nama,
    alamat=alamat,
    telpon=telpon
)

