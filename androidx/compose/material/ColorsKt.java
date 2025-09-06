package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.o2;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001A\u0088\u0001\u0010\u0010\u001A\u00020\r2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\t\u001A\u00020\u00002\b\b\u0002\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u001A\u0088\u0001\u0010\u0012\u001A\u00020\r2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\t\u001A\u00020\u00002\b\b\u0002\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000F\u001A\u001C\u0010\u0016\u001A\u00020\u0000*\u00020\r2\u0006\u0010\u0013\u001A\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001A\u001A\u0010\u0016\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001A\u001B\u0010\u001B\u001A\u00020\u001A*\u00020\r2\u0006\u0010\u0019\u001A\u00020\rH\u0000¢\u0006\u0004\b\u001B\u0010\u001C\" \u0010\"\u001A\b\u0012\u0004\u0012\u00020\r0\u001D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0015\u0010%\u001A\u00020\u0000*\u00020\r8F¢\u0006\u0006\u001A\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "Landroidx/compose/material/Colors;", "lightColors-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "lightColors", "darkColors-2qZNXz8", "darkColors", "backgroundColor", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material/Colors;J)J", "contentColorFor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "other", "", "updateColorsFrom", "(Landroidx/compose/material/Colors;Landroidx/compose/material/Colors;)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColors", "getPrimarySurface", "(Landroidx/compose/material/Colors;)J", "primarySurface", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,337:1\n658#2:338\n646#2:339\n74#3:340\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n*L\n297#1:338\n297#1:339\n297#1:340\n*E\n"})
public final class ColorsKt {
    public static final ProvidableCompositionLocal a;

    static {
        ColorsKt.a = CompositionLocalKt.staticCompositionLocalOf(o2.x);
    }

    public static final long contentColorFor-4WTKRHQ(@NotNull Colors colors0, long v) {
        if(Color.equals-impl0(v, colors0.getPrimary-0d7_KjU())) {
            return colors0.getOnPrimary-0d7_KjU();
        }
        if(Color.equals-impl0(v, colors0.getPrimaryVariant-0d7_KjU())) {
            return colors0.getOnPrimary-0d7_KjU();
        }
        if(Color.equals-impl0(v, colors0.getSecondary-0d7_KjU())) {
            return colors0.getOnSecondary-0d7_KjU();
        }
        if(Color.equals-impl0(v, colors0.getSecondaryVariant-0d7_KjU())) {
            return colors0.getOnSecondary-0d7_KjU();
        }
        if(Color.equals-impl0(v, colors0.getBackground-0d7_KjU())) {
            return colors0.getOnBackground-0d7_KjU();
        }
        if(Color.equals-impl0(v, colors0.getSurface-0d7_KjU())) {
            return colors0.getOnSurface-0d7_KjU();
        }
        return Color.equals-impl0(v, colors0.getError-0d7_KjU()) ? colors0.getOnError-0d7_KjU() : 0L;
    }

