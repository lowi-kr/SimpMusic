package com.arubr.smsvcodes.ui.component

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.arubr.smsvcodes.expect.ui.PlatformBackdrop
import com.arubr.smsvcodes.viewModel.SharedViewModel
import kotlin.reflect.KClass

@Composable
actual fun LiquidGlassAppBottomNavigationBar(
    startDestination: Any,
    navController: NavController,
    backdrop: PlatformBackdrop,
    viewModel: SharedViewModel,
    isScrolledToTop: Boolean,
    onOpenNowPlaying: () -> Unit,
    reloadDestinationIfNeeded: (KClass<*>) -> Unit
) {
}