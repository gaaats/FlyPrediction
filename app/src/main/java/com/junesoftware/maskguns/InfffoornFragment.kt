package com.junesoftware.maskguns

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.junesoftware.maskguns.databinding.FragmentInfffoornBinding
import kotlin.random.Random
import android.view.ViewGroup


class InfffoornFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        vvv = FragmentInfffoornBinding.inflate(inflater, container, false)
        return jjjjj.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            gktgktogtkgtkt()

        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun gktgktogtkgtkt() {
        jjjjj.btnUnderstandGameRules.setOnClickListener {
            requireActivity().onBackPressed()
        }
        jjjjj.btnImgExitInfo.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }

    private fun tgotkotkgtkgt() = Random.nextInt(from = 900, until = 8000)

    private fun bgbbggbgg(vfvvfvf: Int) {
        Snackbar.make(
            jjjjj.root,
            "You recived $vfvvfvf points",
            Snackbar.LENGTH_LONG
        ).show()
    }

    override fun onDestroy() {
        vvv = null
        super.onDestroy()
    }

    private fun vfvvf() {
        Snackbar.make(
            jjjjj.root,
            "Error 808...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    private var vvv: FragmentInfffoornBinding? = null
    private val jjjjj get() = vvv ?: throw RuntimeException("FragmentInfffoornBinding = null")

}