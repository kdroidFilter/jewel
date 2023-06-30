package org.jetbrains.jewel.themes.intui.standalone.styling

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.RadioButtonState
import org.jetbrains.jewel.styling.OutlineResourcePainterProvider
import org.jetbrains.jewel.styling.RadioButtonButtonColors
import org.jetbrains.jewel.styling.RadioButtonColors
import org.jetbrains.jewel.styling.RadioButtonIcons
import org.jetbrains.jewel.styling.RadioButtonMetrics
import org.jetbrains.jewel.styling.RadioButtonStyle
import org.jetbrains.jewel.themes.intui.core.palette.IntUiDarkPalette
import org.jetbrains.jewel.themes.intui.core.palette.IntUiLightPalette

@Immutable
data class IntUiRadioButtonStyle(
    override val colors: IntUiRadioButtonColors,
    override val metrics: IntUiRadioButtonMetrics,
    override val icons: IntUiRadioButtonIcons
) : RadioButtonStyle {

    companion object {

        @Composable
        fun light(
            colors: IntUiRadioButtonColors = IntUiRadioButtonColors.light(),
            metrics: IntUiRadioButtonMetrics = IntUiRadioButtonMetrics(),
            icons: IntUiRadioButtonIcons = IntUiRadioButtonIcons()
        ) = IntUiRadioButtonStyle(colors, metrics, icons)

        @Composable
        fun dark(
            colors: IntUiRadioButtonColors = IntUiRadioButtonColors.dark(),
            metrics: IntUiRadioButtonMetrics = IntUiRadioButtonMetrics(),
            icons: IntUiRadioButtonIcons = IntUiRadioButtonIcons()
        ) = IntUiRadioButtonStyle(colors, metrics, icons)
    }
}

@Immutable
data class IntUiRadioButtonColors(
    override val content: Color,
    override val contentHovered: Color,
    override val contentDisabled: Color,
    override val contentSelected: Color,
    override val contentSelectedHovered: Color,
    override val contentSelectedDisabled: Color,
    override val buttonColors: IntUiRadioButtonButtonColors
) : RadioButtonColors {

    companion object {

        @Composable
        fun light(
            content: Color = IntUiLightPalette.grey(1),
            contentHovered: Color = IntUiLightPalette.grey(8),
            contentDisabled: Color = content,
            contentSelected: Color = content,
            contentSelectedHovered: Color = content,
            contentSelectedDisabled: Color = content,
            buttonColors: IntUiRadioButtonButtonColors = IntUiRadioButtonButtonColors.light()
        ) = IntUiRadioButtonColors(
            content,
            contentHovered,
            contentDisabled,
            contentSelected,
            contentSelectedHovered,
            contentSelectedDisabled,
            buttonColors
        )

        @Composable
        fun dark(
            content: Color = IntUiDarkPalette.grey(1),
            contentHovered: Color = IntUiDarkPalette.grey(8),
            contentDisabled: Color = content,
            contentSelected: Color = content,
            contentSelectedHovered: Color = content,
            contentSelectedDisabled: Color = content,
            buttonColors: IntUiRadioButtonButtonColors = IntUiRadioButtonButtonColors.dark()
        ) = IntUiRadioButtonColors(
            content,
            contentHovered,
            contentDisabled,
            contentSelected,
            contentSelectedHovered,
            contentSelectedDisabled,
            buttonColors
        )
    }
}

