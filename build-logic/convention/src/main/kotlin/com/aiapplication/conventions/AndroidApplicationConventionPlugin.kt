package com.aiapplication.conventions

import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {

            pluginManager.apply("com.android.application")

            extensions.configure<ApplicationExtension> {
                compileSdk = 36

                defaultConfig {
                    targetSdk = 36
                    minSdk = 27
                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                }

                compileOptions {
                    sourceCompatibility = JavaVersion.VERSION_17
                    targetCompatibility = JavaVersion.VERSION_17
                }
                buildFeatures {
                    compose = true
                }
            }

            extensions.configure<KotlinAndroidProjectExtension> {
                compilerOptions {
                    jvmTarget.set(JvmTarget.JVM_17)
                }
            }

            dependencies {
                add("implementation", "androidx.core:core-ktx:1.12.0")
                add("implementation", "org.jetbrains.kotlin:kotlin-stdlib")

                //compose
                add("implementation", platform("androidx.compose:compose-bom:2025.02.00"))
                add("implementation", "androidx.compose.ui:ui")
                add("implementation", "androidx.compose.ui:ui-graphics")
                add("implementation", "androidx.compose.material3:material3")
                add("implementation", "androidx.compose.ui:ui-tooling-preview")
                add("implementation", "androidx.activity:activity-compose:1.10.0")
                add("debugImplementation", "androidx.compose.ui:ui-tooling")
            }
        }
    }
}