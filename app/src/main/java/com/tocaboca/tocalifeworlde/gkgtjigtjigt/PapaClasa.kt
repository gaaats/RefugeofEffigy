package com.tocaboca.tocalifeworlde.gkgtjigtjigt

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.tocaboca.tocalifeworlde.gtjigtjigtjigt.JOIfjirfjrf.frgt5gt5gt5
import com.tocaboca.tocalifeworlde.gtjigtjigtjigt.JOIfjirfjrf.hy26hy2hy2hy2hy
import com.tocaboca.tocalifeworlde.gtjigtjigtjigt.JOIfjirfjrf.h59hy59hy55hy
import com.tocaboca.tocalifeworlde.gtjigtjigtjigt.JOIfjirfjrf.hy59hy5hy59hy5
import com.tocaboca.tocalifeworlde.urriila.hjoihyjihyjihyjihy
import com.tocaboca.tocalifeworlde.urriila.hy5959j9595uj
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class PapaClasa:Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        gtjgtjjtggtiogtigt()

        val hy95hy59uj59uj = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val uj2ik262 = getSharedPreferences("PREFS_NAME", 0)

        val hy59yu59j59 = MyTracker.getTrackerParams()
        val hy5uj599ju = MyTracker.getTrackerConfig()
        val dfrfrgtgtgt = MyTracker.getInstanceId(this)
        hy5uj599ju.isTrackingLaunchEnabled = true
        val ghyjujuik2kiik2ikki = UUID.randomUUID().toString()

        if (uj2ik262.getBoolean("my_first_time", true)) {
            hy59yu59j59.setCustomUserId(ghyjujuik2kiik2ikki)
            hy95hy59uj59uj.edit().putString(hy59hy5hy59hy5, ghyjujuik2kiik2ikki).apply()
            hy95hy59uj59uj.edit().putString(hy26hy2hy2hy2hy, dfrfrgtgtgt).apply()
            uj2ik262.edit().putBoolean("my_first_time", false).apply()
        } else {
            val hyuj2ki2ol2ol = hy95hy59uj59uj.getString(hy59hy5hy59hy5, ghyjujuik2kiik2ikki)
            hy59yu59j59.setCustomUserId(hyuj2ki2ol2ol)
        }
        MyTracker.initTracker(h59hy59hy55hy, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@PapaClasa)
            modules(
                listOf(
                    hy5959j9595uj, hjoihyjihyjihyjihy
                )
            )
        }
    }

    private fun gtjgtjjtggtiogtigt() {
        OneSignal.setAppId(frgt5gt5gt5)
    }
}