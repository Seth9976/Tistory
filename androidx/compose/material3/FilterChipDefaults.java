package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilterChipTokens;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00C7\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004J\u008A\u0001\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u00052\b\b\u0002\u0010\f\u001A\u00020\u00052\b\b\u0002\u0010\r\u001A\u00020\u00052\b\b\u0002\u0010\u000E\u001A\u00020\u00052\b\b\u0002\u0010\u000F\u001A\u00020\u00052\b\b\u0002\u0010\u0010\u001A\u00020\u00052\b\b\u0002\u0010\u0011\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013JN\u0010\u001E\u001A\u00020\u001B2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0016\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00142\b\b\u0002\u0010\u0018\u001A\u00020\u00142\b\b\u0002\u0010\u0019\u001A\u00020\u00142\b\b\u0002\u0010\u001A\u001A\u00020\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001DJ^\u0010+\u001A\u00020(2\u0006\u0010 \u001A\u00020\u001F2\u0006\u0010!\u001A\u00020\u001F2\b\b\u0002\u0010\"\u001A\u00020\u00052\b\b\u0002\u0010#\u001A\u00020\u00052\b\b\u0002\u0010$\u001A\u00020\u00052\b\b\u0002\u0010%\u001A\u00020\u00052\b\b\u0002\u0010&\u001A\u00020\u00142\b\b\u0002\u0010\'\u001A\u00020\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b)\u0010*J\u000F\u0010,\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b,\u0010\u0004J\u008A\u0001\u0010,\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u00052\b\b\u0002\u0010\f\u001A\u00020\u00052\b\b\u0002\u0010\r\u001A\u00020\u00052\b\b\u0002\u0010\u000E\u001A\u00020\u00052\b\b\u0002\u0010\u000F\u001A\u00020\u00052\b\b\u0002\u0010\u0010\u001A\u00020\u00052\b\b\u0002\u0010\u0011\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b-\u0010\u0013JN\u0010/\u001A\u00020\u001B2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0016\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00142\b\b\u0002\u0010\u0018\u001A\u00020\u00142\b\b\u0002\u0010\u0019\u001A\u00020\u00142\b\b\u0002\u0010\u001A\u001A\u00020\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b.\u0010\u001DR\u001D\u00104\u001A\u00020\u00148\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R\u001D\u00107\u001A\u00020\u00148\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b5\u00101\u001A\u0004\b6\u00103R\u0018\u0010;\u001A\u00020\u0002*\u0002088@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b9\u0010:R\u0018\u0010=\u001A\u00020\u0002*\u0002088@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b<\u0010:R\u0011\u0010A\u001A\u00020>8G\u00A2\u0006\u0006\u001A\u0004\b?\u0010@\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006B"}, d2 = {"Landroidx/compose/material3/FilterChipDefaults;", "", "Landroidx/compose/material3/SelectableChipColors;", "filterChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "labelColor", "iconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "filterChipColors-XqyqHi0", "(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/ui/unit/Dp;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/SelectableChipElevation;", "filterChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;", "filterChipElevation", "", "enabled", "selected", "borderColor", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "Landroidx/compose/foundation/BorderStroke;", "filterChipBorder-_7El2pE", "(ZZJJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "filterChipBorder", "elevatedFilterChipColors", "elevatedFilterChipColors-XqyqHi0", "elevatedFilterChipElevation-aqJV_2Y", "elevatedFilterChipElevation", "a", "F", "getHeight-D9Ej5fM", "()F", "Height", "b", "getIconSize-D9Ej5fM", "IconSize", "Landroidx/compose/material3/ColorScheme;", "getDefaultFilterChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SelectableChipColors;", "defaultFilterChipColors", "getDefaultElevatedFilterChipColors$material3_release", "defaultElevatedFilterChipColors", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/FilterChipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2787:1\n1#2:2788\n*E\n"})
public final class FilterChipDefaults {
    public static final int $stable;
    @NotNull
    public static final FilterChipDefaults INSTANCE;
    public static final float a;
    public static final float b;

    static {
        FilterChipDefaults.INSTANCE = new FilterChipDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        FilterChipDefaults.a = 0.0f;
        FilterChipDefaults.b = 0.0f;
    }

