package com.example.navigationdemo

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data object HomeScreen : NavKey

// В этот ключ мы зашили имя (String), чтобы передать его на другой экран
@Serializable
data class WelcomeScreen(val name: String) : NavKey

@Serializable
data object ProfileScreen : NavKey