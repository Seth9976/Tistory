package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00C7\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004J\u0094\u0001\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u00052\b\b\u0002\u0010\f\u001A\u00020\u00052\b\b\u0002\u0010\r\u001A\u00020\u00052\b\b\u0002\u0010\u000E\u001A\u00020\u00052\b\b\u0002\u0010\u000F\u001A\u00020\u00052\b\b\u0002\u0010\u0010\u001A\u00020\u00052\b\b\u0002\u0010\u0011\u001A\u00020\u00052\b\b\u0002\u0010\u0012\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014JN\u0010\u001F\u001A\u00020\u001C2\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0017\u001A\u00020\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00152\b\b\u0002\u0010\u0019\u001A\u00020\u00152\b\b\u0002\u0010\u001A\u001A\u00020\u00152\b\b\u0002\u0010\u001B\u001A\u00020\u0015H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ^\u0010,\u001A\u00020)2\u0006\u0010!\u001A\u00020 2\u0006\u0010\"\u001A\u00020 2\b\b\u0002\u0010#\u001A\u00020\u00052\b\b\u0002\u0010$\u001A\u00020\u00052\b\b\u0002\u0010%\u001A\u00020\u00052\b\b\u0002\u0010&\u001A\u00020\u00052\b\b\u0002\u0010\'\u001A\u00020\u00152\b\b\u0002\u0010(\u001A\u00020\u0015H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b*\u0010+R\u001D\u00101\u001A\u00020\u00158\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u00100R\u001D\u00104\u001A\u00020\u00158\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b2\u0010.\u001A\u0004\b3\u00100R\u001D\u00107\u001A\u00020\u00158\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b5\u0010.\u001A\u0004\b6\u00100R\u0018\u0010;\u001A\u00020\u0002*\u0002088@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b9\u0010:R\u0011\u0010?\u001A\u00020<8G\u00A2\u0006\u0006\u001A\u0004\b=\u0010>\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006@"}, d2 = {"Landroidx/compose/material3/InputChipDefaults;", "", "Landroidx/compose/material3/SelectableChipColors;", "inputChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "inputChipColors-kwJvTHA", "(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/ui/unit/Dp;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/SelectableChipElevation;", "inputChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;", "inputChipElevation", "", "enabled", "selected", "borderColor", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "Landroidx/compose/foundation/BorderStroke;", "inputChipBorder-_7El2pE", "(ZZJJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "inputChipBorder", "a", "F", "getHeight-D9Ej5fM", "()F", "Height", "b", "getIconSize-D9Ej5fM", "IconSize", "c", "getAvatarSize-D9Ej5fM", "AvatarSize", "Landroidx/compose/material3/ColorScheme;", "getDefaultInputChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SelectableChipColors;", "defaultInputChipColors", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/InputChipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2787:1\n1#2:2788\n*E\n"})
public final class InputChipDefaults {
    public static final int $stable;
    @NotNull
    public static final InputChipDefaults INSTANCE;
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        InputChipDefaults.INSTANCE = new InputChipDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        InputChipDefaults.a = 0.0f;
        InputChipDefaults.b = 0.0f;
        InputChipDefaults.c = 0.0f;
    }

    public final float getAvatarSize-D9Ej5fM() {
        return InputChipDefaults.c;
    }

    @NotNull
    public final SelectableChipColors getDefaultInputChipColors$material3_release(@NotNull ColorScheme colorScheme0) {
        SelectableChipColors selectableChipColors0 = colorScheme0.getDefaultInputChipColorsCached$material3_release();
        if(selectableChipColors0 == null) {
            selectableChipColors0 = new SelectableChipColors(0L, ColorSchemeKt.fromToken(colorScheme0, InputChipTokens.INSTANCE.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, InputChipTokens.INSTANCE.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme0, InputChipTokens.INSTANCE.getUnselectedTrailingIconColor()), 0L, Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, InputChipTokens.INSTANCE.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, InputChipTokens.INSTANCE.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, InputChipTokens.INSTANCE.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, InputChipTokens.INSTANCE.getSelectedContainerColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, InputChipTokens.INSTANCE.getDisabledSelectedContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, InputChipTokens.INSTANCE.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, InputChipTokens.INSTANCE.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme0, InputChipTokens.INSTANCE.getSelectedTrailingIconColor()), null);
            colorScheme0.setDefaultInputChipColorsCached$material3_release(selectableChipColors0);
        }
        return selectableChipColors0;
    }

    public final float getHeight-D9Ej5fM() [...] // 潜在的解密器

    public final float getIconSize-D9Ej5fM() {
        return InputChipDefaults.b;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3EBB05EF, v, -1, "androidx.compose.material3.InputChipDefaults.<get-shape> (Chip.kt:1721)");
        }
        Shape shape0 = ShapesKt.getValue(InputChipTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Composable
    @NotNull
    public final BorderStroke inputChipBorder-_7El2pE(boolean z, boolean z1, long v, long v1, long v2, long v3, float f, float f1, @Nullable Composer composer0, int v4, int v5) {
        long v6 = (v5 & 4) == 0 ? v : ColorSchemeKt.getValue(InputChipTokens.INSTANCE.getUnselectedOutlineColor(), composer0, 6);
        long v7 = (v5 & 16) == 0 ? v2 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(InputChipTokens.INSTANCE.getDisabledUnselectedOutlineColor(), composer0, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        float f2 = (v5 & 0x40) == 0 ? f : 0.0f;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2050575347, v4, -1, "androidx.compose.material3.InputChipDefaults.inputChipBorder (Chip.kt:1709)");
        }
        if(!z) {
            v6 = z1 ? ((v5 & 0x20) == 0 ? v3 : 0L) : v7;
        }
        else if(z1) {
            v6 = (v5 & 8) == 0 ? v1 : 0L;
        }
        if(z1) {
            f2 = (v5 & 0x80) == 0 ? f1 : 0.0f;
        }
        BorderStroke borderStroke0 = BorderStrokeKt.BorderStroke-cXLIe8U(f2, v6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStroke0;
    }

    @Composable
    @NotNull
    public final SelectableChipColors inputChipColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD215005D, v, -1, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1568)");
        }
        SelectableChipColors selectableChipColors0 = this.getDefaultInputChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColors0;
    }

    // 去混淆评级： 低(46)
    @Composable
    @NotNull
    public final SelectableChipColors inputChipColors-kwJvTHA(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, @Nullable Composer composer0, int v13, int v14, int v15) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4E405BC6, v13, v14, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1605)");
        }
        SelectableChipColors selectableChipColors0 = this.getDefaultInputChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-daRQuJA(((v15 & 1) == 0 ? v : 0L), ((v15 & 2) == 0 ? v1 : 0L), ((v15 & 4) == 0 ? v2 : 0L), ((v15 & 8) == 0 ? v3 : 0L), ((v15 & 16) == 0 ? v4 : 0L), ((v15 & 0x20) == 0 ? v5 : 0L), ((v15 & 0x40) == 0 ? v6 : 0L), ((v15 & 0x80) == 0 ? v7 : 0L), ((v15 & 0x100) == 0 ? v8 : 0L), ((v15 & 0x200) == 0 ? v9 : 0L), ((v15 & 0x400) == 0 ? v10 : 0L), ((v15 & 0x800) == 0 ? v11 : 0L), ((v15 & 0x1000) == 0 ? v12 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColors0;
    }

    @Composable
    @NotNull
    public final SelectableChipElevation inputChipElevation-aqJV_2Y(float f, float f1, float f2, float f3, float f4, float f5, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            f = 0.0f;
        }
        if((v1 & 16) != 0) {
            f4 = 0.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1745270109, v, -1, "androidx.compose.material3.InputChipDefaults.inputChipElevation (Chip.kt:1672)");
        }
        SelectableChipElevation selectableChipElevation0 = new SelectableChipElevation(f, ((v1 & 2) == 0 ? f1 : f), ((v1 & 4) == 0 ? f2 : f), ((v1 & 8) == 0 ? f3 : f), f4, ((v1 & 0x20) == 0 ? f5 : f), null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipElevation0;
    }
}

