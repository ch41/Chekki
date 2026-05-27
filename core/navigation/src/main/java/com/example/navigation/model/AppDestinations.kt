package com.example.navigation.model

import kotlinx.serialization.Serializable

@Serializable
sealed class AppDestinations {

    @Serializable
    data object Dashboard : AppDestinations()

    @Serializable
    data object Scanner : AppDestinations()

    @Serializable
    data object Receipts : AppDestinations()

    @Serializable
    data object Analytics : AppDestinations()

    @Serializable
    data object Settings : AppDestinations()

    @Serializable
    data class ReceiptDetails(val receiptId: String) : AppDestinations()

    @Serializable
    data class CategoryAnalytics(val categoryId: String, val categoryName: String) : AppDestinations()


    @Serializable
    data object EditCategories : AppDestinations()

    @Serializable
    data object ExportData : AppDestinations()
}
