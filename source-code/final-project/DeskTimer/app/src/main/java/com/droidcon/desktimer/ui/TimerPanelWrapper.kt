package com.droidcon.desktimer.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.droidcon.desktimer.managers.TimerStateManager
import com.droidcon.desktimer.ui.TimerColorOption

@Composable
fun TimerPanelWrapper(
    panelId: String,
    totalSeconds: Int,
    startTimeMs: Long,
    colorOption: TimerColorOption
) {
    val timerState by TimerStateManager.getTimerState(panelId).collectAsState()
    TimerPanel(
        totalSeconds = totalSeconds,
        startTimeMs = startTimeMs,
        timerState = timerState,
        progressColor = colorOption.color
    )
}
