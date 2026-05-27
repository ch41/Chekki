package com.example.ui.model

import com.example.common.presentation.BaseEffect

sealed class DashboardEffect : BaseEffect {
    data object NavigateToScanner : DashboardEffect()
}