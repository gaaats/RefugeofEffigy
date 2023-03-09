package com.tocaboca.tocalifeworlde

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tocaboca.tocalifeworlde.Util.codeCode
import com.tocaboca.tocalifeworlde.Util.urlMain
import com.tocaboca.tocalifeworlde.urriila.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class SeccMaiinFragment : Fragment() {
    val viewMainModel by activityViewModel<ViMod>(named("MainModel"))
    lateinit var countryDev: String
    lateinit var wv: String
    lateinit var apps: String
    private lateinit var mContext: Context

    val shareP: SharedPreferences by inject(named("SharedPreferences"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_secc_maiin, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewMainModel.mainId.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                shareP.edit().putString("mainId", main).apply()
            }
        }

        viewMainModel.geo.observe(viewLifecycleOwner) {
            Log.d("lolo", "${it}")
            if (it != null) {

                Log.d("lolo", "${it}")

                countryDev = it.refugegeo
                apps = it.refugenumerot
                wv = it.refugelinkaa

                shareP.edit().putString(codeCode, countryDev).apply()
                shareP.edit().putString(Util.apps, apps).apply()
                shareP.edit().putString(urlMain, wv).apply()

                findNavController().navigate(R.id.action_seccMaiinFragment_to_preeFiillteerrrFragment)
            }
        }
    }
}