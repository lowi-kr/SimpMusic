package com.arubr.smsvcodes.ui.navigation.graph

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.arubr.smsvcodes.ui.navigation.destination.home.AnalyticsDestination
import com.arubr.smsvcodes.ui.navigation.destination.home.CreditDestination
import com.arubr.smsvcodes.ui.navigation.destination.home.MoodDestination
import com.arubr.smsvcodes.ui.navigation.destination.home.NotificationDestination
import com.arubr.smsvcodes.ui.navigation.destination.home.RecentlySongsDestination
import com.arubr.smsvcodes.ui.navigation.destination.home.SettingsDestination
import com.arubr.smsvcodes.ui.screen.home.MoodScreen
import com.arubr.smsvcodes.ui.screen.home.NotificationScreen
import com.arubr.smsvcodes.ui.screen.home.RecentlySongsScreen
import com.arubr.smsvcodes.ui.screen.home.SettingScreen
import com.arubr.smsvcodes.ui.screen.home.analytics.AnalyticsScreen
import com.arubr.smsvcodes.ui.screen.other.CreditScreen

fun NavGraphBuilder.homeScreenGraph(
    innerPadding: PaddingValues,
    navController: NavController,
) {
    composable<CreditDestination> {
        CreditScreen(
            paddingValues = innerPadding,
            navController = navController,
        )
    }
    composable<MoodDestination> { entry ->
        val params = entry.toRoute<MoodDestination>().params
        MoodScreen(
            navController = navController,
            params = params,
        )
    }
    composable<NotificationDestination> {
        NotificationScreen(
            navController = navController,
        )
    }
    composable<RecentlySongsDestination> {
        RecentlySongsScreen(
            navController = navController,
            innerPadding = innerPadding,
        )
    }
    composable<SettingsDestination> {
        SettingScreen(
            navController = navController,
            innerPadding = innerPadding,
        )
    }
    composable<AnalyticsDestination> {
        AnalyticsScreen(
            navController = navController,
            innerPadding = innerPadding,
        )
    }
}