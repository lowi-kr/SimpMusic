package com.arubr.smsvcodes.expect

import com.maxrave.logger.Logger
import com.arubr.smsvcodes.ui.mini_player.MiniPlayerManager

actual fun toggleMiniPlayer() {
    Logger.d("MiniPlayer", "Toggle called, current state: ${MiniPlayerManager.isOpen}")
    MiniPlayerManager.isOpen = !MiniPlayerManager.isOpen
    Logger.d("MiniPlayer", "New state: ${MiniPlayerManager.isOpen}")
}
