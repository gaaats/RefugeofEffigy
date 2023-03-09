package com.tocaboca.tocalifeworlde.fngtnjgtnjgt

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tocaboca.tocalifeworlde.R
import com.tocaboca.tocalifeworlde.gtjigtjigtjigt.JOIfjirfjrf.hy59hy59hy59hy
import com.tocaboca.tocalifeworlde.urriila.JIofrjfrjirfji
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class CountryyyFragment : Fragment() {

    private lateinit var gtgtgtjigtjigti: Context


    val gtktgkgtkogt: SharedPreferences by inject(named("SharedPreferences"))
    val ggtjigtjiogtjiogt by activityViewModel<JIofrjfrjirfji>(named("MainModel"))

    lateinit var hhyhyhy5hyhy: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_countryyy, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtgtgtjigtjigti = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ggtjigtjiogtjiogt.countryCode.observe(viewLifecycleOwner) {
            if (it!=null) {
                hhyhyhy5hyhy = it.countryCode
                gtktgkgtkogt.edit().putString(hy59hy59hy59hy, hhyhyhy5hyhy).apply()
                findNavController().navigate(R.id.action_countryyyFragment_to_seccMaiinFragment)
            }
        }
    }

}