package com.dimas.activityintent.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/*
    untuk dapat membawa data class ke dalam detal news kita harus menambahkan ParcelAble
    dimana jika di kotlin kita harus menabahkan code berikut di app build:gradle

    androidExtensions {
        experimental = true
    }

    berikut codingan data class berubah menjadi seperti berikut

 */

@Parcelize
data class News(
    val img: String,
    val judul: String,
    val tanggal: String,
    val penulis: String,
    val deskripsi: String,
    val sumber: String,
    val referensi: String
) : Parcelable