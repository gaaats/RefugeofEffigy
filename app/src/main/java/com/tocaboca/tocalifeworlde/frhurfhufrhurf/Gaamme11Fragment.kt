package com.tocaboca.tocalifeworlde.frhurfhufrhurf

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.tocaboca.tocalifeworlde.R
import com.tocaboca.tocalifeworlde.databinding.FragmentGaamme11Binding


class Gaamme11Fragment : Fragment() {
    private fun gtjogtjogtjiogtijo() {
        binding.center.setOnClickListener {
            gtjgtigtigtgtgt()
            findNavController().navigate(R.id.action_gaamme11Fragment_to_gaammeee22Fragment)
        }
    }

    private fun rffrfrrfhuirfhrf() {
        binding.top.setOnClickListener {
            gtjgtigtigtgtgt()
            findNavController().navigate(R.id.action_gaamme11Fragment_to_gaammeee22Fragment)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            gtjogtjigtjiogtjiogtjoigt()


        } catch (e: Exception) {
            vfvvf()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtjogtjigtjiogtjiogtjoigt() {
        rffrfrrfhuirfhrf()

        gtjogtjogtjiogtijo()

    }

    private fun gtjgtigtigtgtgt() {
        Toast.makeText(requireContext(), "Open game.", Toast.LENGTH_SHORT).show()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaamme11Binding =
            FragmentGaamme11Binding.inflate(inflater, container, false)
        return binding.root
    }


    private fun vfvvf() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var fragmentGaamme11Binding: FragmentGaamme11Binding? = null
    private val binding
        get() = fragmentGaamme11Binding
            ?: throw RuntimeException("FragmentGaamme11Binding = null")


    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentGaamme11Binding = null
        super.onDestroy()
    }
}