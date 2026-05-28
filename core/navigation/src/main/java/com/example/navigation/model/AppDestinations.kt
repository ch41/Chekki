package com.example.navigation.model

import kotlinx.serialization.Serializable

@Serializable
sealed class AppDestinations {

    @Serializable
    data object Dashboard : AppDestinations()

    @Serializable
    data object Scanner : AppDestinations()

}
