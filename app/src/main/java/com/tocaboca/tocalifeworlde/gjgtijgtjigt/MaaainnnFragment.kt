package com.tocaboca.tocalifeworlde.gjgtijgtjigt

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tocaboca.tocalifeworlde.R

class MaaainnnFragment : Fragment() {
    private lateinit var hy59hy5yh59hy95hy: Context


    override fun onAttach(context: Context) {
        super.onAttach(context)
        hy59hy5yh59hy95hy=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gjgtgtuigtihgthuigtui()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maaainnn, container, false)
    }


    private fun gjgtgtuigtihgthuigtui() {
        grfgtgtgtuihgt()
    }

    private fun grfgtgtgtuihgt() {
        findNavController().navigate(R.id.action_maaainnnFragment_to_countryyyFragment)
    }
}