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


    implementation(project(":core:common"))

    implementation(project(":feature:dashboard:ui"))
    implementation(project(":feature:dashboard:data"))
    implementation(project(":feature:dashboard:domain"))
}