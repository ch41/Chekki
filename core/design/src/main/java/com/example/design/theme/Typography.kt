package com.example.design.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 *
 * Headlines: Hanken Grotesk (заголовки)
 * Body: Inter (основной текст)
 * Labels: JetBrains Mono (цифры, даты)
 */

val HankenGrotesk = FontFamily.Default

val Inter = FontFamily.Default
val JetBrainsMono = FontFamily.Monospace

val DisplayLg = TextStyle(
    fontFamily = HankenGrotesk,
    fontSize = 57.sp,
    fontWeight = FontWeight.Bold,
    lineHeight = 64.sp,
    letterSpacing = (-0.25).sp
)

val HeadlineLg = TextStyle(
    fontFamily = HankenGrotesk,
    fontSize = 32.sp,
    fontWeight = FontWeight.SemiBold,
    lineHeight = 40.sp
)

val HeadlineMd = TextStyle(
    fontFamily = HankenGrotesk,
    fontSize = 28.sp,
    fontWeight = FontWeight.SemiBold,
    lineHeight = 36.sp
)

val HeadlineSm = TextStyle(
    fontFamily = HankenGrotesk,
    fontSize = 24.sp,
    fontWeight = FontWeight.SemiBold,
    lineHeight = 32.sp
)

val HeadlineLgMobile = TextStyle(
    fontFamily = HankenGrotesk,
    fontSize = 28.sp,
    fontWeight = FontWeight.SemiBold,
    lineHeight = 34.sp
)

val TitleLg = TextStyle(
    fontFamily = HankenGrotesk,
    fontSize = 22.sp,
    fontWeight = FontWeight.Medium,
    lineHeight = 28.sp
)

val BodyLg = TextStyle(
    fontFamily = Inter,
    fontSize = 16.sp,
    fontWeight = FontWeight.Normal,
    lineHeight = 24.sp,
    letterSpacing = 0.5.sp
)

val BodyMd = TextStyle(
    fontFamily = Inter,
    fontSize = 14.sp,
    fontWeight = FontWeight.Normal,
    lineHeight = 20.sp,
    letterSpacing = 0.25.sp
)

val LabelLg = TextStyle(
    fontFamily = JetBrainsMono,
    fontSize = 14.sp,
    fontWeight = FontWeight.Medium,
    lineHeight = 20.sp
)

val LabelMd = TextStyle(
    fontFamily = JetBrainsMono,
    fontSize = 12.sp,
    fontWeight = FontWeight.Medium,
    lineHeight = 16.sp
)

val AppTypography = androidx.compose.material3.Typography(
    displayLarge = DisplayLg,
    headlineLarge = HeadlineLg,
    headlineMedium = HeadlineMd,
    headlineSmall = HeadlineSm,
    titleLarge = TitleLg,
    bodyLarge = BodyLg,
    bodyMedium = BodyMd,
    labelLarge = LabelLg,
    labelMedium = LabelMd
)
