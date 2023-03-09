package com.tocaboca.tocalifeworlde.gngtnkgtnjgtnj

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tocaboca.tocalifeworlde.R
import com.tocaboca.tocalifeworlde.gtjigtjigtjigt.JOIfjirfjrf.xcvvbgt
import com.tocaboca.tocalifeworlde.urriila.JIofrjfrjirfji
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class PreeFiillteerrrFragment : Fragment() {
    val frfkkgtkkg by activityViewModel<JIofrjfrjirfji>(named("MainModel"))
    val gtgtkgtkogtko: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var ggtjigtjigtji: String
    private lateinit var gtkotggtkogt: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtkotggtkogt = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pree_fiillteerrr, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val checkFly = gtgtkgtkogtko.getString(xcvvbgt, null)
        val appsCamp = gtgtkgtkogtko.getString("appCamp", null)

        if (checkFly=="1" &&appsCamp == null) {
            frfkkgtkkg.convers(gtkotggtkogt)
            frfkkgtkkg.appsData.observe(viewLifecycleOwner) {
                if (it != null) {
                    ggtjigtjigtji = it.toString()
                    gtgtkgtkogtko.edit().putString("appCamp", ggtjigtjigtji).apply()
                    findNavController().navigate(R.id.action_preeFiillteerrrFragment_to_fiilterrraaaFragment)
                }
            }
        } else {
            findNavController().navigate(R.id.action_preeFiillteerrrFragment_to_fiilterrraaaFragment)
        }
    }

}