@Immutable
data class IntUiRadioButtonButtonColors(
    override val fill: Color,
    override val fillHovered: Color,
    override val fillDisabled: Color,
    override val fillSelected: Color,
    override val fillSelectedHovered: Color,
    override val fillSelectedDisabled: Color,
    override val border: Color,
    override val borderHovered: Color,
    override val borderDisabled: Color,
    override val borderSelected: Color,
    override val borderSelectedHovered: Color,
    override val borderSelectedDisabled: Color,
    override val markSelected: Color,
    override val markSelectedHovered: Color,
    override val markSelectedDisabled: Color
) : RadioButtonButtonColors {

    companion object {

        @Composable
        fun light(
            fill: Color = IntUiLightPalette.grey(14),
            fillHovered: Color = fill,
            fillDisabled: Color = IntUiLightPalette.grey(13),
            fillSelected: Color = IntUiLightPalette.blue(4),
            fillSelectedHovered: Color = IntUiLightPalette.blue(3),
            fillSelectedDisabled: Color = fillDisabled,
            border: Color = IntUiLightPalette.grey(8),
            borderHovered: Color = IntUiLightPalette.grey(6),
            borderDisabled: Color = IntUiLightPalette.grey(11),
            borderSelected: Color = Color.Unspecified,
            borderSelectedHovered: Color = borderSelected,
            borderSelectedDisabled: Color = borderDisabled,
            markSelected: Color = IntUiLightPalette.grey(14),
            markSelectedHovered: Color = markSelected,
            markSelectedDisabled: Color = IntUiLightPalette.grey(9)
        ) = IntUiRadioButtonButtonColors(
            fill,
            fillHovered,
            fillDisabled,
            fillSelected,
            fillSelectedHovered,
            fillSelectedDisabled,
            border,
            borderHovered,
            borderDisabled,
            borderSelected,
            borderSelectedHovered,
            borderSelectedDisabled,
            markSelected,
            markSelectedHovered,
            markSelectedDisabled
        )

        @Composable
        fun dark(
            fill: Color = Color.Unspecified,
            fillHovered: Color = fill,
            fillDisabled: Color = IntUiDarkPalette.grey(3),
            fillSelected: Color = IntUiDarkPalette.blue(6),
            fillSelectedHovered: Color = IntUiDarkPalette.blue(5),
            fillSelectedDisabled: Color = fillDisabled,
            border: Color = IntUiDarkPalette.grey(6),
            borderHovered: Color = IntUiDarkPalette.grey(9),
            borderDisabled: Color = IntUiDarkPalette.grey(6),
            borderSelected: Color = Color.Unspecified,
            borderSelectedHovered: Color = borderSelected,
            borderSelectedDisabled: Color = borderDisabled,
            markSelected: Color = IntUiDarkPalette.grey(14),
            markSelectedHovered: Color = markSelected,
            markSelectedDisabled: Color = IntUiDarkPalette.grey(7)
        ) = IntUiRadioButtonButtonColors(
            fill,
            fillHovered,
            fillDisabled,
            fillSelected,
            fillSelectedHovered,
            fillSelectedDisabled,
            border,
            borderHovered,
            borderDisabled,
            borderSelected,
            borderSelectedHovered,
            borderSelectedDisabled,
            markSelected,
            markSelectedHovered,
            markSelectedDisabled
        )
    }
}

@Immutable
data class IntUiRadioButtonMetrics(
    override val radioButtonSize: DpSize = DpSize(16.dp, 16.dp),
    override val iconContentGap: Dp = 8.dp
) : RadioButtonMetrics

@Immutable
data class IntUiRadioButtonIcons(
    override val unselected: OutlineResourcePainterProvider<RadioButtonState> = Unselected(),
    override val selected: OutlineResourcePainterProvider<RadioButtonState> = Selected()
) : RadioButtonIcons {

    @Immutable
    data class Unselected(
        override val normal: String = "icons/intui/radio.svg",
        override val disabled: String = "icons/intui/radioDisabled.svg",
        override val focused: String = "icons/intui/radioFocused.svg",
        override val pressed: String = normal,
        override val hovered: String = normal,
        override val warning: String = normal,
        override val error: String = normal
    ) : OutlineResourcePainterProvider<RadioButtonState>()

    @Immutable
    data class Selected(
        override val normal: String = "icons/intui/radioSelected.svg",
        override val disabled: String = "icons/intui/radioSelectedDisabled.svg",
        override val focused: String = "icons/intui/radioSelectedFocused.svg",
        override val pressed: String = normal,
        override val hovered: String = normal,
        override val warning: String = normal,
        override val error: String = normal
    ) : OutlineResourcePainterProvider<RadioButtonState>()
}