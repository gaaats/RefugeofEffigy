package com.tocaboca.tocalifeworlde.urriila

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun getData(): Response<CountryCodeJS>
}

interface HostInterface {
    @GET("refuge.json")
    suspend fun getDataDev(): Response<GeoDev>
}

class CountryRepo(private val countryApi: ApiInterface) {
    suspend fun getDat() = countryApi.getData()
}
class DevRepo(private val devData: HostInterface) {
    suspend fun getDataDev() = devData.getDataDev()
}

@Keep
data class CountryCodeJS(
    @SerializedName("countryCode")
    val countryCode: String,
)


@Keep
data class GeoDev(
    @SerializedName("refugegeo")
    val refugegeo: String,
    @SerializedName("refugelinkaa")
    val refugelinkaa: String,
    @SerializedName("refugenumerot")
    val refugenumerot: String,
)