plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("com.android.tools.build:gradle:8.7.0")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.24")
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "aiapplication.android.app"
            implementationClass = "com.aiapplication.conventions.AndroidApplicationConventionPlugin"
        }
    }
}