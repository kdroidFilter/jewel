package org.jetbrains.jewel.themes.intui.standalone.styling

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.styling.GroupHeaderColors
import org.jetbrains.jewel.styling.GroupHeaderMetrics
import org.jetbrains.jewel.styling.GroupHeaderStyle
import org.jetbrains.jewel.themes.intui.core.palette.IntUiDarkPalette
import org.jetbrains.jewel.themes.intui.core.palette.IntUiLightPalette

@Immutable
data class IntUiGroupHeaderStyle(
    override val colors: IntUiGroupHeaderColors,
    override val metrics: IntUiGroupHeaderMetrics
) : GroupHeaderStyle {

    companion object {

        @Composable
        fun light(
            colors: IntUiGroupHeaderColors = IntUiGroupHeaderColors.light(),
            metrics: IntUiGroupHeaderMetrics = IntUiGroupHeaderMetrics()
        ) = IntUiGroupHeaderStyle(colors, metrics)

        @Composable
        fun dark(
            colors: IntUiGroupHeaderColors = IntUiGroupHeaderColors.dark(),
            metrics: IntUiGroupHeaderMetrics = IntUiGroupHeaderMetrics()
        ) = IntUiGroupHeaderStyle(colors, metrics)
    }
}

@Immutable
data class IntUiGroupHeaderColors(
    override val content: Color,
    override val divider: Color
) : GroupHeaderColors {

    companion object {

        @Composable
        fun light(
            content: Color = IntUiLightPalette.grey(1),
            divider: Color = IntUiLightPalette.grey(12)
        ) = IntUiGroupHeaderColors(content, divider)

        @Composable
        fun dark(
            content: Color = IntUiDarkPalette.grey(12),
            divider: Color = IntUiDarkPalette.grey(3)
        ) = IntUiGroupHeaderColors(content, divider)
    }
}

@Immutable
data class IntUiGroupHeaderMetrics(
    override val dividerThickness: Dp = 1.dp,
    override val indent: Dp = 8.dp
) : GroupHeaderMetrics