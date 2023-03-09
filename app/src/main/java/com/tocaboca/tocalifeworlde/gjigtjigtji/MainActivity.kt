package com.tocaboca.tocalifeworlde.gjigtjigtji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tocaboca.tocalifeworlde.R
import com.tocaboca.tocalifeworlde.urriila.JIofrjfrjirfji
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val gt59gt5955gt by viewModel <JIofrjfrjirfji>(named("MainModel"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gt59gt5955gt.fbDeee(this)
    }

}