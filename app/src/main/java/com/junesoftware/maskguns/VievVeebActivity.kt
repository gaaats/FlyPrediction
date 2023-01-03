package com.junesoftware.maskguns

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import android.provider.MediaStore
import android.webkit.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.junesoftware.maskguns.databinding.ActivityVievVeebBinding
import com.junesoftware.maskguns.lololo.Constance
import com.junesoftware.maskguns.lololo.DataForVebViev
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

class VievVeebActivity : AppCompatActivity() {
    val vfvfvffvf by lazy {
        intent.getParcelableExtra(Constance.KEY_DATA_FOR_VEB_VIEV) as DataForVebViev?
    }


    private val bnbnbn = 1

    private fun nhjuujuki() {
        val cdcddcdcd = jgidhgjdk.settings
        cdcddcdcd.javaScriptEnabled = true

        cdcddcdcd.useWideViewPort = true

        cdcddcdcd.loadWithOverviewMode = true
        cdcddcdcd.allowFileAccess = true
        cdcddcdcd.domStorageEnabled = true
        cdcddcdcd.userAgentString = cdcddcdcd.userAgentString.replace("; wv", "")

        cdcddcdcd.javaScriptCanOpenWindowsAutomatically = true
        cdcddcdcd.setSupportMultipleWindows(false)

        cdcddcdcd.displayZoomControls = false
        cdcddcdcd.builtInZoomControls = true
        cdcddcdcd.setSupportZoom(true)

        cdcddcdcd.pluginState = WebSettings.PluginState.ON
        cdcddcdcd.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        cdcddcdcd.setAppCacheEnabled(true)

        cdcddcdcd.allowContentAccess = true
    }

    fun bgkgokgo(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (urlfififif == "") {
                urlfififif = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val cccvfc =
                    getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val ededededededed = cccvfc.edit()
                ededededededed.putString("SAVED_URL", lurlurlurlurlur)
                ededededededed.apply()
            }
        }
    }

    override fun onBackPressed() {


        if (jgidhgjdk.canGoBack()) {
            if (jkikiiik) {
                jgidhgjdk.stopLoading()
                jgidhgjdk.loadUrl(urlfififif)
            }
            this.jkikiiik = true
            jgidhgjdk.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                jkikiiik = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    var bggbggb: ValueCallback<Array<Uri>>? = null
    lateinit var jgidhgjdk: WebView

    var urlfififif = ""


    lateinit var dededef: ActivityVievVeebBinding
    var kgjfhdkxf: String? = null


    private fun bbnbnko(): String {
        val preferences = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
        val bbggbgbgb = "com.junesoftware.maskguns"

        val frffrrf = Constance.pacccckk

        val vfvfvffv = vfvfvffvf?.appsFlyerDattaGotten ?: "null"
        val appLinkData = vfvfvffvf?.appLinkData ?: "null"
        val bbggnnhh = vfvfvffvf?.advertisingIdClient ?: "null"
        val linkkk = vfvfvffvf?.linkViev ?: "null"



        val vcdcdcdcd = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        val bgbggbbg = "sub_id_5="
        val sub6frfr = "sub_id_6="
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        val bbgbg = "deviceID="
        val bnbnbn = "deeporg"
        val frfrfrfr = "sub_id_1="
        val adidddddd = "ad_id="
        val sub4frfrr = "sub_id_4="



        val nononok = "naming"


        val nhnhnhnh = Build.VERSION.RELEASE


        var hylphlyplhly = ""
        if (vfvfvffv != "null") {
            hylphlyplhly =
                "$linkkk$frfrfrfr$vfvfvffv&$bbgbg$vcdcdcdcd&$adidddddd$bbggnnhh&$sub4frfrr$bbggbgbgb&$bgbggbbg$nhnhnhnh&$sub6frfr$nononok"
            juujujuj(vcdcdcdcd.toString())
        } else {
            hylphlyplhly =
                "$linkkk$frfrfrfr$appLinkData&$bbgbg$vcdcdcdcd&$adidddddd$bbggnnhh&$sub4frfrr$bbggbgbgb&$bgbggbbg$nhnhnhnh&$sub6frfr$bnbnbn"
            juujujuj(vcdcdcdcd.toString())
        }

        return preferences.getString("SAVED_URL", hylphlyplhly).toString()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dededef = ActivityVievVeebBinding.inflate(layoutInflater)
        setContentView(dededef.root)

        jgidhgjdk = dededef.vvveeev

        gltgkoktogkto()

        val gttgththy = CookieManager.getInstance()
        gttgththy.setAcceptCookie(true)
        gttgththy.setAcceptThirdPartyCookies(jgidhgjdk, true)
        nhjuujuki()
        val cdcdcdcd: Activity = this
        jgidhgjdk.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (cdcdcd(url)) {

                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        startActivity(intent)
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
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                bgkgokgo(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(cdcdcdcd, description, Toast.LENGTH_SHORT).show()
            }


        }
        jgidhgjdk.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                bggbggb?.onReceiveValue(null)
                bggbggb = filePathCallback
                var bgghhyhyhy: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (bgghhyhyhy!!.resolveActivity(packageManager) != null) {

                    var vfvf: File? = null
                    try {
                        vfvf = noka()
                        bgghhyhyhy.putExtra("PhotoPath", kgjfhdkxf)
                    } catch (ex: IOException) {
                    }

                    if (vfvf != null) {
                        kgjfhdkxf = "file:" + vfvf.absolutePath
                        bgghhyhyhy.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(vfvf)
                        )
                    } else {
                        bgghhyhyhy = null
                    }
                }
                val boka = Intent(Intent.ACTION_GET_CONTENT)
                boka.addCategory(Intent.CATEGORY_OPENABLE)
                boka.type = "image/*"
                val kikii: Array<Intent?> =
                    bgghhyhyhy?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val opopopop = Intent(Intent.ACTION_CHOOSER)
                opopopop.putExtra(Intent.EXTRA_INTENT, boka)
                opopopop.putExtra(Intent.EXTRA_TITLE, getString(R.string.take_take_imagee))
                opopopop.putExtra(Intent.EXTRA_INITIAL_INTENTS, kikii)
                startActivityForResult(
                    opopopop, bnbnbn
                )
                return true
            }

            @Throws(IOException::class)
            private fun noka(): File {
                var frfrrfr = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!frfrrfr.exists()) {
                    frfrrfr.mkdirs()
                }

                frfrrfr =
                    File(frfrrfr.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return frfrrfr
            }

        }

        jgidhgjdk.loadUrl(bbnbnko())
    }

    private fun gltgkoktogkto() {
        Snackbar.make(
            dededef.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()
    }


    private fun juujujuj(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val vvfvf = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $vvfvf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val bgbgbgbg =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $bgbgbgbg"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val frfrfr = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $frfrfr"
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


    private fun cdcdcd(uri: String): Boolean {

        val goolkagtgt = packageManager
        try {

            goolkagtgt.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != bnbnbn || bggbggb == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var kiikikikl: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                kiikikikl = arrayOf(Uri.parse(kgjfhdkxf))
            } else {
                val vfvddsser = data.dataString
                if (vfvddsser != null) {
                    kiikikikl = arrayOf(Uri.parse(vfvddsser))
                }
            }
        }
        bggbggb?.onReceiveValue(kiikikikl)
        bggbggb = null
    }


    private var jkikiiik = false



}