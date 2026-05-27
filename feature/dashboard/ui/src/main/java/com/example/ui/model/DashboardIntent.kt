package com.example.ui.model

import com.example.common.presentation.BaseIntent

sealed class DashboardIntent : BaseIntent {
    object LoadData : DashboardIntent()
    data class OnItemClicked(val itemId: String) : DashboardIntent()
}