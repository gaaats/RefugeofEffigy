package com.tocaboca.tocalifeworlde

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tocaboca.tocalifeworlde.urriila.ViMod
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val gt59gt5955gt by viewModel <ViMod>(named("MainModel"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gt59gt5955gt.fbDeee(this)
    }

}