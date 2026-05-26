plugins {
    id("aiapplication.android.library")
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.aiapplication.di"
}

dependencies {
    implementation(libs.koin.android)
    implementation(libs.koin.compose)
}