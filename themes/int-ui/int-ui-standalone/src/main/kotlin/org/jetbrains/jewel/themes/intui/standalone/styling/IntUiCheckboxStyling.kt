package org.jetbrains.jewel.themes.intui.standalone.styling

import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.CheckboxState
import org.jetbrains.jewel.styling.CheckboxColors
import org.jetbrains.jewel.styling.CheckboxIcons
import org.jetbrains.jewel.styling.CheckboxMetrics
import org.jetbrains.jewel.styling.CheckboxStyle
import org.jetbrains.jewel.styling.OutlineResourcePainterProvider
import org.jetbrains.jewel.styling.StatefulPainterProvider
import org.jetbrains.jewel.themes.intui.core.palette.IntUiDarkPalette
import org.jetbrains.jewel.themes.intui.core.palette.IntUiLightPalette

@Immutable
data class IntUiCheckboxStyle(
    override val colors: IntUiCheckboxColors,
    override val metrics: IntUiCheckboxMetrics,
    override val icons: IntUiCheckboxIcons
) : CheckboxStyle {

    companion object {

        @Composable
        fun light(
            colors: IntUiCheckboxColors = IntUiCheckboxColors.light(),
            metrics: IntUiCheckboxMetrics = IntUiCheckboxMetrics(),
            icons: IntUiCheckboxIcons = IntUiCheckboxIcons()
        ) = IntUiCheckboxStyle(colors, metrics, icons)

        @Composable
        fun dark(
            colors: IntUiCheckboxColors = IntUiCheckboxColors.dark(),
            metrics: IntUiCheckboxMetrics = IntUiCheckboxMetrics(),
            icons: IntUiCheckboxIcons = IntUiCheckboxIcons()
        ) = IntUiCheckboxStyle(colors, metrics, icons)
    }
}

@Immutable
data class IntUiCheckboxColors(
    override val checkboxBackground: Color,
    override val checkboxBackgroundDisabled: Color,
    override val checkboxBackgroundSelected: Color,
    override val content: Color,
    override val contentDisabled: Color,
    override val contentSelected: Color,
    override val checkboxBorder: Color,
    override val checkboxBorderDisabled: Color,
    override val checkboxBorderSelected: Color
) : CheckboxColors {

    companion object {

        @Composable
        fun light(
            background: Color = IntUiLightPalette.grey(14),
            backgroundDisabled: Color = IntUiLightPalette.grey(13),
            backgroundSelected: Color = IntUiLightPalette.blue(4),
            content: Color = IntUiLightPalette.grey(1),
            contentDisabled: Color = IntUiLightPalette.grey(8),
            contentSelected: Color = content,
            checkboxBorder: Color = IntUiLightPalette.grey(8),
            borderDisabled: Color = IntUiLightPalette.grey(11),
            borderSelected: Color = IntUiLightPalette.blue(4)
        ) = IntUiCheckboxColors(
            background,
            backgroundDisabled,
            backgroundSelected,
            content,
            contentDisabled,
            contentSelected,
            checkboxBorder,
            borderDisabled,
            borderSelected
        )

        @Composable
        fun dark(
            background: Color = Color.Unspecified,
            backgroundDisabled: Color = IntUiDarkPalette.grey(3),
            backgroundSelected: Color = IntUiDarkPalette.blue(6),
            content: Color = IntUiDarkPalette.grey(12),
            contentDisabled: Color = IntUiDarkPalette.grey(7),
            contentSelected: Color = content,
            checkboxBorder: Color = IntUiDarkPalette.grey(6),
            borderDisabled: Color = IntUiDarkPalette.grey(6),
            borderSelected: Color = Color.Unspecified
        ) = IntUiCheckboxColors(
            background,
            backgroundDisabled,
            backgroundSelected,
            content,
            contentDisabled,
            contentSelected,
            checkboxBorder,
            borderDisabled,
            borderSelected
        )
    }
}

@Immutable
data class IntUiCheckboxMetrics(
    override val checkboxSize: DpSize = DpSize(20.dp, 20.dp),
    override val checkboxCornerSize: CornerSize = CornerSize(3.dp),
    override val outlineWidth: Dp = 3.dp,
    override val iconContentGap: Dp = 4.dp
) : CheckboxMetrics

@Immutable
data class IntUiCheckboxIcons(
    override val unchecked: StatefulPainterProvider<CheckboxState> = Unchecked(),
    override val checked: StatefulPainterProvider<CheckboxState> = Checked(),
    override val indeterminate: StatefulPainterProvider<CheckboxState> = Indeterminate()
) : CheckboxIcons {

    @Immutable
    data class Unchecked(
        override val normal: String = "icons/intui/checkBox.svg",
        override val disabled: String = "icons/intui/checkBoxDisabled.svg",
        override val focused: String = "icons/intui/checkBoxFocused.svg",
        override val pressed: String = normal,
        override val hovered: String = normal,
        override val warning: String = normal,
        override val error: String = normal
    ) : OutlineResourcePainterProvider<CheckboxState>()

    @Immutable
    data class Checked(
        override val normal: String = "icons/intui/checkBoxSelected.svg",
        override val disabled: String = "icons/intui/checkBoxSelectedDisabled.svg",
        override val focused: String = "icons/intui/checkBoxSelectedFocused.svg",
        override val pressed: String = normal,
        override val hovered: String = normal,
        override val warning: String = normal,
        override val error: String = normal
    ) : OutlineResourcePainterProvider<CheckboxState>()

    @Immutable
    data class Indeterminate(
        override val normal: String = "icons/intui/checkBoxIndeterminateSelected.svg",
        override val disabled: String = "icons/intui/checkBoxIndeterminateSelectedDisabled.svg",
        override val focused: String = "icons/intui/checkBoxIndeterminateSelectedFocused.svg",
        override val pressed: String = normal,
        override val hovered: String = normal,
        override val warning: String = normal,
        override val error: String = normal
    ) : OutlineResourcePainterProvider<CheckboxState>()
}