package com.example.di

import com.example.ui.viewModel.DashboardViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel<DashboardViewModel> { DashboardViewModel() }

}