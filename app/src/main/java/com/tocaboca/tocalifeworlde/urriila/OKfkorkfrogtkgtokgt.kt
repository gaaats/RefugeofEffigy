package com.tocaboca.tocalifeworlde.urriila

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.tocaboca.tocalifeworlde.gtjigtjigtjigt.Hooooo
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val hy5959j9595uj = module {
    viewModel (named("MainModel")){
        JIofrjfrjirfji((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Oifjfrjrfjjrf(get())
    }
}

val hjoihyjihyjihyjihy = module {

    single  <Hooooo> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Hooooo::class.java)
    }

    single <KOfrofrrfojrfoirf> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(KOfrofrrfojrfoirf::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://refugeofeffigy.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Ofjjiorfjifr(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        UHfrhuuhrf(get(named("HostInter")))
    }
    single{
        hy5hy5hj959uj5uj()
    }
    single (named("SharedPreferences")) {
        gtjitgjigtjitg(androidApplication())
    }
}

fun gtjitgjigtjitg(gtkogtkogtkogt: Application): SharedPreferences {
    return gtkogtkogtkogt.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun hy5hy5hj959uj5uj(): Gson {
    return GsonBuilder().create()
}

