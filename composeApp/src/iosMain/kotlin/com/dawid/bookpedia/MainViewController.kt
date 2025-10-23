package com.dawid.bookpedia

import androidx.compose.ui.window.ComposeUIViewController
import com.dawid.bookpedia.app.App
import com.dawid.bookpedia.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }) {
    App()
}