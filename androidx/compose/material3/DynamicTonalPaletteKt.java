package androidx.compose.material3;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.core.math.MathUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zd.c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000B\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0017\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001A\u0017\u0010\b\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\u0007\u001A \u0010\u000E\u001A\u00020\t*\u00020\t2\b\b\u0001\u0010\u000B\u001A\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001A\u0017\u0010\u0010\u001A\u00020\u00052\u0006\u0010\u000F\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001A\u0017\u0010\u0012\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u0000H\u0001¢\u0006\u0004\b\u0012\u0010\u0007\u001A\u0017\u0010\u0013\u001A\u00020\u00052\u0006\u0010\u000F\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\u0013\u0010\u0011\u001A\u0017\u0010\u0014\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u0000H\u0001¢\u0006\u0004\b\u0014\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/compose/material3/TonalPalette;", "dynamicTonalPalette", "(Landroid/content/Context;)Landroidx/compose/material3/TonalPalette;", "Landroidx/compose/material3/ColorScheme;", "dynamicLightColorScheme", "(Landroid/content/Context;)Landroidx/compose/material3/ColorScheme;", "dynamicDarkColorScheme", "Landroidx/compose/ui/graphics/Color;", "", "newLuminance", "setLuminance-DxMtmZc", "(JF)J", "setLuminance", "tonalPalette", "dynamicLightColorScheme31", "(Landroidx/compose/material3/TonalPalette;)Landroidx/compose/material3/ColorScheme;", "dynamicLightColorScheme34", "dynamicDarkColorScheme31", "dynamicDarkColorScheme34", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "DynamicTonalPaletteKt")
@SourceDebugExtension({"SMAP\nDynamicTonalPalette.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicTonalPalette.android.kt\nandroidx/compose/material3/DynamicTonalPaletteKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/Color\n*L\n1#1,530:1\n235#2:531\n239#2:532\n*S KotlinDebug\n*F\n+ 1 DynamicTonalPalette.android.kt\nandroidx/compose/material3/DynamicTonalPaletteKt\n*L\n266#1:531\n267#1:532\n*E\n"})
public final class DynamicTonalPaletteKt {
    @RequiresApi(0x1F)
    @NotNull
    public static final ColorScheme dynamicDarkColorScheme(@NotNull Context context0) {
        return Build.VERSION.SDK_INT < 34 ? DynamicTonalPaletteKt.dynamicDarkColorScheme31(DynamicTonalPaletteKt.dynamicTonalPalette(context0)) : DynamicTonalPaletteKt.dynamicDarkColorScheme34(context0);
    }

    @RequiresApi(0x1F)
    @NotNull
    public static final ColorScheme dynamicDarkColorScheme31(@NotNull TonalPalette tonalPalette0) {
        return ColorSchemeKt.darkColorScheme-C-Xl9yA$default(tonalPalette0.getPrimary80-0d7_KjU(), tonalPalette0.getPrimary20-0d7_KjU(), tonalPalette0.getPrimary30-0d7_KjU(), tonalPalette0.getPrimary90-0d7_KjU(), tonalPalette0.getPrimary40-0d7_KjU(), tonalPalette0.getSecondary80-0d7_KjU(), tonalPalette0.getSecondary20-0d7_KjU(), tonalPalette0.getSecondary30-0d7_KjU(), tonalPalette0.getSecondary90-0d7_KjU(), tonalPalette0.getTertiary80-0d7_KjU(), tonalPalette0.getTertiary20-0d7_KjU(), tonalPalette0.getTertiary30-0d7_KjU(), tonalPalette0.getTertiary90-0d7_KjU(), tonalPalette0.getNeutralVariant6-0d7_KjU(), tonalPalette0.getNeutralVariant90-0d7_KjU(), tonalPalette0.getNeutralVariant6-0d7_KjU(), tonalPalette0.getNeutralVariant90-0d7_KjU(), tonalPalette0.getNeutralVariant30-0d7_KjU(), tonalPalette0.getNeutralVariant80-0d7_KjU(), tonalPalette0.getPrimary80-0d7_KjU(), tonalPalette0.getNeutralVariant90-0d7_KjU(), tonalPalette0.getNeutralVariant20-0d7_KjU(), 0L, 0L, 0L, 0L, tonalPalette0.getNeutralVariant60-0d7_KjU(), tonalPalette0.getNeutralVariant30-0d7_KjU(), tonalPalette0.getNeutralVariant0-0d7_KjU(), tonalPalette0.getNeutralVariant24-0d7_KjU(), tonalPalette0.getNeutralVariant12-0d7_KjU(), tonalPalette0.getNeutralVariant17-0d7_KjU(), tonalPalette0.getNeutralVariant22-0d7_KjU(), tonalPalette0.getNeutralVariant10-0d7_KjU(), tonalPalette0.getNeutralVariant4-0d7_KjU(), tonalPalette0.getNeutralVariant6-0d7_KjU(), 0x3C00000, 0, null);
    }