    @Composable
    @NotNull
    public final SelectableChipColors elevatedFilterChipColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x408C8E49, v, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1430)");
        }
        SelectableChipColors selectableChipColors0 = this.getDefaultElevatedFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColors0;
    }

    // 去混淆评级： 低(37)
    @Composable
    @NotNull
    public final SelectableChipColors elevatedFilterChipColors-XqyqHi0(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, @Nullable Composer composer0, int v12, int v13, int v14) {
        long v15 = (v14 & 4) == 0 ? v2 : 0L;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xC9695D51, v12, v13, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1465)");
        }
        SelectableChipColors selectableChipColors0 = this.getDefaultElevatedFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-daRQuJA(((v14 & 1) == 0 ? v : 0L), ((v14 & 2) == 0 ? v1 : 0L), v15, v15, ((v14 & 8) == 0 ? v3 : 0L), ((v14 & 16) == 0 ? v4 : 0L), ((v14 & 0x20) == 0 ? v5 : 0L), ((v14 & 0x40) == 0 ? v6 : 0L), ((v14 & 0x80) == 0 ? v7 : 0L), ((v14 & 0x100) == 0 ? v8 : 0L), ((v14 & 0x200) == 0 ? v9 : 0L), ((v14 & 0x400) == 0 ? v10 : 0L), ((v14 & 0x800) == 0 ? v11 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColors0;
    }

    @Composable
    @NotNull
    public final SelectableChipElevation elevatedFilterChipElevation-aqJV_2Y(float f, float f1, float f2, float f3, float f4, float f5, @Nullable Composer composer0, int v, int v1) {
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
            ComposerKt.traceEventStart(684803697, v, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipElevation (Chip.kt:1536)");
        }
        SelectableChipElevation selectableChipElevation0 = new SelectableChipElevation(f, f1, f2, f3, f4, f5, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipElevation0;
    }

    @Composable
    @NotNull
    public final BorderStroke filterChipBorder-_7El2pE(boolean z, boolean z1, long v, long v1, long v2, long v3, float f, float f1, @Nullable Composer composer0, int v4, int v5) {
        long v6 = (v5 & 4) == 0 ? v : ColorSchemeKt.getValue(FilterChipTokens.INSTANCE.getFlatUnselectedOutlineColor(), composer0, 6);
        long v7 = (v5 & 16) == 0 ? v2 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilterChipTokens.INSTANCE.getFlatDisabledUnselectedOutlineColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        float f2 = (v5 & 0x40) == 0 ? f : 0.0f;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBC2645D1, v4, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:1415)");
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
    public final SelectableChipColors filterChipColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x98102653, v, -1, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1273)");
        }
        SelectableChipColors selectableChipColors0 = this.getDefaultFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColors0;
    }

    // 去混淆评级： 低(37)
    @Composable
    @NotNull
    public final SelectableChipColors filterChipColors-XqyqHi0(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, @Nullable Composer composer0, int v12, int v13, int v14) {
        long v15 = (v14 & 4) == 0 ? v2 : 0L;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x92D5D607, v12, v13, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1308)");
        }
        SelectableChipColors selectableChipColors0 = this.getDefaultFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-daRQuJA(((v14 & 1) == 0 ? v : 0L), ((v14 & 2) == 0 ? v1 : 0L), v15, v15, ((v14 & 8) == 0 ? v3 : 0L), ((v14 & 16) == 0 ? v4 : 0L), ((v14 & 0x20) == 0 ? v5 : 0L), ((v14 & 0x40) == 0 ? v6 : 0L), ((v14 & 0x80) == 0 ? v7 : 0L), ((v14 & 0x100) == 0 ? v8 : 0L), ((v14 & 0x200) == 0 ? v9 : 0L), ((v14 & 0x400) == 0 ? v10 : 0L), ((v14 & 0x800) == 0 ? v11 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColors0;
    }

    @Composable
    @NotNull
    public final SelectableChipElevation filterChipElevation-aqJV_2Y(float f, float f1, float f2, float f3, float f4, float f5, @Nullable Composer composer0, int v, int v1) {
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
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD2D24327, v, -1, "androidx.compose.material3.FilterChipDefaults.filterChipElevation (Chip.kt:1378)");
        }
        SelectableChipElevation selectableChipElevation0 = new SelectableChipElevation(f, f1, f2, f3, f4, ((v1 & 0x20) == 0 ? f5 : f), null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipElevation0;
    }

    // 去混淆评级： 低(20)
    @NotNull
    public final SelectableChipColors getDefaultElevatedFilterChipColors$material3_release(@NotNull ColorScheme colorScheme0) {
        SelectableChipColors selectableChipColors0 = colorScheme0.getDefaultElevatedFilterChipColorsCached$material3_release();
        if(selectableChipColors0 == null) {
            selectableChipColors0 = new SelectableChipColors(ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getElevatedUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getUnselectedLeadingIconColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getElevatedDisabledContainerColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getDisabledLabelTextColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getDisabledLeadingIconColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getDisabledLeadingIconColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getElevatedSelectedContainerColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getElevatedDisabledContainerColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getSelectedLeadingIconColor()), null);
            colorScheme0.setDefaultElevatedFilterChipColorsCached$material3_release(selectableChipColors0);
        }
        return selectableChipColors0;
    }

    // 去混淆评级： 低(24)
    @NotNull
    public final SelectableChipColors getDefaultFilterChipColors$material3_release(@NotNull ColorScheme colorScheme0) {
        SelectableChipColors selectableChipColors0 = colorScheme0.getDefaultFilterChipColorsCached$material3_release();
        if(selectableChipColors0 == null) {
            selectableChipColors0 = new SelectableChipColors(0L, ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getUnselectedLeadingIconColor()), 0L, Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getDisabledLabelTextColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getDisabledLeadingIconColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getDisabledLeadingIconColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getFlatSelectedContainerColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getFlatDisabledSelectedContainerColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme0, FilterChipTokens.INSTANCE.getSelectedLeadingIconColor()), null);
            colorScheme0.setDefaultFilterChipColorsCached$material3_release(selectableChipColors0);
        }
        return selectableChipColors0;
    }

    public final float getHeight-D9Ej5fM() [...] // 潜在的解密器

    public final float getIconSize-D9Ej5fM() {
        return FilterChipDefaults.b;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA0B6A24B, v, -1, "androidx.compose.material3.FilterChipDefaults.<get-shape> (Chip.kt:1547)");
        }
        Shape shape0 = ShapesKt.getValue(FilterChipTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }
}

