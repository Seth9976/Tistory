package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00C7\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004Jb\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u00052\b\b\u0002\u0010\f\u001A\u00020\u00052\b\b\u0002\u0010\r\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000FJN\u0010\u001A\u001A\u00020\u00172\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0012\u001A\u00020\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u00102\b\b\u0002\u0010\u0014\u001A\u00020\u00102\b\b\u0002\u0010\u0015\u001A\u00020\u00102\b\b\u0002\u0010\u0016\u001A\u00020\u0010H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019J8\u0010#\u001A\u00020 2\u0006\u0010\u001C\u001A\u00020\u001B2\b\b\u0002\u0010\u001D\u001A\u00020\u00052\b\b\u0002\u0010\u001E\u001A\u00020\u00052\b\b\u0002\u0010\u001F\u001A\u00020\u0010H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\"J0\u0010#\u001A\u00020$2\b\b\u0002\u0010\u001D\u001A\u00020\u00052\b\b\u0002\u0010\u001E\u001A\u00020\u00052\b\b\u0002\u0010\u001F\u001A\u00020\u0010H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&J\u000F\u0010\'\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\'\u0010\u0004Jb\u0010\'\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u00052\b\b\u0002\u0010\f\u001A\u00020\u00052\b\b\u0002\u0010\r\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010\u000FJN\u0010*\u001A\u00020\u00172\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0012\u001A\u00020\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u00102\b\b\u0002\u0010\u0014\u001A\u00020\u00102\b\b\u0002\u0010\u0015\u001A\u00020\u00102\b\b\u0002\u0010\u0016\u001A\u00020\u0010H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b)\u0010\u0019R\u001D\u0010/\u001A\u00020\u00108\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.R\u001D\u00102\u001A\u00020\u00108\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b0\u0010,\u001A\u0004\b1\u0010.R\u0018\u00106\u001A\u00020\u0002*\u0002038@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b4\u00105R\u0018\u00108\u001A\u00020\u0002*\u0002038@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b7\u00105R\u0011\u0010<\u001A\u0002098G\u00A2\u0006\u0006\u001A\u0004\b:\u0010;\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006="}, d2 = {"Landroidx/compose/material3/AssistChipDefaults;", "", "Landroidx/compose/material3/ChipColors;", "assistChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "labelColor", "leadingIconContentColor", "trailingIconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconContentColor", "disabledTrailingIconContentColor", "assistChipColors-oq7We08", "(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;", "Landroidx/compose/ui/unit/Dp;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/ChipElevation;", "assistChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "assistChipElevation", "", "enabled", "borderColor", "disabledBorderColor", "borderWidth", "Landroidx/compose/foundation/BorderStroke;", "assistChipBorder-h1eT-Ww", "(ZJJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "assistChipBorder", "Landroidx/compose/material3/ChipBorder;", "assistChipBorder-d_3_b6Q", "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", "elevatedAssistChipColors", "elevatedAssistChipColors-oq7We08", "elevatedAssistChipElevation-aqJV_2Y", "elevatedAssistChipElevation", "a", "F", "getHeight-D9Ej5fM", "()F", "Height", "b", "getIconSize-D9Ej5fM", "IconSize", "Landroidx/compose/material3/ColorScheme;", "getDefaultAssistChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "defaultAssistChipColors", "getDefaultElevatedAssistChipColors$material3_release", "defaultElevatedAssistChipColors", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/AssistChipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2787:1\n1#2:2788\n*E\n"})
public final class AssistChipDefaults {
    public static final int $stable;
    @NotNull
    public static final AssistChipDefaults INSTANCE;
    public static final float a;
    public static final float b;

