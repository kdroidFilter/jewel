package org.jetbrains.jewel

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.border
import org.jetbrains.jewel.foundation.utils.thenIf

enum class Outline {
    None,
    Focus,
    Warning,
    Error;

    companion object {

        fun of(warning: Boolean, error: Boolean) =
            when {
                error -> Error
                warning -> Warning
                else -> None
            }
    }
}

@Composable
fun Modifier.focusOutline(
    state: InteractiveComponentState,
    outlineShape: Shape = RoundedCornerShape(LocalThemeMetrics.current.outlineCornerSize),
    outlineWidth: Dp = LocalThemeMetrics.current.outlineWidth
): Modifier {
    val outlineColors = LocalThemeColors.current.outlines

    return thenIf(state.isFocused) {
        val outlineColor = outlineColors.focused
        border(Stroke.Alignment.Outside, outlineWidth, outlineColor, outlineShape)
    }
}

@Composable
fun Modifier.outline(
    state: StateWithOutline,
    outlineShape: Shape = RoundedCornerShape(LocalThemeMetrics.current.outlineCornerSize),
    outlineWidth: Dp = LocalThemeMetrics.current.outlineWidth
): Modifier {
    val outlineColors = LocalThemeColors.current.outlines

    return thenIf(state.hasOutline) {
        val outlineColor = when {
            state.isError -> outlineColors.focusedError
            state.isWarning -> outlineColors.focusedWarning
            state.isFocused -> outlineColors.focused
            else -> error("State $state says it has an outline, but doesn't really")
        }
        border(Stroke.Alignment.Outside, outlineWidth, outlineColor, outlineShape)
    }
}