    @Composable
    @ReadOnlyComposable
    public static final long contentColorFor-ek8zF_U(long v, @Nullable Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1A561887, v1, -1, "androidx.compose.material.contentColorFor (Colors.kt:296)");
        }
        long v2 = ColorsKt.contentColorFor-4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer0, 6), v);
        if(v2 == Color.Companion.getUnspecified-0d7_KjU()) {
            v2 = ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v2;
    }

    @NotNull
    public static final Colors darkColors-2qZNXz8(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11) {
        return new Colors(v, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, false, null);
    }

    public static Colors darkColors-2qZNXz8$default(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, int v12, Object object0) {
        long v13 = (v12 & 1) == 0 ? v : 0xFFBB86FC00000000L;
        long v14 = (v12 & 2) == 0 ? v1 : 0xFF3700B300000000L;
        long v15 = (v12 & 4) == 0 ? v2 : 0xFF03DAC600000000L;
        long v16 = (v12 & 8) == 0 ? v3 : v15;
        long v17 = (v12 & 16) == 0 ? v4 : 0xFF12121200000000L;
        long v18 = (v12 & 0x20) == 0 ? v5 : 0xFF12121200000000L;
        long v19 = (v12 & 0x40) == 0 ? v6 : 0xFFCF667900000000L;
        long v20 = (v12 & 0x80) == 0 ? v7 : 0xFF00000000000000L;
        long v21 = (v12 & 0x100) == 0 ? v8 : 0xFF00000000000000L;
        long v22 = (v12 & 0x200) == 0 ? v9 : 0xFFFFFFFF00000000L;
        long v23 = (v12 & 0x400) == 0 ? v10 : 0xFFFFFFFF00000000L;
        return (v12 & 0x800) == 0 ? ColorsKt.darkColors-2qZNXz8(v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v11) : ColorsKt.darkColors-2qZNXz8(v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, 0xFF00000000000000L);
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalColors() {
        return ColorsKt.a;
    }

    // 去混淆评级： 低(20)
    public static final long getPrimarySurface(@NotNull Colors colors0) {
        return colors0.isLight() ? colors0.getPrimary-0d7_KjU() : colors0.getSurface-0d7_KjU();
    }

    @NotNull
    public static final Colors lightColors-2qZNXz8(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11) {
        return new Colors(v, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, true, null);
    }

    // 去混淆评级： 低(20)
    public static Colors lightColors-2qZNXz8$default(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, int v12, Object object0) {
        long v13 = (v12 & 1) == 0 ? v : 0xFF6200EE00000000L;
        long v14 = (v12 & 2) == 0 ? v1 : 0xFF3700B300000000L;
        long v15 = (v12 & 4) == 0 ? v2 : 0xFF03DAC600000000L;
        long v16 = (v12 & 8) == 0 ? v3 : 0xFF01878600000000L;
        long v17 = (v12 & 16) == 0 ? v4 : 0xFFFFFFFF00000000L;
        long v18 = (v12 & 0x20) == 0 ? v5 : 0xFFFFFFFF00000000L;
        long v19 = (v12 & 0x40) == 0 ? v6 : 0xFFB0002000000000L;
        long v20 = (v12 & 0x80) == 0 ? v7 : 0xFFFFFFFF00000000L;
        long v21 = (v12 & 0x100) == 0 ? v8 : 0xFF00000000000000L;
        long v22 = (v12 & 0x200) == 0 ? v9 : 0xFF00000000000000L;
        long v23 = (v12 & 0x400) == 0 ? v10 : 0xFF00000000000000L;
        return (v12 & 0x800) == 0 ? ColorsKt.lightColors-2qZNXz8(v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v11) : ColorsKt.lightColors-2qZNXz8(v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, 0xFFFFFFFF00000000L);
    }

    public static final void updateColorsFrom(@NotNull Colors colors0, @NotNull Colors colors1) {
        colors0.setPrimary-8_81llA$material_release(colors1.getPrimary-0d7_KjU());
        colors0.setPrimaryVariant-8_81llA$material_release(colors1.getPrimaryVariant-0d7_KjU());
        colors0.setSecondary-8_81llA$material_release(colors1.getSecondary-0d7_KjU());
        colors0.setSecondaryVariant-8_81llA$material_release(colors1.getSecondaryVariant-0d7_KjU());
        colors0.setBackground-8_81llA$material_release(colors1.getBackground-0d7_KjU());
        colors0.setSurface-8_81llA$material_release(colors1.getSurface-0d7_KjU());
        colors0.setError-8_81llA$material_release(colors1.getError-0d7_KjU());
        colors0.setOnPrimary-8_81llA$material_release(colors1.getOnPrimary-0d7_KjU());
        colors0.setOnSecondary-8_81llA$material_release(colors1.getOnSecondary-0d7_KjU());
        colors0.setOnBackground-8_81llA$material_release(colors1.getOnBackground-0d7_KjU());
        colors0.setOnSurface-8_81llA$material_release(colors1.getOnSurface-0d7_KjU());
        colors0.setOnError-8_81llA$material_release(colors1.getOnError-0d7_KjU());
        colors0.setLight$material_release(colors1.isLight());
    }
}

