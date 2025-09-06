package androidx.compose.material3;

import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J²\u0001\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u00052\b\b\u0002\u0010\f\u001A\u00020\u00052\b\b\u0002\u0010\r\u001A\u00020\u00052\b\b\u0002\u0010\u000E\u001A\u00020\u00052\b\b\u0002\u0010\u000F\u001A\u00020\u00052\b\b\u0002\u0010\u0010\u001A\u00020\u00052\b\b\u0002\u0010\u0011\u001A\u00020\u00052\b\b\u0002\u0010\u0012\u001A\u00020\u00052\b\b\u0002\u0010\u0013\u001A\u00020\u00052\b\b\u0002\u0010\u0014\u001A\u00020\u00052\b\b\u0002\u0010\u0015\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001D\u0010\u001D\u001A\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u0018\u0010!\u001A\u00020\u0002*\u00020\u001E8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u001F\u0010 \u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/material3/SwitchDefaults;", "", "Landroidx/compose/material3/SwitchColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SwitchColors;", "Landroidx/compose/ui/graphics/Color;", "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "colors-V1nXRL4", "(JJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SwitchColors;", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getIconSize-D9Ej5fM", "()F", "IconSize", "Landroidx/compose/material3/ColorScheme;", "getDefaultSwitchColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SwitchColors;", "defaultSwitchColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,625:1\n1#2:626\n148#3:627\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchDefaults\n*L\n429#1:627\n*E\n"})
public final class SwitchDefaults {
    public static final int $stable;
    @NotNull
    public static final SwitchDefaults INSTANCE;
    public static final float a;

    static {
        SwitchDefaults.INSTANCE = new SwitchDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        SwitchDefaults.a = 16.0f;
    }

    @Composable
    @NotNull
    public final SwitchColors colors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x19F6020D, v, -1, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:299)");
        }
        SwitchColors switchColors0 = this.getDefaultSwitchColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return switchColors0;
    }

    @Composable
    @NotNull
    public final SwitchColors colors-V1nXRL4(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, @Nullable Composer composer0, int v16, int v17, int v18) {
        long v19 = (v18 & 1) == 0 ? v : ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedHandleColor(), composer0, 6);
        long v20 = (v18 & 2) == 0 ? v1 : ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedTrackColor(), composer0, 6);
        long v21 = (v18 & 8) == 0 ? v3 : ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedIconColor(), composer0, 6);
        long v22 = (v18 & 16) == 0 ? v4 : ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedHandleColor(), composer0, 6);
        long v23 = (v18 & 0x20) == 0 ? v5 : ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedTrackColor(), composer0, 6);
        long v24 = (v18 & 0x40) == 0 ? v6 : ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor(), composer0, 6);
        long v25 = (v18 & 0x80) == 0 ? v7 : ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedIconColor(), composer0, 6);
        long v26 = (v18 & 0x100) == 0 ? v8 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledSelectedHandleColor(), composer0, 6), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer0, 6).getSurface-0d7_KjU());
        long v27 = (v18 & 0x200) == 0 ? v9 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledSelectedTrackColor(), composer0, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer0, 6).getSurface-0d7_KjU());
        long v28 = (v18 & 0x800) == 0 ? v11 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledSelectedIconColor(), composer0, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer0, 6).getSurface-0d7_KjU());
        long v29 = (v18 & 0x1000) == 0 ? v12 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedHandleColor(), composer0, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer0, 6).getSurface-0d7_KjU());
        long v30 = (v18 & 0x2000) == 0 ? v13 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedTrackColor(), composer0, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer0, 6).getSurface-0d7_KjU());
        long v31 = (v18 & 0x4000) == 0 ? v14 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedTrackOutlineColor(), composer0, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer0, 6).getSurface-0d7_KjU());
        long v32 = (v18 & 0x8000) == 0 ? v15 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedIconColor(), composer0, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer0, 6).getSurface-0d7_KjU());
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x73826915, v16, v17, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:362)");
        }
        SwitchColors switchColors0 = new SwitchColors(v19, v20, ((v18 & 4) == 0 ? v2 : 0L), v21, v22, v23, v24, v25, v26, v27, ((v18 & 0x400) == 0 ? v10 : 0L), v28, v29, v30, v31, v32, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return switchColors0;
    }

    @NotNull
    public final SwitchColors getDefaultSwitchColors$material3_release(@NotNull ColorScheme colorScheme0) {
        SwitchColors switchColors0 = colorScheme0.getDefaultSwitchColorsCached$material3_release();
        if(switchColors0 == null) {
            switchColors0 = new SwitchColors(ColorSchemeKt.fromToken(colorScheme0, SwitchTokens.INSTANCE.getSelectedHandleColor()), ColorSchemeKt.fromToken(colorScheme0, SwitchTokens.INSTANCE.getSelectedTrackColor()), 0L, ColorSchemeKt.fromToken(colorScheme0, SwitchTokens.INSTANCE.getSelectedIconColor()), ColorSchemeKt.fromToken(colorScheme0, SwitchTokens.INSTANCE.getUnselectedHandleColor()), ColorSchemeKt.fromToken(colorScheme0, SwitchTokens.INSTANCE.getUnselectedTrackColor()), ColorSchemeKt.fromToken(colorScheme0, SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor()), ColorSchemeKt.fromToken(colorScheme0, SwitchTokens.INSTANCE.getUnselectedIconColor()), ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, SwitchTokens.INSTANCE.getDisabledSelectedHandleColor()), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme0.getSurface-0d7_KjU()), ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, SwitchTokens.INSTANCE.getDisabledSelectedTrackColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme0.getSurface-0d7_KjU()), 0L, ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, SwitchTokens.INSTANCE.getDisabledSelectedIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme0.getSurface-0d7_KjU()), ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, SwitchTokens.INSTANCE.getDisabledUnselectedHandleColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme0.getSurface-0d7_KjU()), ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, SwitchTokens.INSTANCE.getDisabledUnselectedTrackColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme0.getSurface-0d7_KjU()), ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, SwitchTokens.INSTANCE.getDisabledUnselectedTrackOutlineColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme0.getSurface-0d7_KjU()), ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, SwitchTokens.INSTANCE.getDisabledUnselectedIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme0.getSurface-0d7_KjU()), null);
            colorScheme0.setDefaultSwitchColorsCached$material3_release(switchColors0);
        }
        return switchColors0;
    }

    public final float getIconSize-D9Ej5fM() {
        return SwitchDefaults.a;
    }
}