    @RequiresApi(34)
    @NotNull
    public static final ColorScheme dynamicDarkColorScheme34(@NotNull Context context0) {
        l4 l40 = l4.a;
        long v = l40.a(context0, 0x106008B);
        long v1 = l40.a(context0, 0x106008C);
        long v2 = l40.a(context0, 0x1060089);
        long v3 = l40.a(context0, 0x106008A);
        long v4 = l40.a(context0, 0x1060060);
        long v5 = l40.a(context0, 0x106008F);
        long v6 = l40.a(context0, 0x1060090);
        long v7 = l40.a(context0, 0x106008D);
        long v8 = l40.a(context0, 0x106008E);
        long v9 = l40.a(context0, 0x1060093);
        long v10 = l40.a(context0, 0x1060094);
        long v11 = l40.a(context0, 0x1060091);
        long v12 = l40.a(context0, 0x1060092);
        long v13 = l40.a(context0, 0x1060095);
        long v14 = l40.a(context0, 0x1060096);
        long v15 = l40.a(context0, 0x1060097);
        long v16 = l40.a(context0, 0x1060098);
        long v17 = l40.a(context0, 0x10600A0);
        long v18 = l40.a(context0, 0x10600A1);
        long v19 = l40.a(context0, 0x106006C);
        long v20 = l40.a(context0, 0x106006D);
        long v21 = l40.a(context0, 0x10600A2);
        long v22 = l40.a(context0, 0x10600C1);
        long v23 = l40.a(context0, 0x106009E);
        long v24 = l40.a(context0, 0x106009F);
        long v25 = l40.a(context0, 0x106009B);
        long v26 = l40.a(context0, 0x106009C);
        long v27 = l40.a(context0, 0x106009D);
        long v28 = l40.a(context0, 0x1060099);
        long v29 = l40.a(context0, 0x106009A);
        return ColorSchemeKt.darkColorScheme-C-Xl9yA$default(v, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, l40.a(context0, 0x106008B), v19, v20, 0L, 0L, 0L, 0L, v21, v22, 0L, v23, v25, v26, v27, v28, v29, v24, 0x13C00000, 0, null);
    }

    @RequiresApi(0x1F)
    @NotNull
    public static final ColorScheme dynamicLightColorScheme(@NotNull Context context0) {
        return Build.VERSION.SDK_INT < 34 ? DynamicTonalPaletteKt.dynamicLightColorScheme31(DynamicTonalPaletteKt.dynamicTonalPalette(context0)) : DynamicTonalPaletteKt.dynamicLightColorScheme34(context0);
    }

