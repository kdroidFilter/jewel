package org.jetbrains.jewel.themes.intui.standalone.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.jewel.styling.InputFieldMetrics
import org.jetbrains.jewel.styling.TextAreaColors
import org.jetbrains.jewel.styling.TextAreaStyle
import org.jetbrains.jewel.themes.intui.core.palette.IntUiDarkPalette
import org.jetbrains.jewel.themes.intui.core.palette.IntUiLightPalette
import org.jetbrains.jewel.themes.intui.standalone.IntUiTheme

@Stable
data class IntUiTextAreaStyle(
    override val colors: IntUiTextAreaColors,
    override val metrics: IntUiTextAreaMetrics,
    override val textStyle: TextStyle,
    override val hintTextStyle: TextStyle
) : TextAreaStyle {

    companion object {

        @Composable
        fun light(
            colors: IntUiTextAreaColors = IntUiTextAreaColors.light(),
            metrics: IntUiTextAreaMetrics = IntUiTextAreaMetrics(),
            textStyle: TextStyle = IntUiTheme.defaultTextStyle,
            hintTextStyle: TextStyle = IntUiTheme.defaultTextStyle.copy(fontSize = 12.sp, lineHeight = 16.sp)
        ) = IntUiTextAreaStyle(colors, metrics, textStyle, hintTextStyle)

        @Composable
        fun dark(
            colors: IntUiTextAreaColors = IntUiTextAreaColors.dark(),
            metrics: IntUiTextAreaMetrics = IntUiTextAreaMetrics(),
            textStyle: TextStyle = IntUiTheme.defaultTextStyle,
            hintTextStyle: TextStyle = IntUiTheme.defaultTextStyle.copy(fontSize = 12.sp, lineHeight = 16.sp)
        ) = IntUiTextAreaStyle(colors, metrics, textStyle, hintTextStyle)
    }
}

@Immutable
data class IntUiTextAreaColors(
    override val background: Color,
    override val backgroundDisabled: Color,
    override val backgroundFocused: Color,
    override val backgroundPressed: Color,
    override val backgroundHovered: Color,
    override val backgroundWarning: Color,
    override val backgroundError: Color,
    override val content: Color,
    override val contentDisabled: Color,
    override val contentFocused: Color,
    override val contentPressed: Color,
    override val contentHovered: Color,
    override val contentWarning: Color,
    override val contentError: Color,
    override val border: Color,
    override val borderDisabled: Color,
    override val borderFocused: Color,
    override val borderPressed: Color,
    override val borderHovered: Color,
    override val borderWarning: Color,
    override val borderError: Color,
    override val cursor: Brush,
    override val cursorDisabled: Brush,
    override val cursorFocused: Brush,
    override val cursorPressed: Brush,
    override val cursorHovered: Brush,
    override val cursorWarning: Brush,
    override val cursorError: Brush,
    override val placeholder: Color,
    override val hintContent: Color,
    override val hintContentDisabled: Color
) : TextAreaColors {

    companion object {

        @Composable
        fun light(
            background: Color = IntUiLightPalette.grey(14),
            backgroundDisabled: Color = IntUiLightPalette.grey(13),
            backgroundFocused: Color = background,
            backgroundPressed: Color = background,
            backgroundHovered: Color = background,
            backgroundWarning: Color = background,
            backgroundError: Color = background,
            content: Color = IntUiLightPalette.grey(1),
            contentDisabled: Color = IntUiLightPalette.grey(8),
            contentFocused: Color = content,
            contentPressed: Color = content,
            contentHovered: Color = content,
            contentWarning: Color = content,
            contentError: Color = content,
            border: Color = IntUiLightPalette.grey(9),
            borderDisabled: Color = IntUiLightPalette.grey(11),
            borderFocused: Color = IntUiLightPalette.blue(4),
            borderPressed: Color = border,
            borderHovered: Color = border,
            borderWarning: Color = IntUiLightPalette.yellow(4),
            borderError: Color = IntUiLightPalette.red(4),
            cursor: Brush = SolidColor(IntUiLightPalette.grey(1)),
            cursorDisabled: Brush = cursor,
            cursorFocused: Brush = cursor,
            cursorPressed: Brush = cursor,
            cursorHovered: Brush = cursor,
            cursorWarning: Brush = cursor,
            cursorError: Brush = cursor,
            placeholder: Color = IntUiLightPalette.grey(8),
            hintContent: Color = IntUiLightPalette.grey(7),
            hintContentDisabled: Color = hintContent
        ) = IntUiTextAreaColors(
            background,
            backgroundDisabled,
            backgroundFocused,
            backgroundPressed,
            backgroundHovered,
            backgroundWarning,
            backgroundError,
            content,
            contentDisabled,
            contentFocused,
            contentPressed,
            contentHovered,
            contentWarning,
            contentError,
            border,
            borderDisabled,
            borderFocused,
            borderPressed,
            borderHovered,
            borderWarning,
            borderError,
            cursor,
            cursorDisabled,
            cursorFocused,
            cursorPressed,
            cursorHovered,
            cursorWarning,
            cursorError,
            placeholder,
            hintContent,
            hintContentDisabled
        )

        @Composable
        fun dark(
            background: Color = IntUiDarkPalette.grey(2),
            backgroundDisabled: Color = background,
            backgroundFocused: Color = background,
            backgroundPressed: Color = background,
            backgroundHovered: Color = background,
            backgroundWarning: Color = background,
            backgroundError: Color = background,
            content: Color = IntUiDarkPalette.grey(12),
            contentDisabled: Color = IntUiDarkPalette.grey(7),
            contentFocused: Color = content,
            contentPressed: Color = content,
            contentHovered: Color = content,
            contentWarning: Color = content,
            contentError: Color = content,
            border: Color = IntUiDarkPalette.grey(5),
            borderDisabled: Color = border,
            borderFocused: Color = IntUiDarkPalette.blue(6),
            borderPressed: Color = border,
            borderHovered: Color = border,
            borderWarning: Color = IntUiDarkPalette.yellow(4),
            borderError: Color = IntUiDarkPalette.red(4),
            cursor: Brush = SolidColor(IntUiDarkPalette.grey(12)),
            cursorDisabled: Brush = cursor,
            cursorFocused: Brush = cursor,
            cursorPressed: Brush = cursor,
            cursorHovered: Brush = cursor,
            cursorWarning: Brush = cursor,
            cursorError: Brush = cursor,
            placeholder: Color = IntUiDarkPalette.grey(7),
            hintContent: Color = IntUiDarkPalette.grey(8),
            hintContentDisabled: Color = hintContent
        ) = IntUiTextAreaColors(
            background,
            backgroundDisabled,
            backgroundFocused,
            backgroundPressed,
            backgroundHovered,
            backgroundWarning,
            backgroundError,
            content,
            contentDisabled,
            contentFocused,
            contentPressed,
            contentHovered,
            contentWarning,
            contentError,
            border,
            borderDisabled,
            borderFocused,
            borderPressed,
            borderHovered,
            borderWarning,
            borderError,
            cursor,
            cursorDisabled,
            cursorFocused,
            cursorPressed,
            cursorHovered,
            cursorWarning,
            cursorError,
            placeholder,
            hintContent,
            hintContentDisabled
        )
    }
}

@Stable
data class IntUiTextAreaMetrics(
    override val cornerSize: CornerSize = CornerSize(4.dp),
    override val contentPadding: PaddingValues = PaddingValues(horizontal = 6.dp, vertical = 9.dp),
    override val minSize: DpSize = DpSize(144.dp, 28.dp),
    override val borderWidth: Dp = 1.dp
) : InputFieldMetrics