package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00C7\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004JN\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\f\u0010\rJN\u0010\u0018\u001A\u00020\u00152\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u000E2\b\b\u0002\u0010\u0012\u001A\u00020\u000E2\b\b\u0002\u0010\u0013\u001A\u00020\u000E2\b\b\u0002\u0010\u0014\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017J8\u0010!\u001A\u00020\u001E2\u0006\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010\u001B\u001A\u00020\u00052\b\b\u0002\u0010\u001C\u001A\u00020\u00052\b\b\u0002\u0010\u001D\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 J0\u0010!\u001A\u00020\"2\b\b\u0002\u0010\u001B\u001A\u00020\u00052\b\b\u0002\u0010\u001C\u001A\u00020\u00052\b\b\u0002\u0010\u001D\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010$J\u000F\u0010%\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b%\u0010\u0004JN\u0010%\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b&\u0010\rJN\u0010(\u001A\u00020\u00152\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u000E2\b\b\u0002\u0010\u0012\u001A\u00020\u000E2\b\b\u0002\u0010\u0013\u001A\u00020\u000E2\b\b\u0002\u0010\u0014\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\'\u0010\u0017R\u001D\u0010-\u001A\u00020\u000E8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R\u001D\u00100\u001A\u00020\u000E8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b.\u0010*\u001A\u0004\b/\u0010,R\u0018\u00104\u001A\u00020\u0002*\u0002018@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b2\u00103R\u0011\u00108\u001A\u0002058G\u00A2\u0006\u0006\u001A\u0004\b6\u00107\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u00069"}, d2 = {"Landroidx/compose/material3/SuggestionChipDefaults;", "", "Landroidx/compose/material3/ChipColors;", "suggestionChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "labelColor", "iconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledIconContentColor", "suggestionChipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;", "Landroidx/compose/ui/unit/Dp;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/ChipElevation;", "suggestionChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "suggestionChipElevation", "", "enabled", "borderColor", "disabledBorderColor", "borderWidth", "Landroidx/compose/foundation/BorderStroke;", "suggestionChipBorder-h1eT-Ww", "(ZJJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "suggestionChipBorder", "Landroidx/compose/material3/ChipBorder;", "suggestionChipBorder-d_3_b6Q", "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", "elevatedSuggestionChipColors", "elevatedSuggestionChipColors-5tl4gsc", "elevatedSuggestionChipElevation-aqJV_2Y", "elevatedSuggestionChipElevation", "a", "F", "getHeight-D9Ej5fM", "()F", "Height", "b", "getIconSize-D9Ej5fM", "IconSize", "Landroidx/compose/material3/ColorScheme;", "getDefaultElevatedSuggestionChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "defaultElevatedSuggestionChipColors", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SuggestionChipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2787:1\n1#2:2788\n*E\n"})
public final class SuggestionChipDefaults {
    public static final int $stable;
    @NotNull
    public static final SuggestionChipDefaults INSTANCE;
    public static final float a;
    public static final float b;

    static {
        SuggestionChipDefaults.INSTANCE = new SuggestionChipDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        SuggestionChipDefaults.a = 0.0f;
        SuggestionChipDefaults.b = 0.0f;
    }

    @Composable
    @NotNull
    public final ChipColors elevatedSuggestionChipColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x639CFE3F, v, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1857)");
        }
        ChipColors chipColors0 = this.getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColors0;
    }

    // 去混淆评级： 低(30)
    @Composable
    @NotNull
    public final ChipColors elevatedSuggestionChipColors-5tl4gsc(long v, long v1, long v2, long v3, long v4, long v5, @Nullable Composer composer0, int v6, int v7) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4BA9DC15, v6, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1879)");
        }
        ChipColors chipColors0 = this.getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-FD3wquc(((v7 & 1) == 0 ? v : 0L), ((v7 & 2) == 0 ? v1 : 0L), ((v7 & 4) == 0 ? v2 : 0L), 0L, ((v7 & 8) == 0 ? v3 : 0L), ((v7 & 16) == 0 ? v4 : 0L), ((v7 & 0x20) == 0 ? v5 : 0L), 0L);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColors0;
    }

    @Composable
    @NotNull
    public final ChipElevation elevatedSuggestionChipElevation-aqJV_2Y(float f, float f1, float f2, float f3, float f4, float f5, @Nullable Composer composer0, int v, int v1) {
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
            ComposerKt.traceEventStart(1118088467, v, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1932)");
        }
        ChipElevation chipElevation0 = new ChipElevation(f, f1, f2, f3, f4, f5, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipElevation0;
    }

    // 去混淆评级： 低(20)
    @NotNull
    public final ChipColors getDefaultElevatedSuggestionChipColors$material3_release(@NotNull ColorScheme colorScheme0) {
        ChipColors chipColors0 = colorScheme0.getDefaultElevatedSuggestionChipColorsCached$material3_release();
        if(chipColors0 == null) {
            chipColors0 = new ChipColors(ColorSchemeKt.fromToken(colorScheme0, SuggestionChipTokens.INSTANCE.getElevatedContainerColor()), ColorSchemeKt.fromToken(colorScheme0, SuggestionChipTokens.INSTANCE.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, SuggestionChipTokens.INSTANCE.getLeadingIconColor()), 0L, Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, SuggestionChipTokens.INSTANCE.getElevatedDisabledContainerColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, AssistChipTokens.INSTANCE.getDisabledIconColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null);
            colorScheme0.setDefaultElevatedSuggestionChipColorsCached$material3_release(chipColors0);
        }
        return chipColors0;
    }

    public final float getHeight-D9Ej5fM() [...] // 潜在的解密器

    public final float getIconSize-D9Ej5fM() {
        return SuggestionChipDefaults.b;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2637C157, v, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1943)");
        }
        Shape shape0 = ShapesKt.getValue(SuggestionChipTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.WARNING, message = "Maintained for binary compatibility. Use the suggestChipBorder functions instead", replaceWith = @ReplaceWith(expression = "suggestionChipBorder(enabled, borderColor, disabledBorderColor, borderWidth)", imports = {}))
    @NotNull
    public final ChipBorder suggestionChipBorder-d_3_b6Q(long v, long v1, float f, @Nullable Composer composer0, int v2, int v3) {
        long v4 = (v3 & 1) == 0 ? v : ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer0, 6);
        long v5 = (v3 & 2) == 0 ? v1 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1A2EF0CF, v2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1845)");
        }
        ChipBorder chipBorder0 = new ChipBorder(v4, v5, ((v3 & 4) == 0 ? f : 0.0f), null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipBorder0;
    }

    @Composable
    @NotNull
    public final BorderStroke suggestionChipBorder-h1eT-Ww(boolean z, long v, long v1, float f, @Nullable Composer composer0, int v2, int v3) {
        long v4 = (v3 & 2) == 0 ? v : ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer0, 6);
        long v5 = (v3 & 4) == 0 ? v1 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDA02BCC7, v2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1818)");
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
    public final ChipColors suggestionChipColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x725B10C9, v, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1739)");
        }
        ChipColors chipColors0 = ChipKt.getDefaultSuggestionChipColors(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColors0;
    }

    // 去混淆评级： 低(30)
    @Composable
    @NotNull
    public final ChipColors suggestionChipColors-5tl4gsc(long v, long v1, long v2, long v3, long v4, long v5, @Nullable Composer composer0, int v6, int v7) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7036ED4B, v6, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1761)");
        }
        ChipColors chipColors0 = ChipKt.getDefaultSuggestionChipColors(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-FD3wquc(((v7 & 1) == 0 ? v : 0L), ((v7 & 2) == 0 ? v1 : 0L), ((v7 & 4) == 0 ? v2 : 0L), 0L, ((v7 & 8) == 0 ? v3 : 0L), ((v7 & 16) == 0 ? v4 : 0L), ((v7 & 0x20) == 0 ? v5 : 0L), 0L);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColors0;
    }

    @Composable
    @NotNull
    public final ChipElevation suggestionChipElevation-aqJV_2Y(float f, float f1, float f2, float f3, float f4, float f5, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            f = 0.0f;
        }
        if((v1 & 16) != 0) {
            f4 = 0.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x73095F49, v, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1792)");
        }
        ChipElevation chipElevation0 = new ChipElevation(f, ((v1 & 2) == 0 ? f1 : f), ((v1 & 4) == 0 ? f2 : f), ((v1 & 8) == 0 ? f3 : f), f4, ((v1 & 0x20) == 0 ? f5 : f), null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipElevation0;
    }
}

