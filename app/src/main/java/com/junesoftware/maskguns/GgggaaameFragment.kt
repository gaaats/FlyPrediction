package com.junesoftware.maskguns

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.junesoftware.maskguns.databinding.FragmentGgggaaameBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class GgggaaameFragment : Fragment() {
    var tgtgttg = 0.05f
    var gtgt = 0.05f
    private var tgtgt = 1
    private var jkuokjku = true

    private val lllllist by lazy {
        listOf(
            ContextCompat.getDrawable(requireActivity(), R.drawable.img),
            ContextCompat.getDrawable(requireActivity(), R.drawable.img_1),
            ContextCompat.getDrawable(requireActivity(), R.drawable.img_2),
        ).shuffled()
    }


    private var gykohkoykkh: FragmentGgggaaameBinding? = null
    private val gyohkyyhk
        get() = gykohkoykkh ?: throw RuntimeException("FragmentGgggaaameBinding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gykohkoykkh = FragmentGgggaaameBinding.inflate(inflater, container, false)
        return gyohkyyhk.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val currentImg = lllllist.random()
        gyohkyyhk.btnMainEnemy.setImageDrawable(currentImg)

        try {
            yhkyhkoyokhkkykh()
            gyohkyyhk.btnImgExit.setOnClickListener {
                nnnn()
            }
            staaartGaaamrr()

        } catch (e: Exception) {
            vvvv()
        }
        super.onViewCreated(view, savedInstanceState)
    }

    private fun staaartGaaamrr() {
        polforgo()
        jkuokjku = false
        gyohkyyhk.btnPressMe.setOnClickListener {
            if (tgtgt >= 99) {
                findNavController().navigate(R.id.action_ggggaaameFragment_to_reloadFragment)
                tgtgt = 1
            }
            gyohkyyhk.progBarSplashScrn.progress = tgtgt
            tgtgt += 2
        }
    }

    override fun onPause() {
        tgtgt = 1
        super.onPause()
    }

    private fun vvvv() {
        Snackbar.make(
            gyohkyyhk.root,
            "Error 777, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onDestroy() {
        gykohkoykkh = null
        super.onDestroy()
    }

    private fun polforgo() {
        lifecycleScope.launch {
            while (true) {
                gyohkyyhk.btnPressMe.alpha = tgtgttg
                if (tgtgttg >= 1f) {
                    gtgt = -0.05f
                }
                if (tgtgttg <= 0.1f) {
                    gtgt = 0.05f
                }
                delay(10)
                tgtgttg += gtgt
            }
        }
    }

    private fun yhkyhkoyokhkkykh() {
        gyohkyyhk.progBarSplashScrn.progress = tgtgt
    }

    private fun nnnn() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Are you reaaaaly want to exit, the current data will not be save?")
            .setPositiveButton("Yes, Exit") { _, _ ->
                requireActivity().finish()
            }
            .setNegativeButton("Deny") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }


}