package com.junesoftware.maskguns

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.junesoftware.maskguns.databinding.FragmentReloadBinding
import kotlinx.coroutines.delay
import kotlin.random.Random
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope


class ReloadFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        vvv = FragmentReloadBinding.inflate(inflater, container, false)
        return jjjjj.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            val vfvvfvf = tgotkotkgtkgt()
            bgbbggbgg(vfvvfvf)
            bggbgbgg()
        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun tgotkotkgtkgt() = Random.nextInt(from = 900, until = 8000)

    private fun bgbbggbgg(vfvvfvf: Int) {
        Snackbar.make(
            jjjjj.root,
            "You recived $vfvvfvf points",
            Snackbar.LENGTH_LONG
        ).show()
    }

    private fun bggbgbgg() {
        lifecycleScope.launchWhenCreated {
            delay(2000)
            findNavController().navigate(R.id.action_reloadFragment_to_starterrrFragment)
        }
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
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


    private var vvv: FragmentReloadBinding? = null
    private val jjjjj get() = vvv ?: throw RuntimeException("FragmentReloadBinding = null")

}