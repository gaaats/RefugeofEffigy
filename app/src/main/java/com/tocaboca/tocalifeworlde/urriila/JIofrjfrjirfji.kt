package com.tocaboca.tocalifeworlde.urriila

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.tocaboca.tocalifeworlde.gngtnkgtnjgtnj.OKofrkrkrfok
import com.tocaboca.tocalifeworlde.gtjigtjigtjigt.JOIfjirfjrf.hy59hy5hy5hy5
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class JIofrjfrjirfji(
    private val mainRepository: Ofjjiorfjifr,
    private val devRepo: UHfrhuuhrf,
    private val shP: SharedPreferences,
    val application: Application
) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            getAdvertisingIdClient()
        }
        viewModelScope.launch(Dispatchers.Main) {
            getData()
        }
    }

    private val _countryCode = MutableLiveData<Iijfrjrfjijirf>()
    val countryCode: LiveData<Iijfrjrfjijirf>
        get() = _countryCode

    private val _geo = MutableLiveData<OKofrkrkrfok>()
    val geo: LiveData<OKofrkrkrfok>
        get() = _geo

    private val _appsData = MutableLiveData<String>()
    val appsData: LiveData<String>
        get() = _appsData

    private val _mainId = MutableLiveData<String?>()
    val mainId: LiveData<String?>
        get() = _mainId


    suspend fun getData() {
        _countryCode.postValue(mainRepository.hy59yh59hy59hy().body())
        getDevData()
    }

    suspend fun getDevData() {
        _geo.postValue(devRepo.hy62j26k2ikol().body())
    }

    fun convers(cont: Context) {
        AppsFlyerLib.getInstance()
            .init(hy59hy5hy5hy5, conversionDataListener, application)
        AppsFlyerLib.getInstance().start(cont)
    }

    fun fbDeee(cont: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            cont
        ) { data: AppLinkData? ->
            data?.let {
                val deepData = data.targetUri?.host.toString()
                shP.edit().putString("deepSt", deepData).apply()
            }
        }
    }

    private val conversionDataListener = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            _appsData.postValue(dataGotten)
        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
        }

        override fun onAttributionFailure(error: String?) {
        }
    }


    fun getAdvertisingIdClient() {
        val advertisingIdClient = AdvertisingIdClient(application)
        advertisingIdClient.start()
        val idUserAdvertising = advertisingIdClient.info.id.toString()
        _mainId.postValue(idUserAdvertising)
    }

}