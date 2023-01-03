package com.junesoftware.maskguns

import android.content.Intent
import android.icu.util.Calendar
import android.os.Bundle
import android.os.CountDownTimer
import com.junesoftware.maskguns.lololo.Constance
import com.junesoftware.maskguns.lololo.DataForVebViev
import com.junesoftware.maskguns.lololo.SortClass
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import kotlinx.coroutines.launch
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.junesoftware.maskguns.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*


@AndroidEntryPoint
@ActivityScoped
class MainActivity : AppCompatActivity() {
    private val mainViewModel by viewModels<SortVievModell>()

    private lateinit var countDownTimer: CountDownTimer

    val ttest = "hh"

    private var bbbbb: ActivityMainBinding? = null
    private val hhhh get() = bbbbb ?: throw RuntimeException("ActivityMainBinding = null")


    private fun gthhyyhyh(dataForSend: DataForVebViev) {
        val vvvvbbbg = Intent(this@MainActivity, VievVeebActivity::class.java).also {
            it.putExtra(Constance.KEY_DATA_FOR_VEB_VIEV, dataForSend)
        }
        startActivity(vvvvbbbg)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        bbbbb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(hhhh.root)


        lifecycleScope.launch {
            mainViewModel.gtgttgt()

            mainViewModel.vvffvvfbgdddddd(this@MainActivity)

            mainViewModel.aaaaapppaa(this@MainActivity)

            mainViewModel.juukikik()
        }

        mainViewModel.liveData.observe(this) {
            when (it) {
                SortClass.LOADING -> {
                }
                SortClass.MODERATION -> {
                    val intent = Intent(this, GeeemeeeActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                SortClass.TEST_VEB -> {

                    if (ttest == "okkk") {
                        printDifferenceDateForHours()
                    }
                    val dataForSend = mainViewModel.gtgtgtgt()
                    gthhyyhyh(dataForSend)
                }
                SortClass.REAL_START_NO_APPS -> {

                    mainViewModel.gtgtgtgt().also {
                        gthhyyhyh(it)
                    }
                }
                SortClass.REAL_START -> {

                    mainViewModel.gtgtgtgt().also {
                        gthhyyhyh(it)
                    }
                }

            }
        }
    }

    fun printDifferenceDateForHours() {

        val currentTime = Calendar.getInstance().time
        val endDateDay = "03/02/2020 21:00:00"
        val format1 = SimpleDateFormat("dd/MM/yyyy hh:mm:ss", Locale.getDefault())
        val endDate = format1.parse(endDateDay)

        //milliseconds
        var different = endDate.time - currentTime.time
        countDownTimer = object : CountDownTimer(different, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                var diff = millisUntilFinished
                val secondsInMilli: Long = 1000
                val minutesInMilli = secondsInMilli * 60
                val hoursInMilli = minutesInMilli * 60
                val daysInMilli = hoursInMilli * 24

                val elapsedDays = diff / daysInMilli
                diff %= daysInMilli

                val elapsedHours = diff / hoursInMilli
                diff %= hoursInMilli

                val elapsedMinutes = diff / minutesInMilli
                diff %= minutesInMilli

                val elapsedSeconds = diff / secondsInMilli


            }

            override fun onFinish() {

            }
        }.start()
    }

}