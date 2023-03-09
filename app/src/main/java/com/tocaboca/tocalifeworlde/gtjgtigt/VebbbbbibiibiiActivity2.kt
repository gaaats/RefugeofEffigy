package com.tocaboca.tocalifeworlde.gtjgtigt

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.tocaboca.tocalifeworlde.gtjigtjigtjigt.JOIfjirfjrf.gthyujujuj
import com.tocaboca.tocalifeworlde.gtjigtjigtjigt.JOIfjirfjrf.gbhnhjjuuj
import com.tocaboca.tocalifeworlde.gtjigtjigtjigt.JOIfjirfjrf.hy59hy5hy59hy5
import com.tocaboca.tocalifeworlde.databinding.ActivityVebbbbbibiibii2Binding
import com.tocaboca.tocalifeworlde.urriila.Oifjfrjrfjjrf
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class VebbbbbibiibiiActivity2 : AppCompatActivity() {

    private var frfrjrfjirfjifr = false
    override fun onBackPressed() {

        if (gtgtkogtkogtk.canGoBack()) {
            if (frfrjrfjirfjifr) {
                gtgtkogtkogtk.stopLoading()
                gtgtkogtkogtk.loadUrl(urlfififif)
            }
            this.frfrjrfjirfjifr = true
            gtgtkogtkogtk.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                frfrjrfjirfjifr = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        frfrhifrhfrhu = ActivityVebbbbbibiibii2Binding.inflate(layoutInflater)
        gtgtkogtkogtk = WebView(this)
        setContentView(gtgtkogtkogtk)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(gtgtkogtkogtk, true)
        hg59hy59hy59hy595.hy59hy59hy59hy59hy(gtgtkogtkogtk)

        gtgtkogtkogtk.webViewClient = JIfrijirfjrfjfrj()
        gtgtkogtkogtk.webChromeClient = JOfrjrfjifrjrfijrf()
        gtgtkogtkogtk.loadUrl(h95hy59hy59hy559hy())
    }

    private lateinit var frfrhifrhfrhu: ActivityVebbbbbibiibii2Binding
    lateinit var gtgtkogtkogtk: WebView
    private var gt59gt5gt5gt59gt: ValueCallback<Array<Uri>>? = null
    private var rfrfojirfjoirfjiofr: String? = null
    private  val rfrfjirfjirfjifr = 1

    private val hg59hy59hy59hy595 by viewModel<Oifjfrjrfjjrf>(
        named("BeamModel")
    )

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode != rfrfjirfjirfjifr || gt59gt5gt5gt59gt == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var results: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null) {
                if (rfrfojirfjoirfjiofr != null) {
                    results = arrayOf(Uri.parse(rfrfojirfjoirfjiofr))
                }
            } else {
                val hy59hy5hy59hy = data.dataString
                if (hy59hy5hy59hy != null) {
                    results = arrayOf(Uri.parse(hy59hy5hy59hy))
                }
            }
        }
        gt59gt5gt5gt59gt!!.onReceiveValue(results)
        gt59gt5gt5gt59gt = null
        return
    }

    inner class JIfrijirfjrfjfrj: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (hg59hy59hy59hy595.gtgthyhy5hy5hy59hy(url)) {

                    val hy59hy59hy5hy59hy5hyhy = Intent(Intent.ACTION_VIEW)
                    hy59hy59hy5hy59hy5hyhy.data = Uri.parse(url)
                    startActivity(hy59hy59hy5hy59hy5hyhy)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            hy5hy59hy5hyhy(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@VebbbbbibiibiiActivity2, description, Toast.LENGTH_SHORT).show()
        }
    }


    inner class JOfrjrfjifrjrfijrf : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            filePath: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            gt59gt5gt5gt59gt?.onReceiveValue(null)
            gt59gt5gt5gt59gt = filePath
            var gtgtkogtkogtjgtgtgt: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (gtgtkogtkogtjgtgtgt!!.resolveActivity(packageManager) != null) {
                var photoFile: File? = null
                try {
                    photoFile = hy59hy59hy59hy5juujuj()
                    gtgtkogtkogtjgtgtgt.putExtra("PhotoPath", rfrfojirfjoirfjiofr)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (photoFile != null) {
                    rfrfojirfjoirfjiofr = "file:" + photoFile.absolutePath
                    gtgtkogtkogtjgtgtgt.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(photoFile)
                    )
                } else {
                    gtgtkogtkogtjgtgtgt = null
                }
            }
            val h59hy59hy59hy9hy = Intent(Intent.ACTION_GET_CONTENT)
            h59hy59hy59hy9hy.addCategory(Intent.CATEGORY_OPENABLE)
            h59hy59hy59hy9hy.type = "image/*"
            val hy62uj2uj26ik26: Array<Intent?> = gtgtkogtkogtjgtgtgt?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val juju59ki9595ol5lo9ol = Intent(Intent.ACTION_CHOOSER)
            juju59ki9595ol5lo9ol.putExtra(Intent.EXTRA_INTENT, h59hy59hy59hy9hy)
            juju59ki9595ol5lo9ol.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            juju59ki9595ol5lo9ol.putExtra(Intent.EXTRA_INITIAL_INTENTS, hy62uj2uj26ik26)
            startActivityForResult(juju59ki9595ol5lo9ol, rfrfjirfjirfjifr)
            return true
        }

        fun hy59hy59hy59hy5juujuj(): File? {
            val h5hy59hy59hy = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val hy2hy26 = "JPEG_" + h5hy59hy59hy + "_"
            val hy59hy59hy59hy = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                hy2hy26,
                ".jpg",
                hy59hy59hy59hy
            )
        }
    }

    private fun h95hy59hy59hy559hy(): String {

        val h2h2ju2ik22ik2ik = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val hy59yh59j59ik9ki = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)

        val hy59hy59hy595h9y = hy59yh59j59ik9ki.getString(gbhnhjjuuj, null)

        Log.d("lolo", hy59hy59hy595h9y.toString())


        val gthyjju2ju2ujuj = hy59yh59j59ik9ki.getString(hy59hy5hy59hy5, null)
        val hy59hy59hy55hy = hy59yh59j59ik9ki.getString(gthyujujuj, null)


        when (hy59yh59j59ik9ki.getString("WebInt", null)) {
            "campaign" -> {
                hg59hy59hy59hy595.hy59hjyu59uj5ju59uj(hy59hy59hy55hy.toString())
            }
            "deepLink" -> {
                hg59hy59hy59hy595.hy59hjyu59uj5ju59uj(hy59hy59hy55hy.toString())
            }
            "deepLinkNOApps" -> {
                hg59hy59hy59hy595.hy59hjyu59uj5ju59uj(gthyjju2ju2ujuj.toString())
            }
            "geo" -> {
                hg59hy59hy59hy595.hy59hjyu59uj5ju59uj(gthyjju2ju2ujuj.toString())
            }
        }
        return h2h2ju2ik22ik2ik.getString("SAVED_URL", hy59hy59hy595h9y).toString()
    }

    var urlfififif = ""
    fun hy5hy59hy5hyhy(h59hy59hy5hy59hy59hy: String?) {
        if (!h59hy59hy5hy59hy59hy!!.contains("t.me")) {

            if (urlfififif == "") {
                urlfififif = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    h59hy59hy5hy59hy59hy
                ).toString()

                val spspspspsppspspsp = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val ededededededed = spspspspsppspspsp.edit()
                ededededededed.putString("SAVED_URL", h59hy59hy5hy59hy59hy)
                ededededededed.apply()
            }
        }
    }

}