package com.streamvault.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF7C3AED),
    onPrimary = Color.White,
    primaryContainer = Color(0xFF6D28D9),
    onPrimaryContainer = Color(0xFFEDE9FE),
    secondary = Color(0xFF06B6D4),
    onSecondary = Color.White,
    secondaryContainer = Color(0xFF0891B2),
    onSecondaryContainer = Color(0xFFCFFAFE),
    tertiary = Color(0xFFEC4899),
    onTertiary = Color.White,
    tertiaryContainer = Color(0xFFBE185D),
    onTertiaryContainer = Color(0xFFFCE7F3),
    error = Color(0xFFEF4444),
    onError = Color.White,
    errorContainer = Color(0xFFDC2626),
    onErrorContainer = Color(0xFFFEE2E2),
    background = Color(0xFF0F172A),
    onBackground = Color(0xFFF1F5F9),
    surface = Color(0xFF1E293B),
    onSurface = Color(0xFFF1F5F9),
)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF7C3AED),
    onPrimary = Color.White,
    primaryContainer = Color(0xFFEDE9FE),
    onPrimaryContainer = Color(0xFF4C1D95),
    secondary = Color(0xFF0891B2),
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFCFFAFE),
    onSecondaryContainer = Color(0xFF003D4D),
    tertiary = Color(0xFFEC4899),
    onTertiary = Color.White,
    tertiaryContainer = Color(0xFFFCE7F3),
    onTertiaryContainer = Color(0xFF500724),
    error = Color(0xFFEF4444),
    onError = Color.White,
    errorContainer = Color(0xFFFEE2E2),
    onErrorContainer = Color(0xFF7F1D1D),
    background = Color(0xFFF8FAFC),
    onBackground = Color(0xFF0F172A),
    surface = Color(0xFFFAFAFA),
    onSurface = Color(0xFF1E293B),
)

@Composable
fun StreamVaultTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        typography = StreamVaultTypography,
        content = content
    )
}