    @RequiresApi(0x1F)
    @NotNull
    public static final ColorScheme dynamicLightColorScheme31(@NotNull TonalPalette tonalPalette0) {
        return ColorSchemeKt.lightColorScheme-C-Xl9yA$default(tonalPalette0.getPrimary40-0d7_KjU(), tonalPalette0.getPrimary100-0d7_KjU(), tonalPalette0.getPrimary90-0d7_KjU(), tonalPalette0.getPrimary10-0d7_KjU(), tonalPalette0.getPrimary80-0d7_KjU(), tonalPalette0.getSecondary40-0d7_KjU(), tonalPalette0.getSecondary100-0d7_KjU(), tonalPalette0.getSecondary90-0d7_KjU(), tonalPalette0.getSecondary10-0d7_KjU(), tonalPalette0.getTertiary40-0d7_KjU(), tonalPalette0.getTertiary100-0d7_KjU(), tonalPalette0.getTertiary90-0d7_KjU(), tonalPalette0.getTertiary10-0d7_KjU(), tonalPalette0.getNeutralVariant98-0d7_KjU(), tonalPalette0.getNeutralVariant10-0d7_KjU(), tonalPalette0.getNeutralVariant98-0d7_KjU(), tonalPalette0.getNeutralVariant10-0d7_KjU(), tonalPalette0.getNeutralVariant90-0d7_KjU(), tonalPalette0.getNeutralVariant30-0d7_KjU(), tonalPalette0.getPrimary40-0d7_KjU(), tonalPalette0.getNeutralVariant20-0d7_KjU(), tonalPalette0.getNeutralVariant95-0d7_KjU(), 0L, 0L, 0L, 0L, tonalPalette0.getNeutralVariant50-0d7_KjU(), tonalPalette0.getNeutralVariant80-0d7_KjU(), tonalPalette0.getNeutralVariant0-0d7_KjU(), tonalPalette0.getNeutralVariant98-0d7_KjU(), tonalPalette0.getNeutralVariant94-0d7_KjU(), tonalPalette0.getNeutralVariant92-0d7_KjU(), tonalPalette0.getNeutralVariant90-0d7_KjU(), tonalPalette0.getNeutralVariant96-0d7_KjU(), tonalPalette0.getNeutralVariant100-0d7_KjU(), tonalPalette0.getNeutralVariant87-0d7_KjU(), 0x3C00000, 0, null);
    }

    @RequiresApi(34)
    @NotNull
    public static final ColorScheme dynamicLightColorScheme34(@NotNull Context context0) {
        l4 l40 = l4.a;
        long v = l40.a(context0, 0x1060060);
        long v1 = l40.a(context0, 0x1060061);
        long v2 = l40.a(context0, 0x106005E);
        long v3 = l40.a(context0, 0x106005F);
        long v4 = l40.a(context0, 0x106008B);
        long v5 = l40.a(context0, 0x1060064);
        long v6 = l40.a(context0, 0x1060065);
        long v7 = l40.a(context0, 0x1060062);
        long v8 = l40.a(context0, 0x1060063);
        long v9 = l40.a(context0, 0x1060068);
        long v10 = l40.a(context0, 0x1060069);
        long v11 = l40.a(context0, 0x1060066);
        long v12 = l40.a(context0, 0x1060067);
        long v13 = l40.a(context0, 0x106006A);
        long v14 = l40.a(context0, 0x106006B);
        long v15 = l40.a(context0, 0x106006C);
        long v16 = l40.a(context0, 0x106006D);
        long v17 = l40.a(context0, 0x1060075);
        long v18 = l40.a(context0, 0x1060076);
        long v19 = l40.a(context0, 0x1060097);
        long v20 = l40.a(context0, 0x1060098);
        long v21 = l40.a(context0, 0x1060077);
        long v22 = l40.a(context0, 0x10600C0);
        long v23 = l40.a(context0, 0x1060073);
        long v24 = l40.a(context0, 0x1060074);
        long v25 = l40.a(context0, 0x1060070);
        long v26 = l40.a(context0, 0x1060071);
        long v27 = l40.a(context0, 0x1060072);
        long v28 = l40.a(context0, 0x106006E);
        long v29 = l40.a(context0, 0x106006F);
        return ColorSchemeKt.lightColorScheme-C-Xl9yA$default(v, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, l40.a(context0, 0x1060060), v19, v20, 0L, 0L, 0L, 0L, v21, v22, 0L, v23, v25, v26, v27, v28, v29, v24, 0x13C00000, 0, null);
    }

