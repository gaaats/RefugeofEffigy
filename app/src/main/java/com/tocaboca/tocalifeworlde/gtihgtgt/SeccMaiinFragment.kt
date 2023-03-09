package com.tocaboca.tocalifeworlde.gtihgtgt

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tocaboca.tocalifeworlde.R
import com.tocaboca.tocalifeworlde.gtjigtjigtjigt.JOIfjirfjrf
import com.tocaboca.tocalifeworlde.gtjigtjigtjigt.JOIfjirfjrf.hy2hy226j26uj
import com.tocaboca.tocalifeworlde.gtjigtjigtjigt.JOIfjirfjrf.hy59hy59hy595h
import com.tocaboca.tocalifeworlde.urriila.JIofrjfrjirfji
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class SeccMaiinFragment : Fragment() {


    override fun onAttach(context: Context) {
        super.onAttach(context)
        gth5uj99uj = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hy5ju9599559.mainId.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                hy59uj5ki5ki595ik.edit().putString("mainId", main).apply()
            }
        }

        hy5ju9599559.geo.observe(viewLifecycleOwner) {
            Log.d("lolo", "${it}")
            if (it != null) {

                Log.d("lolo", "${it}")

                rfkogtkogtkgtk = it.refugegeo
                frrfjgtjgttgi = it.refugenumerot
                h2uj9959ik5 = it.refugelinkaa

                hy59uj5ki5ki595ik.edit().putString(hy2hy226j26uj, rfkogtkogtkgtk).apply()
                hy59uj5ki5ki595ik.edit().putString(JOIfjirfjrf.xcvvbgt, frrfjgtjgttgi).apply()
                hy59uj5ki5ki595ik.edit().putString(hy59hy59hy595h, h2uj9959ik5).apply()

                findNavController().navigate(R.id.action_seccMaiinFragment_to_preeFiillteerrrFragment)
            }
        }
    }

    val hy5ju9599559 by activityViewModel<JIofrjfrjirfji>(named("MainModel"))
    lateinit var rfkogtkogtkgtk: String
    lateinit var h2uj9959ik5: String
    lateinit var frrfjgtjgttgi: String
    private lateinit var gth5uj99uj: Context

    val hy59uj5ki5ki595ik: SharedPreferences by inject(named("SharedPreferences"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_secc_maiin, container, false)
    }
}