package com.tocaboca.tocalifeworlde.urriila

import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class Oifjfrjrfjjrf(application: Application): ViewModel() {
    val hy59hy5hy559hy = application.packageManager
    fun hy59hy59hy59hy59hy(hyhy995uj: WebView): WebSettings{
       val bhnhujujkiikik = hyhy995uj.settings
        bhnhujujkiikik.javaScriptEnabled = true
        bhnhujujkiikik.useWideViewPort = true
        bhnhujujkiikik.loadWithOverviewMode = true
        bhnhujujkiikik.allowFileAccess = true
        bhnhujujkiikik.domStorageEnabled = true
        bhnhujujkiikik.userAgentString = bhnhujujkiikik.userAgentString.replace("; wv", "")
        bhnhujujkiikik.javaScriptCanOpenWindowsAutomatically = true
        bhnhujujkiikik.setSupportMultipleWindows(false)
        bhnhujujkiikik.displayZoomControls = false
        bhnhujujkiikik.builtInZoomControls = true
        bhnhujujkiikik.allowFileAccess = true
        bhnhujujkiikik.allowContentAccess = true
        bhnhujujkiikik.setSupportZoom(true)
        bhnhujujkiikik.pluginState = WebSettings.PluginState.ON
        bhnhujujkiikik.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        bhnhujujkiikik.cacheMode = WebSettings.LOAD_DEFAULT
        bhnhujujkiikik.allowContentAccess = true
        bhnhujujkiikik.mediaPlaybackRequiresUserGesture = false
        return bhnhujujkiikik
    }
    fun hy59hjyu59uj5ju59uj(hy5hy5hy59hy: String) {
        OneSignal.setExternalUserId(
            hy5hy5hy59hy,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val hy59hy59hy59hy = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $hy59hy59hy59hy"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val hy59hy59hy59hy =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $hy59hy59hy59hy"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val nhjujuikikik = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $nhjujuikikik"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    fun gtgthyhy5hy5hy59hy(uri: String): Boolean {
        try {
            hy59hy5hy559hy.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }
}