    @RequiresApi(0x1F)
    @NotNull
    public static final TonalPalette dynamicTonalPalette(@NotNull Context context0) {
        return new TonalPalette(l4.a.a(context0, 0x106001D), l4.a.a(context0, 0x106001E), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060025), 98.0f), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060025), 96.0f), l4.a.a(context0, 0x106001F), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060025), 94.0f), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060025), 92.0f), l4.a.a(context0, 0x1060020), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060025), 87.0f), l4.a.a(context0, 0x1060021), l4.a.a(context0, 0x1060022), l4.a.a(context0, 0x1060023), l4.a.a(context0, 0x1060024), l4.a.a(context0, 0x1060025), l4.a.a(context0, 0x1060026), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060025), 24.0f), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060025), 22.0f), l4.a.a(context0, 0x1060027), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060025), 17.0f), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060025), 12.0f), l4.a.a(context0, 0x1060028), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060025), 6.0f), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060025), 4.0f), l4.a.a(context0, 0x1060029), l4.a.a(context0, 0x106002A), l4.a.a(context0, 0x106002B), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060032), 98.0f), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060032), 96.0f), l4.a.a(context0, 0x106002C), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060032), 94.0f), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060032), 92.0f), l4.a.a(context0, 0x106002D), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060032), 87.0f), l4.a.a(context0, 0x106002E), l4.a.a(context0, 0x106002F), l4.a.a(context0, 0x1060030), l4.a.a(context0, 0x1060031), l4.a.a(context0, 0x1060032), l4.a.a(context0, 0x1060033), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060032), 24.0f), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060032), 22.0f), l4.a.a(context0, 0x1060034), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060032), 17.0f), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060032), 12.0f), l4.a.a(context0, 0x1060035), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060032), 6.0f), DynamicTonalPaletteKt.setLuminance-DxMtmZc(l4.a.a(context0, 0x1060032), 4.0f), l4.a.a(context0, 0x1060036), l4.a.a(context0, 0x1060037), l4.a.a(context0, 0x1060038), l4.a.a(context0, 0x1060039), l4.a.a(context0, 0x106003A), l4.a.a(context0, 0x106003B), l4.a.a(context0, 0x106003C), l4.a.a(context0, 0x106003D), l4.a.a(context0, 0x106003E), l4.a.a(context0, 0x106003F), l4.a.a(context0, 0x1060040), l4.a.a(context0, 0x1060041), l4.a.a(context0, 0x1060042), l4.a.a(context0, 0x1060043), l4.a.a(context0, 0x1060044), l4.a.a(context0, 0x1060045), l4.a.a(context0, 0x1060046), l4.a.a(context0, 0x1060047), l4.a.a(context0, 0x1060048), l4.a.a(context0, 0x1060049), l4.a.a(context0, 0x106004A), l4.a.a(context0, 0x106004B), l4.a.a(context0, 0x106004C), l4.a.a(context0, 0x106004D), l4.a.a(context0, 0x106004E), l4.a.a(context0, 0x106004F), l4.a.a(context0, 0x1060050), l4.a.a(context0, 0x1060051), l4.a.a(context0, 0x1060052), l4.a.a(context0, 0x1060053), l4.a.a(context0, 0x1060054), l4.a.a(context0, 0x1060055), l4.a.a(context0, 0x1060056), l4.a.a(context0, 0x1060057), l4.a.a(context0, 0x1060058), l4.a.a(context0, 0x1060059), l4.a.a(context0, 0x106005A), l4.a.a(context0, 0x106005B), l4.a.a(context0, 0x106005C), l4.a.a(context0, 0x106005D), null);
    }

    public static final long setLuminance-DxMtmZc(long v, @FloatRange(from = 0.0, to = 100.0) float f) {
        int v1 = 1;
        int v2 = Double.compare(f, 0.0001) >= 0 ? 0 : 1;
        if(((double)f) <= 99.9999) {
            v1 = 0;
        }
        if((v2 | v1) != 0) {
            float f1 = (f + 16.0f) / 116.0f;
            double f2 = (double)((f1 * f1 * f1 > 0.008856f ? f1 * f1 * f1 : (116.0f * f1 - 16.0f) / 903.296326f) * 100.0f / 100.0f);
            int v3 = MathUtils.clamp(c.roundToInt((f2 <= 0.003131 ? f2 * 12.92 : Math.pow(f2, 0.416667) * 1.055 - 0.055) * 255.0), 0, 0xFF);
            return ColorKt.Color$default(v3, v3, v3, 0, 8, null);
        }
        long v4 = Color.convert-vNxB06k(v, ColorSpaces.INSTANCE.getCieLab());
        return Color.convert-vNxB06k(ColorKt.Color$default(f, Color.getGreen-impl(v4), Color.getBlue-impl(v4), 0.0f, ColorSpaces.INSTANCE.getCieLab(), 8, null), ColorSpaces.INSTANCE.getSrgb());
    }
}

