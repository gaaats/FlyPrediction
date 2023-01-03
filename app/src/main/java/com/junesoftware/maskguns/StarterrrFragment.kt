package com.junesoftware.maskguns

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.junesoftware.maskguns.databinding.FragmentStarterrrBinding


class StarterrrFragment : Fragment() {


    private var GTGTGTGT: FragmentStarterrrBinding? = null
    private val hhhhhh get() = GTGTGTGT ?: throw RuntimeException("FragmentStarterrrBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        GTGTGTGT = FragmentStarterrrBinding.inflate(inflater, container, false)
        return hhhhhh.root
    }

    private fun gthyhuyjuju() {
        Snackbar.make(
            hhhhhh.root,
            "Error 111...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            initClickFrfr()

        } catch (e: Exception) {
            gthyhuyjuju()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun initClickFrfr() {
        hhhhhh.btnPlayGameeee.setOnClickListener {
            findNavController().navigate(R.id.action_starterrrFragment_to_ggggaaameFragment)
        }
        hhhhhh.imgInform.setOnClickListener {
            findNavController().navigate(R.id.action_starterrrFragment_to_infffoornFragment)
        }
        hhhhhh.imgCloose.setOnClickListener {
            requireActivity().finish()
        }
    }

    override fun onDestroy() {
        GTGTGTGT = null
        super.onDestroy()
    }

}