    static {
        AssistChipDefaults.INSTANCE = new AssistChipDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        AssistChipDefaults.a = 0.0f;
        AssistChipDefaults.b = 0.0f;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.WARNING, message = "Maintained for binary compatibility. Use the assistChipBorder function that returns BorderStroke instead", replaceWith = @ReplaceWith(expression = "assistChipBorder(enabled, borderColor, disabledBorderColor, borderWidth)", imports = {}))
    @NotNull
    public final ChipBorder assistChipBorder-d_3_b6Q(long v, long v1, float f, @Nullable Composer composer0, int v2, int v3) {
        long v4 = (v3 & 1) == 0 ? v : ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer0, 6);
        long v5 = (v3 & 2) == 0 ? v1 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x16CA8BEF, v2, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1152)");
        }
        ChipBorder chipBorder0 = new ChipBorder(v4, v5, ((v3 & 4) == 0 ? f : 0.0f), null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipBorder0;
    }

    @Composable
    @NotNull
    public final BorderStroke assistChipBorder-h1eT-Ww(boolean z, long v, long v1, float f, @Nullable Composer composer0, int v2, int v3) {
        long v4 = (v3 & 2) == 0 ? v : ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer0, 6);
        long v5 = (v3 & 4) == 0 ? v1 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA90EC627, v2, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1124)");
        }
        if(!z) {
            v4 = v5;
        }
        BorderStroke borderStroke0 = BorderStrokeKt.BorderStroke-cXLIe8U(((v3 & 8) == 0 ? f : 0.0f), v4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStroke0;
    }

    @Composable
    @NotNull
    public final ChipColors assistChipColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1961061417, v, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:1019)");
        }
        ChipColors chipColors0 = this.getDefaultAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColors0;
    }

    // 去混淆评级： 低(30)
    @Composable
    @NotNull
    public final ChipColors assistChipColors-oq7We08(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, @Nullable Composer composer0, int v8, int v9) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE8A66F43, v8, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:1045)");
        }
        ChipColors chipColors0 = this.getDefaultAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-FD3wquc(((v9 & 1) == 0 ? v : 0L), ((v9 & 2) == 0 ? v1 : 0L), ((v9 & 4) == 0 ? v2 : 0L), ((v9 & 8) == 0 ? v3 : 0L), ((v9 & 16) == 0 ? v4 : 0L), ((v9 & 0x20) == 0 ? v5 : 0L), ((v9 & 0x40) == 0 ? v6 : 0L), ((v9 & 0x80) == 0 ? v7 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColors0;
    }

    @Composable
    @NotNull
    public final ChipElevation assistChipElevation-aqJV_2Y(float f, float f1, float f2, float f3, float f4, float f5, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            f = 0.0f;
        }
        if((v1 & 16) != 0) {
            f4 = 0.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE9FFD53, v, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:1098)");
        }
        ChipElevation chipElevation0 = new ChipElevation(f, ((v1 & 2) == 0 ? f1 : f), ((v1 & 4) == 0 ? f2 : f), ((v1 & 8) == 0 ? f3 : f), f4, ((v1 & 0x20) == 0 ? f5 : f), null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipElevation0;
    }

    @Composable
    @NotNull
    public final ChipColors elevatedAssistChipColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x270D2F9F, v, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1163)");
        }
        ChipColors chipColors0 = this.getDefaultElevatedAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColors0;
    }

    // 去混淆评级： 低(25)
    @Composable
    @NotNull
    public final ChipColors elevatedAssistChipColors-oq7We08(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, @Nullable Composer composer0, int v8, int v9) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE010E90D, v8, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1189)");
        }
        ColorScheme colorScheme0 = MaterialTheme.INSTANCE.getColorScheme(composer0, 6);
        ChipColors chipColors0 = SuggestionChipDefaults.INSTANCE.getDefaultElevatedSuggestionChipColors$material3_release(colorScheme0).copy-FD3wquc(((v9 & 1) == 0 ? v : 0L), ((v9 & 2) == 0 ? v1 : 0L), ((v9 & 4) == 0 ? v2 : 0L), ((v9 & 8) == 0 ? v3 : 0L), ((v9 & 16) == 0 ? v4 : 0L), ((v9 & 0x20) == 0 ? v5 : 0L), ((v9 & 0x40) == 0 ? v6 : 0L), ((v9 & 0x80) == 0 ? v7 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColors0;
    }

    @Composable
    @NotNull
    public final ChipElevation elevatedAssistChipElevation-aqJV_2Y(float f, float f1, float f2, float f3, float f4, float f5, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            f = 0.0f;
        }
        if((v1 & 2) != 0) {
            f1 = 0.0f;
        }
        if((v1 & 4) != 0) {
            f2 = 0.0f;
        }
        if((v1 & 8) != 0) {
            f3 = 0.0f;
        }
        if((v1 & 16) != 0) {
            f4 = 0.0f;
        }
        if((v1 & 0x20) != 0) {
            f5 = 0.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1457698077, v, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:1244)");
        }
        ChipElevation chipElevation0 = new ChipElevation(f, f1, f2, f3, f4, f5, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipElevation0;
    }

    // 去混淆评级： 低(20)
    @NotNull
    public final ChipColors getDefaultAssistChipColors$material3_release(@NotNull ColorScheme colorScheme0) {
        ChipColors chipColors0 = colorScheme0.getDefaultAssistChipColorsCached$material3_release();
        if(chipColors0 == null) {
            chipColors0 = new ChipColors(0L, ColorSchemeKt.fromToken(colorScheme0, AssistChipTokens.INSTANCE.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, AssistChipTokens.INSTANCE.getIconColor()), ColorSchemeKt.fromToken(colorScheme0, AssistChipTokens.INSTANCE.getIconColor()), 0L, Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, AssistChipTokens.INSTANCE.getDisabledLabelTextColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, AssistChipTokens.INSTANCE.getDisabledIconColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, AssistChipTokens.INSTANCE.getDisabledIconColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultAssistChipColorsCached$material3_release(chipColors0);
        }
        return chipColors0;
    }

    @NotNull
    public final ChipColors getDefaultElevatedAssistChipColors$material3_release(@NotNull ColorScheme colorScheme0) {
        ChipColors chipColors0 = colorScheme0.getDefaultElevatedAssistChipColorsCached$material3_release();
        if(chipColors0 == null) {
            chipColors0 = new ChipColors(ColorSchemeKt.fromToken(colorScheme0, AssistChipTokens.INSTANCE.getElevatedContainerColor()), ColorSchemeKt.fromToken(colorScheme0, AssistChipTokens.INSTANCE.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, AssistChipTokens.INSTANCE.getIconColor()), ColorSchemeKt.fromToken(colorScheme0, AssistChipTokens.INSTANCE.getIconColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, AssistChipTokens.INSTANCE.getElevatedDisabledContainerColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, AssistChipTokens.INSTANCE.getDisabledLabelTextColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, AssistChipTokens.INSTANCE.getDisabledIconColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, AssistChipTokens.INSTANCE.getDisabledIconColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultElevatedAssistChipColorsCached$material3_release(chipColors0);
        }
        return chipColors0;
    }

    public final float getHeight-D9Ej5fM() [...] // 潜在的解密器

    public final float getIconSize-D9Ej5fM() {
        return AssistChipDefaults.b;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7680D23C, v, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:1255)");
        }
        Shape shape0 = ShapesKt.getValue(AssistChipTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }
}

