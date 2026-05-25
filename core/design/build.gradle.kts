plugins {
    id("aiapplication.android.library")
}

android {
    namespace = "com.aiapplication.design"
}

dependencies {
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}