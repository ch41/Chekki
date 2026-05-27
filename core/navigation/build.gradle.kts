plugins {
    id("aiapplication.android.library")
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.aiapplication.navigation"
}

dependencies {
    implementation(libs.androidx.navigation.compose)
    implementation(libs.kotlinx.serialization.json)

    implementation(libs.kotlinx.serialization.json)
}