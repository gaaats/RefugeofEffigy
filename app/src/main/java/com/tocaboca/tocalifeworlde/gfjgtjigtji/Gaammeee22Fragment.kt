package com.tocaboca.tocalifeworlde.gfjgtjigtji

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.tocaboca.tocalifeworlde.R
import com.tocaboca.tocalifeworlde.databinding.FragmentGaammeee22Binding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random


class Gaammeee22Fragment : Fragment() {
    var click = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.tappp.setOnClickListener {
                click++
                it.isEnabled = false
                lifecycleScope.launch {
                    val rann = Random.nextBoolean()
                    val points = Random.nextInt(from = 100, until = 1000)

                    if (rann) {
                        Toast.makeText(
                            requireContext(),
                            "Earn ${points} points!",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        Toast.makeText(requireContext(), "Try again", Toast.LENGTH_SHORT).show()
                    }
                    delay(1700)
                    it.isEnabled = true

                    if (click == 3) {
                        findNavController().navigate(R.id.action_gaammeee22Fragment_to_gaamme11Fragment)
                    }
                }
            }

        } catch (e: Exception) {
            vfvvf()
        }
        super.onViewCreated(view, savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaamme11Binding =
            FragmentGaammeee22Binding.inflate(inflater, container, false)
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

    private var fragmentGaamme11Binding: FragmentGaammeee22Binding? = null
    private val binding
        get() = fragmentGaamme11Binding
            ?: throw RuntimeException("FragmentGaammeee22Binding = null")


    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentGaamme11Binding = null
        super.onDestroy()
    }
}