package com.tocaboca.tocalifeworlde

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tocaboca.tocalifeworlde.Util.apps
import com.tocaboca.tocalifeworlde.urriila.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class PreeFiillteerrrFragment : Fragment() {
    val viewMainModel by activityViewModel<ViMod>(named("MainModel"))
    val shareP: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var appCamp: String
    private lateinit var mContext: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pree_fiillteerrr, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val checkFly = shareP.getString(apps, null)
        val appsCamp = shareP.getString("appCamp", null)

        if (checkFly=="1" &&appsCamp == null) {
            viewMainModel.convers(mContext)
            viewMainModel.appsData.observe(viewLifecycleOwner) {
                if (it != null) {
                    appCamp = it.toString()
                    shareP.edit().putString("appCamp", appCamp).apply()
                    findNavController().navigate(R.id.action_preeFiillteerrrFragment_to_fiilterrraaaFragment)
                }
            }
        } else {
            findNavController().navigate(R.id.action_preeFiillteerrrFragment_to_fiilterrraaaFragment)
        }
    }

}