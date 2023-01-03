package com.junesoftware.maskguns.lololo

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataForVebViev(
    val appsFlyerDattaGotten: String,
    val advertisingIdClient:String,
    val appLinkData:String,
    val linkViev:String,
) : Parcelable